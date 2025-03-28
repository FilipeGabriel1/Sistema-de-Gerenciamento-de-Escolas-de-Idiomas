package co.interfac;

import java.util.ArrayList;
import java.util.List;

import co.Entidades.Curso;

public interface ICursoRepositorio {

      public void salvar(Curso curso);
    Curso buscarCursoPorNome(String nome);
    public boolean removerCurso(Curso curso);
    public ArrayList<Curso> listarTodosCursos();
    void alterarCurso(Curso curso);
     
}
