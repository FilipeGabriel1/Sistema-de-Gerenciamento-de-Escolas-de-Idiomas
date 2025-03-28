package co.Repositorio;

import java.util.ArrayList;
import java.util.List;

import co.Entidades.Curso;
import co.interfac.ICursoRepositorio;

public class CursoRepositorio implements ICursoRepositorio {

    private ArrayList<Curso> cursos;

    public CursoRepositorio(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
   
    public void salvar(Curso curso){
        if (!cursos.contains(curso)) {
            this.cursos.add(curso);
        } else {
            System.out.println("Curso já existe na lista.");
            
        }
      
       
    }

   
     public Curso buscarCursoPorNome(String nome) {
        for (Curso curso : cursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(nome.trim())) {
                return curso;
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

    public void alterarCurso(Curso c) {
        for (Curso curso : this.cursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(c.getNomeCurso())) {
                curso.setNomeCurso(c.getNomeCurso());
                curso.setHorario(c.getHorario());
                curso.setCapacidadeMaxAlunos(c.getCapacidadeMaxAlunos());
                curso.setCapacidadeMaxAlunosPorTurma(c.getCapacidadeMaxAlunosPorTurma());
                curso.setDiaDasAulas(c.getDiaDasAulas());
                curso.setTurma(c.getTurma());
                return;
            }
        }
    }
}
