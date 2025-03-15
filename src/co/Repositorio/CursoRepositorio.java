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
    
    public Curso buscarCursoPorNome(String nome, List<Curso> cursos) {
        for (Curso curso : cursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public void buscarCursoPorNome(String nome) {
        for (Curso curso : listaCursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(nome)) {
                System.out.println("Curso encontrado: " + curso.getNomeCurso());
            }
        }
    }

    public void deletarCurso(String nome){
        listaCursos.removeIf(curso -> curso.getNomeCurso().contains(nome));
        System.out.println("Curso deletado");
    }

    public List<Curso> listarCursos(){
        return listaCursos;
    }

    
}

