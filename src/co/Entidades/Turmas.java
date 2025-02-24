package co.Entidades;



public abstract class Turmas extends Pessoa   {

   
    private String ingles;
    private String espanhol;
    private String frances;
    private String japones;
   

    
    public Turmas (){

    }   

    public Turmas (String ingles, String espanhol, String frances,  String japones, String nome){

        this.ingles = ingles;
        this.espanhol = espanhol;
        this.frances = frances;
        this.japones = japones;
      

}


public String getIngles() {
    return ingles;
}

public void setIngles(String ingles) {
    this.ingles = ingles;
}

public String getEspanhol() {
    return espanhol;
}

public void setEspanhol(String espanhol) {
    this.espanhol = espanhol;
}

public String getFrances() {
    return frances;
}

public void setFrances(String frances) {
    this.frances = frances;
}



public String getJapones() {
    return japones;
}

public void setJapones(String japones) {
    this.japones = japones;
}

public abstract void IdentificarAluno(Turmas matricula);

public abstract void ExibiIdentificacao();

public void IdentificarTurmas(Turmas matricula){
    System.out.println("Matricula: " + matricula);

}
}
    

