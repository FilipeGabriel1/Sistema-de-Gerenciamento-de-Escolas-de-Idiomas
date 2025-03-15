package co.Servicos;




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

    public void matricular(Aluno aluno, int matricula, String nome, String sobrenome, int idade, int mensalidade, Curso nomeCurso, Turma turma) {
          
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

                aluno.setTurmas(turma);
                turma.adicionarAluno(aluno);
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Sobrenome: " + aluno.getSobrenome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Mensalidade: " + aluno.getMensalidade());
                System.out.println("Curso: " + aluno.getCursos().getNomeCurso());
                System.out.println("Turma: " + aluno.getTurmas().getNomeTurma());  
    
             
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

            
            public void listarAlunos(){
                for (Aluno aluno : this.alunoRepositorio.listarTodosAlunos()){
                    System.out.println("Nome: " + aluno.getNome() + " " + " Sobrenome: " + aluno.getSobrenome()); ;
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

}
    
     
       
    
        

       
        
    


