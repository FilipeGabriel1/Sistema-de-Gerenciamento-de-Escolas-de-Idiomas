package co.Entidades;

public  class Responsavel extends Pessoa {

    public Responsavel(String nome, String sobrenome, String cpf, int celular){
        super(nome, sobrenome, cpf, celular);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " " + getSobrenome() + ", CPF: " + getCpf() + ", Celular: " + getCelular();
    }

}