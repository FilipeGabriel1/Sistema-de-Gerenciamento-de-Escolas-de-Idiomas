package co.Servicos;

import co.Entidades.Aluno;
import co.Entidades.Turmas;


public abstract class AlunoServicos extends Turmas {

    public void matricular(Aluno aluno) {
           if (aluno.getIdade()> 14) {
            aluno.setMatricula(0);
           }
        }
    
        public void mensalidade(Aluno aluno){
            aluno.setMensalidade(0);
        }

        public void turma(Turmas aluno){
           aluno.setTurma(getTurma());;
        }
    }


