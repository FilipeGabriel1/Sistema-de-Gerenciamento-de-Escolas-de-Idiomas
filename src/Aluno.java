public class Aluno extends Pessoa{

        
    private double matricula;
    private double mensalidade;
    private double rendaMensal;
    private double gastoMensal;

  
    
   

    public Aluno (){

    }

    public Aluno (double matricula, double mensalidade, double rendaMensal, double gastoMensal){

      this.matricula = matricula;
      this.mensalidade = mensalidade;
      this.rendaMensal = rendaMensal;
      this.gastoMensal = gastoMensal;
     

    }

    public void setMatricula(double matricula){
      this.matricula = matricula;

    }

    public double getMatricula(){
      return matricula;
    }

    public void setMensalidade(double mensalidade){
      this.mensalidade = mensalidade;

    }

    public double getMensalidade(){
      return mensalidade;
    }

    public void setRendaMensal(double rendaMensal){
      this.rendaMensal = rendaMensal;

    }

    public double getRendaMensal(){
      return rendaMensal;
    }

    public void setGastoMensal(double gastoMensal){
      this.gastoMensal = gastoMensal;

    }

    public double getGastoMensal(){
      return gastoMensal;
    }

   

    
}
