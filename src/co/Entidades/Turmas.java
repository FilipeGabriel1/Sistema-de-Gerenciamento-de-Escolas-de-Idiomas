package co.Entidades;



public class Turmas    {

   
    private String ingles;
    private String espanhol;
    private String frances;
    private String japones;
    private String turma;
   

    
    public Turmas (){

    }   

    public Turmas (String ingles, String espanhol, String frances,  String japones, String nome, String turma){

        this.ingles = ingles;
        this.espanhol = espanhol;
        this.frances = frances;
        this.japones = japones;
        this.turma = turma;
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

public String getTurma() {
    return turma;
}

public void setTurma(String turma) {
    this.turma = turma;
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



}

    

