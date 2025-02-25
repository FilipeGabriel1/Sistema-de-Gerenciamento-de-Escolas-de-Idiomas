package co;

import java.util.Scanner;

import co.Arraylist.TurmasArray;
import co.Entidades.Aluno;
import co.Entidades.Professor;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {


   Aluno aluno = new Aluno();
    aluno.setNome("João");
    aluno.setSobrenome("Silva");

    System.out.println(aluno.getNomeCompleto());

   

}


}