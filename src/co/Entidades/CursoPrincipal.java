package co.Entidades;

public enum CursoPrincipal {

    Ingles("Ingles"), Espanhol("Espanhol"), Frances("Frances"), Japones("Japones");

    private  String name;

   private CursoPrincipal (String name){
    this.name = name;
    
   }

   public void setName(String name){
       this.name = name;
   }
    public String getName() {
        return name;
    }

   
}
