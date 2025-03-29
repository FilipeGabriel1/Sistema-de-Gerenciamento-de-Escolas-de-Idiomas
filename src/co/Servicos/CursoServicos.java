package co.Servicos;

import java.util.List;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma; 
import co.Repositorio.CursoRepositorio;
import co.interfac.ICursoRepositorio;
import co.interfac.ICursoServicos;

public class CursoServicos extends Aluno implements ICursoServicos {


    private ICursoRepositorio cursoRepositorio;

    public CursoServicos(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
   }

   public void salvar(Curso curso) {
    if (isBlank(curso.getNomeCurso())) {
        System.out.println("Nome do curso inválido. Curso não pode ser cadastrado.");
        return;
    }

    if (isBlank(curso.getHorario())) {
        System.out.println("Horário do curso inválido. Curso não pode ser cadastrado.");
        return;
    }

    if (isBlank(curso.getDiaDasAulas())) {
        System.out.println("Dias das aulas inválidos. Curso não pode ser cadastrado.");
        return;
    }

    if (curso.getCapacidadeMaxAlunos() <= 0) {
        System.out.println("Capacidade máxima de alunos inválida. Curso não pode ser cadastrado.");
        return;
    }

    if (curso.getCapacidadeMaxAlunosPorTurma() <= 0) {
        System.out.println("Capacidade máxima de alunos por turma inválida. Curso não pode ser cadastrado.");
        return;
    }

    if (curso.getTurma() == null || curso.getTurma().isEmpty()) {
        System.out.println("Nenhuma turma associada ao curso. Curso não pode ser cadastrado.");
        return;
    }

    int totalAlunos = 0;
    for (Turma turma : curso.getTurma()) {
        totalAlunos += turma.getAlunos().size();
        if (turma.getAlunos().size() > curso.getCapacidadeMaxAlunosPorTurma()) {
            System.out.println("Capacidade máxima de alunos por turma ultrapassada. Curso não pode ser cadastrado.");
            return;
        }
    }

    if (totalAlunos > curso.getCapacidadeMaxAlunos()) {
        System.out.println("Capacidade máxima de alunos do curso ultrapassada. Curso não pode ser cadastrado.");
        return;
    }

    cursoRepositorio.salvar(curso);
    System.out.println("Curso cadastrado com sucesso!");
}

    
    public void adicionarCurso(Curso curso, String horario, int capacidadeMaxAlunos, int capacidadeMaxAlunosPorTurma, String nomeCurso, List<Turma> turmas, String diasDasAulas) {

        if (isBlank(diasDasAulas)) {
            System.out.println("Dias das Aulas nao pode ficar em branco, Adicione os Dias das Aulas");
            return;
            
        }
      
      if (isBlank(horario)) {
          System.out.println("Horário não pode ficar em branco, Adicione o Horario do Curso");
          return;
      }

      if (capacidadeMaxAlunos <= 0) {
          System.out.println("Capacidade Maxima de Alunos Invalida, Adicione a Capacidade Maxima de Alunos");
          return;
      }

      if (capacidadeMaxAlunos > capacidadeMaxAlunos) {
          System.out.println("Capacidade Maxima de Alunos Ultrapassada, O Curso nao pode ter mais Alunos");
          return;
      }

      if (isBlank(nomeCurso)) {
          System.out.println("Nome do Curso nao pode ficar em branco, Adicione o Nome do Curso");
          return;
      }

      if (turmas == null || turmas.isEmpty()) {
          System.out.println("Turma nao pode ficar em branco, Adicione a Turma do Curso");
          return;
      }

        int totalAlunos = 0;
        for (Turma turma : turmas) {
            totalAlunos += turma.getAlunos().size();
            if (turma.getAlunos().size() > capacidadeMaxAlunosPorTurma) {
                System.out.println("Capacidade Maxima de Alunos por Turma Ultrapassada, A Turma esta lotada");
                return;
            }
        }

        if (totalAlunos > capacidadeMaxAlunos) {
            System.out.println("Capacidade Maxima de Alunos do Curso Ultrapassada");
            return;
        }

      curso.setDiaDasAulas(diasDasAulas);  
      curso.setHorario(horario);
      curso.setCapacidadeMaxAlunos(capacidadeMaxAlunos);
      curso.setCapacidadeMaxAlunosPorTurma(capacidadeMaxAlunosPorTurma);
      curso.setNomeCurso(nomeCurso);
      curso.setTurma(turmas);
      salvar(curso);

      System.out.println("Curso adicionado com sucesso!");
      System.out.println("Nome do Curso: " + curso.getNomeCurso());
      System.out.println("Horário do curso: " + curso.getHorario());
      System.out.println("Dias das Aulas que o Curso sera ministrado: " + curso.getDiaDasAulas());

      System.out.println("Capacidade máxima de alunos do Curso: " + curso.getCapacidadeMaxAlunos());
      System.out.println("Capacidade máxima de alunos por turma: " + curso.getCapacidadeMaxAlunosPorTurma());
  }

