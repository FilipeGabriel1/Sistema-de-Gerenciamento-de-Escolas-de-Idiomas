package co.Repositorio;

import java.util.List;
import java.util.ArrayList;

import co.Entidades.Aluno;
import co.interfac.ITurmas;

public class AlunoRepositorio implements ITurmas<AlunoRepositorio> {

    private List<Aluno> listaAlunos = new ArrayList<Aluno>();
    private List<Aluno> listaAlunosInativos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);

        System.out.println("Aluno Salvo: " +aluno.getNomeCompleto().toUpperCase());
    }

    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        
            else {
                return null;
            }
        }
        return null;
    }

    public void deletarAluno(String nome){
        listaAlunos.removeIf(aluno -> aluno.getNome().contains(nome));
        System.out.println("Aluno deletado");
    }

    public void inativarAluno(String nome) {
        listaAlunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        System.out.println("Aluno Desativado do sistema: " + nome);
    }
    

    public List<Aluno> listarAlunos(){
        return listaAlunos;
    }

    public List<Aluno> listarAlunosInativos(){
        return listaAlunosInativos;
    }
}

