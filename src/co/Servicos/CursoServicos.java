package co.Servicos;

import java.util.List;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma; 
import co.Repositorio.CursoRepositorio;
import co.interfac.ICursoRepositorio;

public class CursoServicos extends Aluno {

    private ICursoRepositorio cursoRepositorio;

   public CursoServicos(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
   }

      public void salvar(Curso curso){
        this.cursoRepositorio.salvar(curso);
    }
      public void adicionarCurso(Curso curso, String horario, int capacidadeMaxAlunos, String nomeCurso, List<Turma> turma) {

        curso.setHorario(horario);
        curso.setCapacidadeMaxAlunos(capacidadeMaxAlunos);
        curso.setNomeCurso(nomeCurso);
        curso.setTurmas(turma);
        salvar(curso);

        if (isBlank(horario)) {
            System.out.println("Horário não pode ficar em branco, Adicione o Horario do Curso");
            return;
        
      }

      if (capacidadeMaxAlunos <= 0) {
        System.out.println("Capacidade Maxima de Alunos Invalida, Adicione a Capacidade Maxima de Alunos");
        return;        
      }

      else if (capacidadeMaxAlunos > 30) {
        System.out.println("Capacidade Maxima de Alunos Ultrapassada, O Curso nao pode ter mais Alunos");
        return;        
      }

      if (isBlank(curso.getNomeCurso())) {
        System.out.println("Nome do Curso nao pode ficar em branco, Adicione o Nome do Curso");
        return;  
      }

        if (turma.size() == 0) {
            System.out.println("Turma nao pode ficar em branco, Adicione a Turma do Curso");
            return;
           }

           else if (turma.size() > capacidadeMaxAlunos) {
            System.out.println("Capacidade Maxima de Alunos Ultrapassada, A Turma esta lotada");
            return;
            
            }
        }
    

        public void listarAlunosDoCurso(Curso curso) {
            System.out.println("Alunos matriculados no curso " + curso.getNomeCurso() + ":");
            for (Turma turma : curso.getTurma()) {
                for (Aluno aluno : turma.getAlunos()) {
                    System.out.println(aluno.getNome() + " " + aluno.getSobrenome());
                }
            }
        }
    
    public boolean deletarCurso(Curso curso) {
        Curso cursoPesquisado = this.cursoRepositorio.buscarCursoPorNome(curso.getNomeCurso());
        if (cursoPesquisado != null) {
          System.out.println("Curso deletado com Sucesso! ");
          return this.cursoRepositorio.removerCurso(curso);
        }
        else {
          System.out.println("Curso Inexistente! ");
          return false;
        }
       
        }
    
    private boolean isBlank(String string) {
        return string == null || string.trim().isEmpty();
    }

    public void listarCursos(){
        for (Curso curso: this.cursoRepositorio.listarTodosCursos()){
                System.out.println("Nome: " + curso.getNomeCurso() + " " + " Horario: " + curso.getHorario() + " " + " Capacidade Maxima de Alunos: " + curso.getCapacidadeMaxAlunos() + " " + " Turma: " + curso.getTurma());
  
             
        }
      
             
        }
    }
       




