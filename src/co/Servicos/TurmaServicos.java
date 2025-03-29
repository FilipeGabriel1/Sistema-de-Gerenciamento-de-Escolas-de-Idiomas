package co.Servicos;

import java.util.List;
import co.Entidades.Turma;
import co.Entidades.Aluno;
import co.Repositorio.TurmaRepositorio;
import co.interfac.ITurmaServicos;

public class TurmaServicos implements ITurmaServicos {

    private TurmaRepositorio turmaRepositorio;

    public TurmaServicos(TurmaRepositorio turmaRepositorio) {
        this.turmaRepositorio = turmaRepositorio;
    }

    public void salvar(Turma turma) {
        if (turma == null) {
            System.out.println("Turma inválida. Não pode ser salva.");
            return;
        }
    
        if (turma.getCapacidadeMaxAlunos() <= 0) {
            System.out.println("Capacidade máxima de alunos inválida. Turma não pode ser salva.");
            return;
        }
    
        if (turma.getNomeTurma() == null || turma.getNomeTurma().trim().isEmpty()) {
            System.out.println("Nome da turma inválido. Turma não pode ser salva.");
            return;
        }
    
        if (turma.isLotada()) {
            System.out.println("A turma já está lotada. Não pode ser salva.");
            return;
        }
    
        turmaRepositorio.salvar(turma);
        System.out.println("Turma " + turma.getNomeTurma() + " salva com sucesso!");
    }

    public void atualizar(Turma turma) {
        turmaRepositorio.atualizar(turma);
    }

    public Turma buscarPorNome(String nomeTurma) {
        return turmaRepositorio.buscarPorNome(nomeTurma);
    }

    public void ListarTurmas(){
        for (Turma turma : turmaRepositorio.listarTodas()) {
            System.out.println("Turma: " + turma.getNomeTurma());
        }
    }

    public void adicionarAlunoATurma(Turma turma, Aluno aluno) {
        if (!turma.isLotada()) {
            turma.adicionarAluno(aluno);
            turmaRepositorio.atualizar(turma);
        } else {
            System.out.println("Capacidade máxima de alunos atingida para a turma: " + turma.getNomeTurma());
        }
    }

    public void removerAluno(Turma turma, Aluno aluno) {
        turma.removerAluno(aluno);
        turmaRepositorio.atualizar(turma);
    }

    public void remover(Turma turma) {
        turmaRepositorio.removerTurma(turma);
    }

    public boolean deletarTurma(String nomeTurma) {
        Turma turma = turmaRepositorio.buscarPorNome(nomeTurma);
        if (turma != null) {
            turmaRepositorio.removerTurma(turma);
            System.out.println("Turma removida: " + nomeTurma);
            return true;
        } else {
            System.out.println("Turma não encontrada: " + nomeTurma);
            return false;
        }
       
    }

    public boolean alterarTurma(String nomeTurma, int novaCapacidadeMaxAlunos) {
        Turma turma = turmaRepositorio.buscarPorNome(nomeTurma);
    
        if (turma == null) {
            System.out.println("Turma não encontrada: " + nomeTurma);
            return false;
        }
    
        if (novaCapacidadeMaxAlunos <= 0) {
            System.out.println("Capacidade máxima de alunos inválida. Alteração não pode ser realizada.");
            return false;
        }
    
        if (turma.getAlunos().size() > novaCapacidadeMaxAlunos) {
            System.out.println("A nova capacidade máxima é menor que o número atual de alunos. Alteração não pode ser realizada.");
            return false;
        }
    
        turma.setCapacidadeMaxAlunos(novaCapacidadeMaxAlunos);
        turmaRepositorio.atualizar(turma);
        System.out.println("Turma " + nomeTurma + " alterada com sucesso!");
        return true;
    }
}