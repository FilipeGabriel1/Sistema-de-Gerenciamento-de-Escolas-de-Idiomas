package co.Entidades;

public enum Turmas {

    TURMA_A("Turma A"), TURMA_B("Turma B"), TURMA_C("Turma C"), TURMA_D("Turma D");

    private String turma;

    Turmas(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
