package co.interfac;

import java.util.ArrayList;
import co.Entidades.Turma;

public interface ITurmaRepositorio {
    void salvar(Turma turma);
    Turma buscarPorNome(String nomeTurma);
    boolean removerTurma(Turma turma);
    void atualizar(Turma turma);
   ArrayList<Turma> listarTodas();
}
