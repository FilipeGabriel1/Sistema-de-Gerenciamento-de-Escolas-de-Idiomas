package co;

import java.util.Scanner;


import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Professor;
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

    AlunoServicos alunoServicos = new AlunoServicos();
    ProfessorServicos professorServicos = new ProfessorServicos();

    Aluno aluno = new Aluno();
    List<Aluno> listaAlunos = new ArrayList<Aluno>();

    alunoServicos.matricular(aluno, 4343, "Filipe", "Gabriel", 19);

    AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
    alunoRepositorio.adicionarAluno(aluno);

    Aluno alunoEncontrado = alunoRepositorio.buscarAlunoPorNome("Filipe");

    if (alunoEncontrado != null) {
      System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " " + alunoEncontrado.getSobrenome() + ", Idade: " + alunoEncontrado.getIdade());
    } else {
      System.out.println("Aluno não encontrado");
    }

    List<Aluno> alunos = alunoRepositorio.listarAlunos();
    System.out.println("Lista de Alunos:");
    for (Aluno a : alunos) {
      System.out.println("Nome: " + a.getNome() + " " + a.getSobrenome() + ", Idade: " + a.getIdade());
    }

   
    System.out.println("--------------------------------------------------");

    Professor professor = new Professor();
    List<Professor> listaProfessores = new ArrayList<Professor>();

    professorServicos.cadastrar(professor, 1234, "Carlos", "Silva", "Inglês");

    professorServicos.cargoAtual(professor, "Professor de Inglês");

    professorServicos.anosExperiencia(professor, 20);

    professorServicos.diasDeTrabalho(professor, "Segunda a Sexta");

    ProfessorRepositorio professorRepositorio = new ProfessorRepositorio();
    professorRepositorio.adicionarProfessor(professor);

    Professor professorEncontrado = professorRepositorio.buscarProfessorPorNome("Carlos");

    if (professorEncontrado != null) {
      System.out.println("Professor encontrado: " + professorEncontrado.getNome() + " " + professorEncontrado.getSobrenome() + ", Disciplina Lecionada: " + professorEncontrado.getDisciplinaLecionada());
    } else {
      System.out.println("Professor não encontrado");
    }

    List<Professor> professores = professorRepositorio.listarProfessores();
    System.out.println("Lista de Professores:");
    for (Professor p : professores) {
      System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + ", Disciplina Lecionada: " + p.getDisciplinaLecionada());
    }

    System.out.println("--------------------------------------------------");

    Curso curso = new Curso();

    CursoServicos cursoServicos = new CursoServicos();

   cursoServicos.disciplinaDisponiveis(curso);



   cursoServicos.cargaHorariaDoCurso(curso, "Ingles");

   cursoServicos.capacidadeMaxAlunos(curso, "Ingles", 50);

   System.out.println("-----------------");

   

  CursoRepositorio cursoRepositorio = new CursoRepositorio();

  List<Curso> listaCursos = new ArrayList<Curso>();

 listaCursos.add(new Curso("Ingles", "Espanhol", "Frances", "Japones"));

 for (Curso c : listaCursos) {
   System.out.println("Disciplinas: " + c.getIngles() + ", " + c.getEspanhol() + ", " + c.getFrances() + ", " + c.getJapones());
  }
  
 

  List<Curso> cursos = cursoRepositorio.listarCursos();
  System.out.println("Lista de Cursos:");
  for (Curso c : cursos) {
    System.out.println("Nome: " + c.getIngles() + ", " + c.getEspanhol() + ", " + c.getFrances() + ", " + c.getJapones());
  }

alunoServicos.cursando(alunoEncontrado, "Ingles");


  }
}


