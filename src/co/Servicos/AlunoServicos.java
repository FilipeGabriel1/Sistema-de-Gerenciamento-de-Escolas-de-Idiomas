package co.Servicos;

import java.util.Scanner;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma;
import co.Repositorio.AlunoRepositorio;
import co.interfac.IAlunoRepositorio;

public class AlunoServicos extends Curso{

    private IAlunoRepositorio alunoRepositorio;

    public AlunoServicos(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }
    
    public void salvar(Aluno aluno){
        this.alunoRepositorio.salvar(aluno);
    }

    public void matricular(Aluno aluno, int matricula, String nome, String sobrenome, int idade, int mensalidade, Curso nomeCurso, Turma turma, String cpf) {
          
            aluno.setCpf(cpf);
            aluno.setAtivo(true);
            aluno.setMatricula(matricula);
            aluno.setNome(nome);
            aluno.setSobrenome(sobrenome);
            aluno.setIdade(idade);
            aluno.setMensalidade(mensalidade);
            aluno.setCursos(nomeCurso);
            aluno.setTurmas(turma);
            
            if (aluno.getIdade() < 14) {
                System.out.println("Aluno menor de 14 anos, nao pode ser matriculado");
                return;
            } 

            if (aluno.getIdade() < 18) {
                try {
                    adicionarResponsavel(aluno);
                } catch (Exception e) {
                    System.out.println("Erro ao adicionar responsáveis: " + e.getMessage());
                    return;
                }
                
            }

            if (!invalidarcpfAluno(aluno.getCpf())) {
                System.out.println("CPF invalido, Aluno nao pode ser cadastrado");
                
            }
            

            if (!isValidMatricula(aluno.getMatricula())) {
                System.out.println("Matricula invalida, Aluno nao pode ser matriculado");
                return;
            }

            if (isBlank(aluno.getNome()) || isBlank(aluno.getSobrenome())) {
                System.out.println("Nome ou Sobrenome Invalido, Aluno nao pode ser matriculado");
                return; 
            }

            if (invalidarMensalidade(mensalidade)) {
                System.out.println("Mensalidade invalida, Aluno nao pode ser matriculado");
                return;   
            }

            if (aluno.getTurmas().getCapacidadeMaxAlunos() > 30) {
                System.out.println("Turma Lotada, Aluno nao pode ser matriculado");
                return;  
            }

            if (turma.isLotada()){
                System.out.println("Turma Lotada, Aluno nao pode ser matriculado");
                return;
            }

            Aluno alunoPesquisado = this.alunoRepositorio.buscarAlunoPorNome(aluno.getNome(),aluno.getSobrenome());

            if (alunoPesquisado == null) {
                this.salvar(aluno);
                System.out.println("Aluno Matriculado com Sucesso! ");

                aluno.setAtivo(true);
                aluno.setTurmas(turma);
                turma.adicionarAluno(aluno);
                nomeCurso.adicionarAluno(aluno);
                
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Sobrenome: " + aluno.getSobrenome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Mensalidade: " + aluno.getMensalidade());
                System.out.println("Curso: " + aluno.getCursos().getNomeCurso());
                System.out.println("Turma: " + aluno.getTurmas().getNomeTurma());   

                if (aluno.getIdade() < 18) {
                    System.out.println("Responsáveis: " + aluno.getResponsavel()); 
                    
                }
                }
            }

            public boolean deletarAluno(Aluno aluno){
              Aluno alunoPesquisado = this.alunoRepositorio.buscarAlunoPorNome(aluno.getNome(), aluno.getSobrenome());

              if (alunoPesquisado != null) {
                System.out.println("Aluno deletado com Sucesso! ");
                return this.alunoRepositorio.removerAluno(aluno);
              }
              else {
                System.out.println("Aluno Inexistente! ");
                return false;
              }
            }

            public void inativarAluno(Aluno aluno){
                Aluno alunoPesquisado = this.alunoRepositorio.buscarAlunoPorNome(aluno.getNome(), aluno.getSobrenome());

                if (alunoPesquisado != null) {
                    aluno.setAtivo(false);
                    System.out.println("Aluno Desativado com Sucesso! ");
                }
                else {
                    System.out.println("Aluno Inexistente! ");
                }
            }

            public void listarAlunosDesativados(){
                for (Aluno aluno : this.alunoRepositorio.listarTodosAlunos()){
                    if (!aluno.isAtivo()) {
                        System.out.println("Nome: " + aluno.getNome() + " " + " Sobrenome: " + aluno.getSobrenome());
                    }
                }
            }

            
            public void listarAlunos(){
                for (Aluno aluno : this.alunoRepositorio.listarTodosAlunos()){
                    if (aluno.isAtivo()) {
                        System.out.println("Nome: " + aluno.getNome() + " " + " Sobrenome: " + aluno.getSobrenome());            
                    }      
                }
            }
            
            private boolean isValidMatricula(int matricula) {
        String matriculaString = String.valueOf(matricula);
        return matriculaString.length() == 6;
    }

           private boolean isBlank(String string){
        return string == null || string.trim().isEmpty();
    }

    private boolean invalidarMensalidade(int mensalidade){
        String mensalidadeString = String.valueOf(mensalidade);
        return mensalidade <= 0 || mensalidadeString.length() < 3;
    }

    private boolean invalidarCelular(int celular){
        String celularString = String.valueOf(celular);
        return celular <= 0 || celularString.length() < 8;
    }

    private boolean invalidarcpfAluno(String cpf){
        return cpf == null || cpf.length() != 12;
    }

    public boolean invalidarcpfResponsavel(String cpf){
        return cpf == null || cpf.length() != 11;
    }
    private void adicionarResponsavel(Aluno aluno) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aluno: " + aluno.getNomeCompleto() + " é menor de 18 anos. Por favor, adicione o(s) nome(s), CPF(s) e Telefone(s) do(s) responsavel/ responsaveis:");
        boolean responsavelAdicionado = false;
        while (true) {
            System.out.print("Nome e depois o Sobrenome do responsável (ou 'fim' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            String sobrenome = scanner.nextLine();
            System.out.println("CPF do responsável: ");
            String cpfResponsavel = scanner.nextLine();
            if (invalidarcpfResponsavel(cpfResponsavel)) {
                System.out.println("CPF inválido. Por favor, tente novamente.");
                continue;
            }
            System.out.println("Telefone do responsável: ");
            int celularResponsavel = Integer.parseInt(scanner.nextLine());
            if (invalidarCelular(celularResponsavel)) {
                System.out.println("Telefone inválido. Por favor, tente novamente.");
                continue;
            }
            aluno.adicionarResponsavel(nome, sobrenome, cpfResponsavel, celularResponsavel);
            responsavelAdicionado = true;
        }
        if (!responsavelAdicionado) {
            throw new Exception("É necessário adicionar pelo menos um responsável para alunos menores de 18 anos.");
        }
    }
  

        }
    
   



    
       
    
        

       
        
    


