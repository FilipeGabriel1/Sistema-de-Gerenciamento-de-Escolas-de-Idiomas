package co.Servicos;


import co.Entidades.Curso;

import co.Entidades.Professor;
import co.interfac.IProfessorRepositorio;

public class ProfessorServicos extends Curso {

    private IProfessorRepositorio professorRepositorio;

    public ProfessorServicos(IProfessorRepositorio professorRepositorio) {
        this.professorRepositorio = professorRepositorio;
    }

    public void salvar(Professor professor) {
        this.professorRepositorio.salvar(professor);
    }

    public void cadastrar(Professor professor, int id, String nome, String sobrenome,  int anosExperiencia, String diasDeTrabalho, String horarioDeTrabalho, String cursoLecionado) {

        professor.setId(id);
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setCursoLecionado(cursoLecionado);
        professor.setAnosExperiencia(anosExperiencia);
        professor.setDiasDeTrabalho(diasDeTrabalho);
        professor.setHorarioDeTrabalho(horarioDeTrabalho);
    
        System.out.println("Professor cadastrado com sucesso!");    
        
        if (invalidarID(professor.getId())) {
            System.out.println("ID invalido, Professor nao pode ser cadastrado");
            return;     
        }

        if (isBlank(professor.getNome()) || isBlank(professor.getSobrenome())) {
            System.out.println("Nome ou Sobrenome Invalido, Professor nao pode ser cadastrado");
            return; 
        }

        if (isBlank(professor.getNome()) || isBlank(professor.getSobrenome())) {
            System.out.println("Nome ou Sobrenome Invalido, Professor nao pode ser cadastrado");
            return;
        }
    
        if (isAnosExperienciaInvalido(professor.getAnosExperiencia())) {
            System.out.println("Anos de Experiência Inválido, Professor nao pode ser cadastrado");
            return;
        }

        if (isDiasDeTrabalhoInvalido(professor.getDiasDeTrabalho())) {
            System.out.println("Dias de Trabalho Inválido, Professor nao pode ser cadastrado");
            return;
        }

        if (isHorarioDeTrabalhoInvalido(professor.getHorarioDeTrabalho())) {
            System.out.println("Horário de Trabalho Inválido, Professor nao pode ser cadastrado");
            return;
        }     

         Professor professorPesquisado = this.professorRepositorio.buscarProfessorPorNome(professor.getNome(),professor.getSobrenome());

            if (professorPesquisado == null) {
                this.salvar(professor);
               
            }

            System.out.println("ID: " + professor.getId());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Sobrenome: " + professor.getSobrenome());
            System.out.println("Curso Lecionado: " + professor.getCursoLecionado());
            System.out.println("Anos de Experiência: " + professor.getAnosExperiencia());
            System.out.println("Dias de Trabalho: " + professor.getDiasDeTrabalho());
            System.out.println("Horário de Trabalho: " + professor.getHorarioDeTrabalho());
        }

        public boolean deletarProfessor(Professor professor) {
           Professor professorPesquisado = this.professorRepositorio.buscarProfessorPorNome(professor.getNome(), professor.getSobrenome());

            if (professorPesquisado != null) {
              System.out.println("Professor deletado com Sucesso! ");
              return this.professorRepositorio.removerProfessor(professor);
            }
            else {
              System.out.println("Professor Inexistente! ");
              return false;
            }
          }

          public void listarProfessores(){
            for (Professor professor: this.professorRepositorio.listarTodosProfessores()){
                    System.out.println("Nome: " + professor.getNome() + " " + " Sobrenome: " + professor.getSobrenome());
                    
                
                 
            }
        }

    private boolean invalidarID(int id){
        String idString = String.valueOf(id);
        return id <= 0 || idString.length() < 5;
    }

    private boolean isBlank(String string){
        return string == null || string.trim().isEmpty();
    }

      private boolean isAnosExperienciaInvalido(int anosExperiencia) {
        return anosExperiencia < 0;
    }

    private boolean isDiasDeTrabalhoInvalido(String diasDeTrabalho) {
        return isBlank(diasDeTrabalho);
    }

    private boolean isHorarioDeTrabalhoInvalido(String horarioDeTrabalho) {
        return isBlank(horarioDeTrabalho);
    }
}
