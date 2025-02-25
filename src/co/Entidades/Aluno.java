package co.Entidades;

public class Aluno extends Pessoa{

        
    private double matricula;
    private double mensalidade;
   
    

  
    
   

    public Aluno (){
      super();

    }

    public Aluno (double matricula, double mensalidade, double rendaMensal){
      
      

      this.matricula = matricula;
      this.mensalidade = mensalidade;
      
    
     

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

    

   

    
}
