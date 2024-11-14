public class App {
    public static void main(String[] args) throws Exception {
       
        //Teste

        Aluno aluno = new Aluno();
        aluno.setMatricula(1234);
        aluno.setCelular(8888-8888);
        aluno.setMensalidade(800);
        aluno.setGastoMensal(0);

        aluno.IdentificarAluno();
        aluno.ExibiIdentificacao();

        Professor professor = new Professor();
        professor.setCursos("Java");    
        professor.setCargoAtual("Professor");
        professor.setEmpresaAtual("RIOT");
        professor.setAnosExperiencia(10);


        Curso curso = new Curso();
        curso.setNome("CCA");
        curso.setCargaHoraria(100);
      curso.setCapacidadeMaxAlunos(50);
      curso.setDescricao("Curso de Java");
    }
    }

