package co.Repositorio;

import java.util.ArrayList;
import co.Entidades.Aluno;
import co.interfac.IAlunoRepositorio;


public class AlunoRepositorio implements IAlunoRepositorio {

    private ArrayList<Aluno> alunos;

    public AlunoRepositorio(ArrayList<Aluno> alunos) {
       this.alunos = alunos;
    }
    
    public void salvar(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Aluno buscarAlunoPorNome(String nome, String sobrenome) {
        if (this.alunos != null) {
            for (Aluno aluno : this.alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome) && aluno.getSobrenome().equalsIgnoreCase(sobrenome)) {
                    return aluno;
                }
            }
        } else {
            System.out.println("ARRAY LIST VAZIO !");
        }
        return null;
    }

            public ArrayList<Aluno> listarTodosAlunos(){
                return alunos;
            
        }

        public boolean removerAluno(Aluno aluno){
            return alunos.remove(aluno);
}

        public boolean desativarAluno(Aluno aluno){
            aluno.setAtivo(false);
            return true;
        }

    }


    
    

