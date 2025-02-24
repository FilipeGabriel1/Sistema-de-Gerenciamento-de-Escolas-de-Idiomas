package co.Arraylist;

import co.Entidades.Pessoa;

public class Aluno extends Pessoa{

        
    private double matricula;
    private double mensalidade;
    private double rendaMensal;
    

  
    
   

    public Aluno (){
      super();

    }

    public Aluno (double matricula, double mensalidade, double rendaMensal){
      
      

      this.matricula = matricula;
      this.mensalidade = mensalidade;
      this.rendaMensal = rendaMensal;
    
     

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

   

    
}
