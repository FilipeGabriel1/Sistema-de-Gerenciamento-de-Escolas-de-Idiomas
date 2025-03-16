package co.Repositorio;

import java.util.ArrayList;
import co.Entidades.Curso;
import co.interfac.ICursoRepositorio;

public class CursoRepositorio implements ICursoRepositorio {

    private ArrayList<Curso> cursos;

    public CursoRepositorio(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

     
    public void salvar(Curso curso){
       this.cursos.add(curso);
    }

     public Curso buscarCursoPorNome(String nome) {
        for (Curso curso : cursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(nome)) {
                return curso;
            }
            else {
                System.out.println("ARRAY LIST VAZIO !");
            }
        }
        return null;
    }
   

   
    public ArrayList<Curso> listarTodosCursos(){
        return cursos;
    }

    public boolean removerCurso(Curso curso){
        return cursos.remove(curso);
    }
   
    
}