        public void listarAlunosDoCurso(Curso curso) {
          List<Aluno> alunos = curso.getAlunos();
          if (alunos == null || alunos.isEmpty()) {
              System.out.println("Nenhum aluno matriculado neste curso.");
          } else {
              System.out.println("Alunos matriculados no curso " + curso.getNomeCurso() + ":");
              for (Aluno aluno : alunos) {
                  System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome());
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

    public void listarCursos() {
        List<Curso> cursos = this.cursoRepositorio.listarTodosCursos();
      

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            System.out.println("Lista de Cursos:");
            for (Curso curso : cursos){
            System.out.println("Nome: " + curso.getNomeCurso());
            System.out.println("Horário: " + curso.getHorario());
            System.out.println("Dias das Aulas: " + curso.getDiaDasAulas());
            System.out.println("Capacidade máxima de alunos do Curso: " + curso.getCapacidadeMaxAlunos());
            for (Turma turma : curso.getTurma()) {
                System.out.println("Turmas do Curso: " + turma.getNomeTurma());
                System.out.println("Capacidade máxima de alunos da Turma: " + turma.getCapacidadeMaxAlunos());
                System.out.println("Alunos matriculados na turma: "  + turma.getNomeTurma() + ": " + turma.getAlunos().size());
                    System.out.println("-----------");
                    
                    }
                }
            }

            
        }

        public boolean alterar(String horario, int capacidadeMaxAlunos, int capacidadeMaxAlunosPorTurma, String nomeCurso, String diasDasAulas) {
            Curso curso = this.cursoRepositorio.buscarCursoPorNome(nomeCurso);
        
            if (curso != null) {
                if (isBlank(horario)) {
                    System.out.println("Horário inválido. Alteração não pode ser realizada.");
                    return false;
                }
        
                if (isBlank(diasDasAulas)) {
                    System.out.println("Dias das aulas inválidos. Alteração não pode ser realizada.");
                    return false;
                }
        
                if (capacidadeMaxAlunos <= 0) {
                    System.out.println("Capacidade máxima de alunos inválida. Alteração não pode ser realizada.");
                    return false;
                }
        
                if (capacidadeMaxAlunosPorTurma <= 0) {
                    System.out.println("Capacidade máxima de alunos por turma inválida. Alteração não pode ser realizada.");
                    return false;
                }
        
                curso.setDiaDasAulas(diasDasAulas);
                curso.setHorario(horario);
                curso.setCapacidadeMaxAlunos(capacidadeMaxAlunos);
                curso.setCapacidadeMaxAlunosPorTurma(capacidadeMaxAlunosPorTurma);
                curso.setNomeCurso(nomeCurso);
        
                cursoRepositorio.alterarCurso(curso);
                System.out.println("Curso alterado com sucesso!");
                return true;
            } else {
                System.out.println("Curso não encontrado!");
                return false;
            }
        }

        public Curso buscarCursoPorNome(String nomeCurso) {
            return cursoRepositorio.buscarCursoPorNome(nomeCurso);
        }

        public boolean deletarCurso(String nomeCurso) {
            Curso curso = cursoRepositorio.buscarCursoPorNome(nomeCurso);
            if (curso != null) {
                cursoRepositorio.removerCurso(curso);
                System.out.println("Curso removido: " + nomeCurso);
                return true;
            } else {
                System.out.println("Curso não encontrado: " + nomeCurso);
                return false;
            }
    }
}
    
       
       




