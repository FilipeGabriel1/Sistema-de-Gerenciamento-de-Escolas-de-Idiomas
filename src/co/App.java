package co;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma;
import co.Repositorio.AlunoRepositorio;
import co.Repositorio.CursoRepositorio;
import co.Repositorio.ProfessorRepositorio;
import co.Repositorio.TurmaRepositorio;
import co.Entidades.Professor;
import co.Servicos.AlunoServicos;
import co.Servicos.CursoServicos;
import co.Servicos.ProfessorServicos;
import co.Servicos.TurmaServicos;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Instanciando repositórios e serviços
        CursoRepositorio cursoRepositorio = new CursoRepositorio(new ArrayList<>());
        CursoServicos cursoServicos = new CursoServicos(cursoRepositorio);

        TurmaRepositorio turmaRepositorio = new TurmaRepositorio(new ArrayList<>());
        TurmaServicos turmaServicos = new TurmaServicos(turmaRepositorio);

        AlunoRepositorio alunoRepositorio = new AlunoRepositorio(new ArrayList<>());
        AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);

        ProfessorRepositorio professorRepositorio = new ProfessorRepositorio(new ArrayList<>());
        ProfessorServicos professorServicos = new ProfessorServicos(professorRepositorio);

        boolean funcionando = true;

        while (funcionando) {
            System.out.println("Bem Vindo ao Sistema de Gerenciamento!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Gerenciar Aluno");
            System.out.println("2 - Gerenciar Turma");
            System.out.println("3 - Gerenciar Curso");
            System.out.println("4 - Gerenciar Professor");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    gerenciarAlunos(scanner, alunoServicos, cursoServicos, turmaServicos);
                    break;
                case 2:
                    gerenciarTurmas(scanner, turmaServicos, cursoServicos);
                    break;
                case 3:
                    gerenciarCursos(scanner, cursoServicos);
                    break;
                case 4:
                  gerenciarProfessores(scanner, professorServicos, cursoServicos, turmaServicos);
                    break;
                case 5:
                funcionando = false;
                System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void gerenciarAlunos(Scanner scanner, AlunoServicos alunoServicos, CursoServicos cursoServicos, TurmaServicos turmaServicos) {
        boolean funcionando = true;

        while (funcionando) {
            System.out.println("Gerenciamento de Alunos:");
            System.out.println("1 - Matricular Aluno");
            System.out.println("2 - Alterar Aluno");
            System.out.println("3 - Deletar Aluno");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Código para matricular aluno
                   System.out.println("Digite o nome do curso");
                   String nomeCurso = scanner.nextLine();
                     Curso curso = cursoServicos.buscarCursoPorNome(nomeCurso);

                     if (curso != null) {
                        System.out.println("Digite o nome da turma: ");
                        String nomeTurma = scanner.nextLine();
                        Turma turma = turmaServicos.buscarPorNome(nomeTurma);

                        if (turma != null) {
                            System.out.println("Digite o nome do aluno:");
                            String nome = scanner.nextLine();
                            System.out.println("Digite o sobrenome do aluno:");
                            String sobrenome = scanner.nextLine();
                            System.out.println("Digite a idade do aluno:");
                            int idade = scanner.nextInt();
                            scanner.nextLine(); // Consumir a nova linha
                            System.out.println("Digite o CPF do aluno:");
                            String cpf = scanner.nextLine();
                            System.out.println("Digite a mensalidade do aluno:");
                            int mensalidade = scanner.nextInt();
                            scanner.nextLine(); // Consumir a nova linha
                            System.out.println("Digite o numero da matricula do aluno:");
                            int matricula = scanner.nextInt();
                            scanner.nextLine(); // Consumir a nova linha


                            Aluno aluno = new Aluno(nome, sobrenome, mensalidade, cpf, idade, matricula);

                            alunoServicos.matricular(aluno, matricula, nome, sobrenome, idade, mensalidade, curso, turma, cpf);
                            
                            System.out.println("Aluno " + nome + " matriculado com sucesso no curso " + nomeCurso + " e na turma " + nomeTurma + ".");
                        } else {
                            System.out.println("Turma não encontrada. Verifique o nome e tente novamente.");
                        }
                    } else {
                        System.out.println("Curso não encontrado. Verifique o nome e tente novamente.");
                       
                        
                     }
                    break;
                case 2:
                    // Código para alterar aluno
                   System.out.println("Digite o CPF do aluno que deseja alterar:");
                   String cpf = scanner.nextLine();

                        Aluno aluno = alunoServicos.buscarPorCPF(cpf);

                        if (aluno != null) {
                            System.out.println("Aluno encontrado: " + aluno.getNome() + " " + aluno.getSobrenome());
                            System.out.println("Digite a nova matricula do aluno (ou pressione Enter para manter a atual):");
                            String novaMatriculaString = scanner.nextLine();
                            int novaMatricula = novaMatriculaString.isEmpty() ? aluno.getMatricula() : Integer.parseInt(novaMatriculaString);

                            System.out.println("Digite a nova idade do aluno (ou pressione Enter para manter a atual):");
                            String novaIdadeString = scanner.nextLine();
                            int novaIdade = novaIdadeString.isEmpty() ? aluno.getIdade() : Integer.parseInt(novaIdadeString);

                            System.out.println("Digite a nova mensalidade do aluno (ou pressione Enter para manter a atual):");
                            String novaMensalidadeString = scanner.nextLine();
                            double novaMensalidade = novaMensalidadeString.isEmpty() ? aluno.getMensalidade() : Double.parseDouble(novaMensalidadeString);

                            System.out.println("Digite o nome do novo curso (ou pressione Enter para manter o atual):");
                            String nomeCursoString = scanner.nextLine();
                            Curso novoCurso = nomeCursoString.isEmpty() ? aluno.getCursos() : cursoServicos.buscarCursoPorNome(nomeCursoString);

                            System.out.println("Digite o nome da nova turma (ou pressione Enter para manter a atual):");
                            String nomeTurmaString = scanner.nextLine();
                            Turma novaTurma = nomeTurmaString.isEmpty() ? aluno.getTurmas() : turmaServicos.buscarPorNome(nomeTurmaString);

                            if (novoCurso != null && novaTurma != null) {
                               alunoServicos.alterar(aluno, novaMatricula, novaIdade, (int) novaMensalidade, novoCurso, novaTurma);
                                System.out.println("Aluno " + aluno.getNome() + " alterado com sucesso.");
                            } else {
                                System.out.println("Curso ou turma não encontrados. Verifique os nomes e tente novamente.");
                                
                            System.out.println("Aluno com CPF " + cpf + " não encontrado.");
                        }
                    }
                    break;
                case 3:
                    // Código para deletar aluno
                   System.out.println("Digite o CPF do aluno que deseja deletar:");
                   String cpfString = scanner.nextLine();
                   boolean removido = alunoServicos.deletarAluno(cpfString);
                   if (removido) {
                    System.out.println("Aluno deletado com sucesso.");
                    
                   }
                   else{
                    System.out.println("Nao foi possivel excluir o aluno, verifique o CPF e tente novamente.");
                   }
                case 4:
                    // Código para listar alunos
                    alunoServicos.listarAlunos();
                    break;
                case 5:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarTurmas(Scanner scanner, TurmaServicos turmaServicos, CursoServicos cursoServicos) {
        boolean funcionando = true;

        while (funcionando) {
            System.out.println("Gerenciamento de Turmas:");
            System.out.println("1 - Criar Turma");
            System.out.println("2 - Alterar Turma");
            System.out.println("3 - Deletar Turma");
            System.out.println("4 - Listar Turmas");
            System.out.println("5 - Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Código para criar turma
                   System.out.println("Digite o nome do curso ao qual a turma sera adicionada:");
                   String nomeCurso = scanner.nextLine();
                  Curso curso = cursoServicos.buscarCursoPorNome(nomeCurso);

                  if (curso != null) {
                    System.out.println("Digite o nome da turma:");
                    String nomeTurma = scanner.nextLine();
                    System.out.println("Digite a capacidade máxima de alunos da turma:");
                    int capacidadeMaxAlunos = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha


                    Turma turma = new Turma(nomeTurma, capacidadeMaxAlunos);
                    turmaServicos.salvar(turma);
                    curso.adicionarTurma(turma);
                    System.out.println("Turma: " + nomeTurma + " Adicionada ao Curso: " + nomeCurso + " Com Sucesso");
                  }
                  else{
                    System.out.println("Curso não encontrado. Verifique o nome e tente novamente.");
                  }
                    break;
                case 2:
                    // Código para alterar turma
                    System.out.println("Digite o nome da turma que deseja alterar:");
                    String nomeTurma = scanner.nextLine();
    
                    Turma turma = turmaServicos.buscarPorNome(nomeTurma);
                    if (turma != null) {
                        System.out.println("Turma encontrada: " + turma.getNomeTurma());
    
                        System.out.println("Digite a nova capacidade máxima de alunos da turma (ou pressione Enter para manter a atual):");
                        String novaCapacidadeMaxAlunosStr = scanner.nextLine();
                        int novaCapacidadeMaxAlunos = novaCapacidadeMaxAlunosStr.isEmpty() ? turma.getCapacidadeMaxAlunos() : Integer.parseInt(novaCapacidadeMaxAlunosStr);
    
                        boolean alterada = turmaServicos.alterarTurma(nomeTurma, novaCapacidadeMaxAlunos);
                        if (alterada) {
                            System.out.println("Turma alterada com sucesso!");
                        }
                    } else {
                        System.out.println("Turma não encontrada. Verifique o nome e tente novamente.");
                    }
                    break;
                case 3:
                    // Código para deletar turma
                    System.out.println("Digite o nome da turma que deseja deletar:");
                    String nomeTurma2 = scanner.nextLine();
                    boolean removido = turmaServicos.deletarTurma(nomeTurma2);
                    if (removido) {
                        System.out.println("Turma deletada com sucesso.");
                    } else {
                        System.out.println("Turma não encontrada. Verifique o nome e tente novamente.");
                    }
                    break;
                case 4:
                    // Código para listar turmas
                    turmaServicos.ListarTurmas();
                    break;
                case 5:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarCursos(Scanner scanner, CursoServicos cursoServicos) {
        boolean funcionando = true;

        while (funcionando) {
            System.out.println("Gerenciamento de Cursos:");
            System.out.println("1 - Criar Curso");
            System.out.println("2 - Alterar Curso");
            System.out.println("3 - Deletar Curso");
            System.out.println("4 - Listar Cursos");
            System.out.println("5 - Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Código para criar curso
                    System.out.println("Digite o nome do curso:");
                    String nomeCurso = scanner.nextLine();
                    System.out.println("Digite a Carga horaria do curso:");
                    int cargaHoraria = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Digite a Capacidade Maxima de Alunos do curso:");
                    int capacidadeMaxAlunos = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Digite o Horario das Aulas do Curso");
                    String horario = scanner.nextLine();
                    System.out.println("Digite a Capacidade Maxima de Alunos por Turma do curso:");
                    int capacidadeMaxAlunosPorTurma = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Digite os Dias de Aulas do Curso:");
                    String diasDasAulas = scanner.nextLine();
                    System.out.println("--------------------");

                    if (nomeCurso != null && cursoServicos.buscarCursoPorNome(nomeCurso) == null) {
                        Curso curso = new Curso(nomeCurso, cargaHoraria, capacidadeMaxAlunos, horario, capacidadeMaxAlunosPorTurma, diasDasAulas);
                        cursoServicos.salvar(curso);
                        
                    }else{
                        System.out.println("Curso já existe. Tente novamente com outro nome.");
                    }
                  
                    break;
                case 2:
                    // Código para alterar curso
                    System.out.println("Digite o nome do curso que deseja alterar:");
                String nomeCurso2 = scanner.nextLine();

                Curso curso2 = cursoServicos.buscarCursoPorNome(nomeCurso2);
                if (curso2 != null) {
                    System.out.println("Curso encontrado: " + curso2.getNomeCurso());

                    System.out.println("Digite a nova capacidade máxima de alunos do curso (ou pressione Enter para manter a atual):");
                    String novaCapacidadeMaxAlunosStr = scanner.nextLine();
                    int novaCapacidadeMaxAlunos = novaCapacidadeMaxAlunosStr.isEmpty() ? curso2.getCapacidadeMaxAlunos() : Integer.parseInt(novaCapacidadeMaxAlunosStr);

                    System.out.println("Digite o novo horário das aulas do curso (ou pressione Enter para manter o atual):");
                    String novoHorario = scanner.nextLine();
                    if (novoHorario.isEmpty()) {
                        novoHorario = curso2.getHorario();
                    }

                    System.out.println("Digite a nova capacidade máxima de alunos por turma (ou pressione Enter para manter a atual):");
                    String novaCapacidadeMaxAlunosPorTurmaStr = scanner.nextLine();
                    int novaCapacidadeMaxAlunosPorTurma = novaCapacidadeMaxAlunosPorTurmaStr.isEmpty() ? curso2.getCapacidadeMaxAlunosPorTurma() : Integer.parseInt(novaCapacidadeMaxAlunosPorTurmaStr);

                    System.out.println("Digite os novos dias das aulas do curso (ou pressione Enter para manter os atuais):");
                    String novosDiasDasAulas = scanner.nextLine();
                    if (novosDiasDasAulas.isEmpty()) {
                        novosDiasDasAulas = curso2.getDiaDasAulas();
                    }

                    boolean alterado = cursoServicos.alterar(novoHorario, novaCapacidadeMaxAlunos, novaCapacidadeMaxAlunosPorTurma, nomeCurso2, novosDiasDasAulas);
                    if (alterado) {
                        System.out.println("Curso alterado com sucesso!");
                    }
                } else {
                    System.out.println("Curso não encontrado. Verifique o nome e tente novamente.");
                }
                    break;
                case 3:
                    // Código para deletar curso
                    System.out.println("Digite o nome do curso que deseja deletar:");
                    String nomeCursoDeletar = scanner.nextLine();
                    boolean removido = cursoServicos.deletarCurso(nomeCursoDeletar);
                    
                    if (removido) {
                        System.out.println("Curso deletado com sucesso.");
                    } else {
                        System.out.println("Curso não encontrado. Verifique o nome e tente novamente.");
                        
                    }
                    break;
                case 4:
                    // Código para listar cursos
                   cursoServicos.listarCursos();
                    break;
                case 5:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void gerenciarProfessores(Scanner scanner, ProfessorServicos professorServicos, CursoServicos cursoServicos, TurmaServicos turmaServicos) {
        boolean funcionando = true;

        while (funcionando) {
            System.out.println("Gerenciamento de Professores:");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Alterar Professor");
            System.out.println("3 - Deletar Professor");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                // Código para cadastrar professor
                System.out.println("Digite o nome do professor:");
                String nomeProfessor = scanner.nextLine();
                System.out.println("Digite o sobrenome do professor:");
                String sobrenomeProfessor = scanner.nextLine();
                System.out.println("Digite a idade do professor:");
                int idadeProfessor = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                System.out.println("Digite o cargo Atual do Professor:");
                String cargoAtual = scanner.nextLine();
                System.out.println("Digite a quantidade de anos de experiencia do professor:");
                int anosExperiencia = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                System.out.println("Digite os dias que o Professor ira trabalhar:");
                String diasDeTrabalho = scanner.nextLine();
                System.out.println("Digite o horario que o professor ira trabalhar:");
                String horarioDeTrabalho = scanner.nextLine();
                System.out.println("Digite o ID do  Professor:");
                int idProfessor = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                System.out.println("Digite o curso lecionado pelo professor:");
                String cursoLecionado = scanner.nextLine();
                System.out.println("Digite a disciplina lecionada pelo professor:");
                String disciplinaLecionada = scanner.nextLine();
                System.out.println("Digite o CPF do professor:");
                String cpfProfessor = scanner.nextLine();

             Professor professor = new Professor(nomeProfessor, sobrenomeProfessor, idadeProfessor, cpfProfessor, cargoAtual, anosExperiencia, diasDeTrabalho, horarioDeTrabalho, idProfessor,  cursoLecionado);

             professorServicos.cadastrar(professor, idProfessor, nomeProfessor, sobrenomeProfessor, anosExperiencia, diasDeTrabalho, horarioDeTrabalho, cursoLecionado, cpfProfessor);

             professorServicos.salvar(professor);
                    
             System.out.println("Professor " + nomeProfessor + " cadastrado com sucesso.");
                    break;
                    case 2:
                    // Código para alterar professor

                    System.out.println("Digite o CPF do professor que deseja alterar:");
                    String cpfProfessorAlterar = scanner.nextLine();
                
                    Professor professor2 = professorServicos.buscarPorCPF(cpfProfessorAlterar);
                    if (professor2 != null) {
                        System.out.println("Professor encontrado: " + professor2.getNome() + " " + professor2.getSobrenome());
                
            
                        System.out.println("Digite a nova idade do professor (ou pressione Enter para manter a atual):");
                        String novaIdadeStr = scanner.nextLine();
                        int novaIdade = novaIdadeStr.isEmpty() ? professor2.getIdade() : Integer.parseInt(novaIdadeStr);
                
                        System.out.println("Digite o novo cargo do professor (ou pressione Enter para manter o atual):");
                        String novoCargo = scanner.nextLine();
                        System.out.println("Digite os novos anos de experiência do professor (ou pressione Enter para manter o atual):");
                        String novosAnosExperienciaStr = scanner.nextLine();
                        int novosAnosExperiencia = novosAnosExperienciaStr.isEmpty() ? professor2.getAnosExperiencia() : Integer.parseInt(novosAnosExperienciaStr);
                
                        System.out.println("Digite os novos dias de trabalho do professor (ou pressione Enter para manter o atual):");
                        String novosDiasDeTrabalho = scanner.nextLine();
                        System.out.println("Digite o novo horário de trabalho do professor (ou pressione Enter para manter o atual):");
                        String novoHorarioDeTrabalho = scanner.nextLine();
                        System.out.println("Digite o novo curso lecionado pelo professor (ou pressione Enter para manter o atual):");
                        String novoCursoLecionado = scanner.nextLine();
                        System.out.println("Digite o novo ID do professor (ou pressione Enter para manter o atual):");
                        String novoIdStr = scanner.nextLine();
                        int novoId = novoIdStr.isEmpty() ? professor2.getId() : Integer.parseInt(novoIdStr);
                
                        professorServicos.alterarProfessor(cpfProfessorAlterar, novaIdade, novosAnosExperiencia, novosDiasDeTrabalho, novoHorarioDeTrabalho, novoCursoLecionado, novoId);
                    }

                    break;

                case 3:
                    // Código para deletar professor
                    System.out.println("Digite o CPF do professor que deseja deletar:");
                    String cpfProfessorDeletar = scanner.nextLine();
                    boolean removido = professorServicos.deletarProfessor(cpfProfessorDeletar);
                    if (removido) {
                        System.out.println("Professor deletado com sucesso.");
                    } else {
                        System.out.println("Professor não encontrado. Verifique o CPF e tente novamente.");
                    }
                    break;
            case 4:
                // Código para listar professores   
                professorServicos.listarProfessores();
                break;
            case 5:
                funcionando = false;
                
                default:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            
    }
}
} 
        
    
  
