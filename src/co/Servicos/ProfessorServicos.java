package co.Servicos;


import co.Entidades.Professor;

public class ProfessorServicos extends Professor {


    public void cadastrar(Professor professor, int id, String nome, String sobrenome, String disciplinaLecionada){

        professor.setId(id);
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setDisciplinaLecionada(disciplinaLecionada);
        
       
    }
    public void cargoAtual(Professor professor, String cargoAtual){
        professor.setCargoAtual(cargoAtual);
    }

    public void anosExperiencia(Professor professor, int anosExperiencia){
        professor.setAnosExperiencia(anosExperiencia);
    }

    public void diasDeTrabalho(Professor professor, String diasDeTrabalho){
        professor.setDiasDeTrabalho(diasDeTrabalho);
    }

    public void horarioDeTrabalho(Professor professor, String horarioDeTrabalho){
        professor.setHorarioDeTrabalho(horarioDeTrabalho);
    }

}
