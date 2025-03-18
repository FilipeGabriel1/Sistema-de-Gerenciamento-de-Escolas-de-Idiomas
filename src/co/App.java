package co;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Professor;
import co.Entidades.Turma;
import co.Repositorio.AlunoRepositorio;
import co.Repositorio.CursoRepositorio;
import co.Servicos.AlunoServicos;
import co.Servicos.CursoServicos;
import co.Servicos.ProfessorServicos;
import co.Repositorio.ProfessorRepositorio;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        //Instanciando as turmas

        Turma turmaInglesA = new Turma("Turma de Ingles", 30);
        Turma turmaEspanholA = new Turma("Turma de Espanhol", 30);
        Turma turmaFrancesA = new Turma("Turma de Frances", 30);
        Turma turmaJaponesA = new Turma("Turma de Japones", 30);

        List<Turma> turmas = new ArrayList<>();
        turmas.add(turmaInglesA);
        turmas.add(turmaJaponesA);


        //Instanciando os cursos

        ArrayList<Curso> cursos = new ArrayList<>();
        CursoRepositorio cursoRepositorio = new CursoRepositorio(cursos);
        CursoServicos cursoServicos = new CursoServicos(cursoRepositorio);
        Curso curso = new Curso(); 
        curso.setNomeCurso("Ingles");
        Curso curso2 = new Curso();
        curso2.setNomeCurso("Espanhol");
        Curso curso3 = new Curso();
        curso3.setNomeCurso("Frances");
        Curso curso4 = new Curso();
        curso4.setNomeCurso("Japones");

      
    

        //Instanciando os alunos

        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio(alunos);
        AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);
      

        //Instanciando os professores

        ArrayList<Professor> professores = new ArrayList<>();
        Professor professor = new Professor();
        ProfessorRepositorio professorRepositorio = new ProfessorRepositorio(professores);
        ProfessorServicos professorServicos = new ProfessorServicos(professorRepositorio);
      
        


        //Codigo Funcionando na Pratica (APENAS EXEMPLO)
        cursoServicos.adicionarCurso(curso, "08:00 - 10:00", 30, "Curso de Ingles", turmas);

        cursoServicos.adicionarCurso(curso4, "10:00 - 12:00", 30, "Curso de Japones", turmas);

        System.out.println("-------------------------");

        alunoServicos.matricular(aluno, 600954, "Filipe", "Gabriel", 19, 400, curso, turmaInglesA);

        System.out.println("-------------------------");

        alunoServicos.matricular(aluno2, 576945, "Joao", "Pedro", 14, 500, curso4, turmaJaponesA);
        
        System.out.println("-------------------------");

        //Listando todos os Alunos da Empresa
        alunoServicos.listarAlunos();

        System.out.println("-------------------------");

        professorServicos.cadastrar(professor, 45637, "Joseph", "Ravioli", 15, "Segunda, Terca e Quinta", "08:00 as 10:00", "Ingles");

        professorServicos.listarProfessores();

        System.out.println("-------------------------");

        cursoServicos.listarCursos();

        System.out.println("-------------------------");

        cursoServicos.listarAlunosDoCurso(curso);

        System.out.println("-------------------------");
        
        cursoServicos.listarAlunosDoCurso(curso4);
    }
}