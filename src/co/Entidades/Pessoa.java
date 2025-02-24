package co.Entidades;

import co.interfac.ITurmas;

public class Pessoa implements ITurmas {
    

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String email;
    private int celular;
    private int cpf;
    private int rg;
    private String redeSocial;
  

    public Pessoa(){

    }

    public Pessoa(String nome, String sobreNome,String dataNascimento, String email, int celular, int cpf, int rg, String redeSocial){

          this.nome = nome;
          this.sobrenome = sobreNome;
          this.dataNascimento = dataNascimento;
          this.email = email;
          this.celular = celular;
          this.cpf = cpf;
          this.rg = rg;
          this.redeSocial = redeSocial;
         

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public void SetSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
        
    }

    public String getSobrenome(){
        return sobrenome;

    }

    public void setDataNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;

    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setEmail(String email){
        this.email = email;

    }

    public String getEmail(){
        return email;

    }

    public void setCelular(int celular){
        this.celular = celular;

    }

    public int getCelular(){
        return celular;

    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;

    }

    public int getCpf(){
        return cpf;

    }

    public void setRg(int rg){
        this.rg = rg;

    }

    public int getRg(){
        return rg;
    }

    public void setRedeSocial(String redeSocial){
        this.redeSocial = redeSocial;

    }

    public String getRedeSocial(){
        return redeSocial;
    }

    public void IdentificarAluno(){
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.println("Celular: " + celular);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Rede Social: " + redeSocial);
    }

    public void ExibiIdentificacao(){
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.println("Celular: " + celular);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Rede Social: " + redeSocial);
   
        
    }

}
