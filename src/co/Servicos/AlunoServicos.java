package co.Servicos;

import java.util.List;

import co.Entidades.Aluno;
import co.Entidades.CursosPrincipais;
import co.Entidades.Turmas;
import co.Repositorio.AlunoRepositorio;




public class AlunoServicos {

    private AlunoRepositorio alunoRepositorio;

    public AlunoServicos(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    public void matricular(Aluno aluno, int matricula, String nome, String sobrenome, int idade, int mensalidade, CursosPrincipais curso, Turmas turmas) {
          
            aluno.setMatricula(matricula);
            aluno.setNome(nome);
            aluno.setSobrenome(sobrenome);
            aluno.setIdade(idade);
            aluno.setMensalidade(mensalidade);
            aluno.setCurso(curso);
            aluno.setTurmas(turmas);

            if (aluno.getIdade() < 14) {
                System.out.println("Aluno menor de 14 anos, nao pode ser matriculado");
            } else {
                System.out.println("Aluno matriculado com sucesso, informações do dado do aluno abaixo:");

                alunoRepositorio.adicionarAluno(aluno);
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Sobrenome: " + aluno.getSobrenome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Mensalidade: " + aluno.getMensalidade());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Turma: " + aluno.getTurmas());
          
            }
        }
        
    

      public Aluno buscarAlunoPorNome(String nome){
        return alunoRepositorio.buscarAlunoPorNome(nome);
      }
    
      public void inativarAluno(String nome){
        alunoRepositorio.inativarAluno(nome);
      
        }

        public void deletarAluno(String nome){
            alunoRepositorio.deletarAluno(nome);
        }

        public List<Aluno> listarAlunosInativos() {
        return alunoRepositorio.listarAlunosInativos();
    }
      
}
    
     
       
    
        

       
        
    


