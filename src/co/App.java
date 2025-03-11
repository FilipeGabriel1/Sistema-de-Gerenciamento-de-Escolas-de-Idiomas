package co;

import java.util.Scanner;


import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.CursosPrincipais;
import co.Entidades.Professor;
import co.Entidades.Turmas;
import co.Repositorio.AlunoRepositorio;
import co.Repositorio.CursoRepositorio;
import co.Repositorio.ProfessorRepositorio;
import co.Servicos.AlunoServicos;
import co.Servicos.CursoServicos;
import co.Servicos.ProfessorServicos;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {

   
      AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
      AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);

      Aluno aluno = new Aluno();

      alunoServicos.matricular(aluno, 50, "Filipe", "Gabriel", 19, 700, CursosPrincipais.INGLES, Turmas.TURMA_A);

      Aluno alunoEncontrado = alunoServicos.buscarAlunoPorNome("Filipe");

      if (alunoEncontrado != null) {
          System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " " + alunoEncontrado.getSobrenome() + ", Idade: " + alunoEncontrado.getIdade() + ", Mensalidade: " + alunoEncontrado.getMensalidade() + ", Curso: " + alunoEncontrado.getCurso() + ", Turma: " + alunoEncontrado.getTurmas());
      } else {
          System.out.println("Aluno não encontrado");
      }

      List<Aluno> alunos = alunoRepositorio.listarAlunos();
      System.out.println("Lista de Alunos:");
      for (Aluno a : alunos) {
          System.out.println("Nome: " + a.getNome() + " " + a.getSobrenome()
          );
      }

      System.out.println("--------------------------------------------------");

      alunoServicos.inativarAluno("Filipe");

      alunos = alunoRepositorio.listarAlunos();
      System.out.println("Lista de Alunos :");
      for (Aluno a : alunos) {
          System.out.println("Nome: " + a.getNome() + " " + a.getSobrenome() + ", Ativo: " + a.isAtivo()
          );
      }

      System.out.println("--------------------------------------------------");

      alunoServicos.deletarAluno("Filipe");

      alunos = alunoRepositorio.listarAlunos();
      System.out.println("Lista de Alunos:");
      for (Aluno a : alunos) {
          System.out.println("Nome: " + a.getNome() + " " + a.getSobrenome()
          );
      }

      
  }
   
}


