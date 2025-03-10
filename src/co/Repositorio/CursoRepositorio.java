package co.Repositorio;

import java.util.ArrayList;
import java.util.List;

import co.Entidades.Curso;

public class CursoRepositorio {

    private List<Curso> listaCursos = new ArrayList<Curso>();

   

    public void adicionarCurso(Curso curso) {
        if (curso != null) {
            listaCursos.add(curso);
            System.out.println("Curso Salvo: ");
        } else {
            System.out.println("Nome do curso não definido");
        }
    }
    
   
  

    public List<Curso> listarCursos(){
        return listaCursos;
    }

    public void adicionarCursoPadrao(Curso curso){
       adicionarCurso(curso);
    }
    
}

