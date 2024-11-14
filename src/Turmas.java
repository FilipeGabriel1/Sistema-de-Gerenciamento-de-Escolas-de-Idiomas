public abstract class Turmas extends Pessoa   {

    private double matricula;
    private double mensalidade;
    private double rendaMensal;
    private double gastoMensal;

    
    public Turmas (){

    }   

    public Turmas (double matricula, double mensalidade, double rendaMensal, double gastoMensal){

      this.matricula = matricula;
      this.mensalidade = mensalidade;
      this.rendaMensal = rendaMensal;
      this.gastoMensal = gastoMensal;

}

public double getMatricula() {
    return matricula;
}

public void setMatricula(double matricula) {
    this.matricula = matricula;
}

public double getMensalidade() {
    return mensalidade;
}

public void setMensalidade(double mensalidade) {
    this.mensalidade = mensalidade;
}

public double getRendaMensal() {
    return rendaMensal;
}

public void setRendaMensal(double rendaMensal) {
    this.rendaMensal = rendaMensal;
}

public double getGastoMensal() {
    return gastoMensal;
}

public void setGastoMensal(double gastoMensal) {
    this.gastoMensal = gastoMensal;
}

public abstract void IdentificarAluno(Aluno aluno);

public abstract void ExibiIdentificacao();

    }

