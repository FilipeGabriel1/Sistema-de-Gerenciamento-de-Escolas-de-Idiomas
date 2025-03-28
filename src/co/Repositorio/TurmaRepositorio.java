package co.Repositorio;

import java.util.ArrayList;
import java.util.List;
import co.Entidades.Turma;
import co.interfac.ITurmaRepositorio;



public class TurmaRepositorio implements ITurmaRepositorio{

    private ArrayList<Turma> turmas;

    public TurmaRepositorio(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public void salvar(Turma turma) {
        this.turmas.add(turma);
    }

    public Turma buscarPorNome(String nomeTurma) {
        for (Turma turma : turmas) {
            if (turma.getNomeTurma().equalsIgnoreCase(nomeTurma.trim())) {
                return turma;
            }
        }
        return null;
    }
        
        public boolean removerTurma(Turma turma) {
            return turmas.remove(turma);
        }

    public void atualizar(Turma turma) {
        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getNomeTurma().equals(turma.getNomeTurma())) {
                turmas.set(i, turma);
                return;
            }
        }
    }

    

    public ArrayList<Turma> listarTodas() {
        return turmas;
    }

   
}
