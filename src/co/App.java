package co;

import java.util.Scanner;

import co.Arraylist.Aluno;
import co.Arraylist.Professor;
import co.Arraylist.TurmasArray;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

      List<Aluno> alunos = new ArrayList<Aluno>();

      Scanner scanner = new Scanner(System.in);


      System.out.println("Bem vindo! , Voce deseja adicionar um novo Aluno?");

      System.out.println("Digite 1 para sim e 2 para nao");


      
      int resposta = scanner.nextInt();

     while (resposta == 1)  {

        Aluno aluno = new Aluno();

      System.out.println("Digite as informações do Aluno abaixo:");
     
      System.out.println("Digite o nome do Aluno:");

      Scanner scanner2 = new Scanner(System.in);

      aluno.setNome(scanner2.nextLine());

      System.out.println("Digite o sobrenome do Aluno:");

      aluno.SetSobrenome(scanner2.nextLine());

      System.out.println("Digite a data de nascimento do Aluno:");

      aluno.setDataNascimento(scanner2.nextLine());

      System.out.println("Digite o email do Aluno:");

      aluno.setEmail(scanner2.nextLine());

      System.out.println("Digite o número de celular do Aluno:");

      aluno.setCelular(scanner.nextInt());

      System.out.println("Digite o número de matricula do Aluno");

      aluno.setMatricula(scanner.nextInt());

      System.out.println("Digite a mensalidade do Aluno");

      aluno.setMensalidade(scanner.nextDouble());

      System.out.println("Digite a renda mensal do Aluno");

      aluno.setRendaMensal(scanner.nextDouble());

      System.out.println("Digite o CPF do Aluno");

      aluno.setCpf(scanner.nextInt());

      System.out.println("Digite o RG do Aluno");
      
      aluno.setRg(scanner.nextInt());

      System.out.println("Digite a rede social do Aluno, se ele tiver");

      aluno.setRedeSocial(scanner2.nextLine());

      alunos.add(aluno);



    System.out.println("Aluno cadastrado com sucesso!");
aluno.IdentificarAluno();

    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Sobrenome: " + aluno.getSobrenome());
    System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
    System.out.println("Email: " + aluno.getEmail());
    System.out.println("Celular: " + aluno.getCelular());
    System.out.println("CPF: " + aluno.getCpf());
    System.out.println("RG: " + aluno.getRg());
    System.out.println("Rede Social: " + aluno.getRedeSocial());
    System.out.println("Matricula: " + aluno.getMatricula());
    System.out.println("Mensalidade: " + aluno.getMensalidade());
    System.out.println("Renda Mensal: " + aluno.getRendaMensal());

    System.out.println("Deseja adicionar um novo Aluno?");
    System.out.println("Digite 1 para sim e 2 para não");

    resposta = scanner.nextInt();

  
      }

    

      System.out.println("----------------");

      System.out.println("Lista de alunos cadastrados:");

      for(Aluno a: alunos){
        System.out.println( a.getNome() + " " + a.getSobrenome());
      }

     
      
      System.out.println("-------------");

      List<Professor> professores = new ArrayList<Professor>();

      System.out.println("Voce, deseja adicionar um novo professor?");
    
      System.out.println("Digite 1 para sim e 2 para não");

      Scanner input = new Scanner(System.in);

     

      int in = input.nextInt();
      while (in == 1) {

        Professor professor = new Professor();
   
        
      System.out.println("Digite as informações do Professor abaixo:");

      Scanner scanner3 = new Scanner(System.in);

      System.out.println("Digite o nome do Professor:");

      professor.setNome(scanner3.nextLine());

      System.out.println("Digite o sobrenome do Professor:");

      professor.SetSobrenome(scanner3.nextLine());

      System.out.println("Digite a data de nascimento do Professor:");

      professor.setDataNascimento(scanner3.nextLine());

      System.out.println("Digite o email do Professor:");

      professor.setEmail(scanner3.nextLine());

      Scanner scanner4 = new Scanner(System.in);

      System.out.println("Digite o número de celular do Professor:");

      professor.setCelular(scanner4.nextInt());

      System.out.println("Digite o CPF do Professor:");

      professor.setCpf(scanner4.nextInt());

      System.out.println("Digite o RG do Professor:");

      professor.setRg(scanner4.nextInt());

      System.out.println("Digite os cursos que o Professor ministra:");

      professor.setCursos(scanner3.nextLine());

      System.out.println("Digite o cargo atual do Professor:");

      professor.setCargoAtual(scanner3.nextLine());

      System.out.println("Digite a quantidade de anos de experiência do Professor:");

      professor.setAnosExperiencia(scanner4.nextInt());

      System.out.println("Digite os dias de trabalhos do Professor na semana:");

      professor.setDiasDeTrabalho(scanner3.nextLine());

      System.out.println("Digite o horário de trabalho do Professor:");

      professor.setHorarioDeTrabalho(scanner3.nextLine());

      professores.add(professor);

      System.out.println("Professor cadastrado com sucesso!");

     





      System.out.println("Nome: " + professor.getNome());
      System.out.println("Sobrenome: " + professor.getSobrenome());
      System.out.println("Data de Nascimento: " + professor.getDataNascimento());
      System.out.println("Email: " + professor.getEmail());
      System.out.println("Celular: " + professor.getCelular());
      System.out.println("CPF: " + professor.getCpf());
      System.out.println("RG: " + professor.getRg());
      System.out.println("Cursos: " + professor.getCursos());
      System.out.println("Cargo Atual: " + professor.getCargoAtual());
      System.out.println("Anos de Experiência: " + professor.getAnosExperiencia());
      System.out.println("Dias de Trabalho: " + professor.getDiasDeTrabalho());
      System.out.println("Horário de Trabalho: " + professor.getHorarioDeTrabalho());

        System.out.println("Deseja adicionar um novo Professor?");

        System.out.println("Digite 1 para sim e 2 para não");

in = input.nextInt();


        
      }

   

    System.out.println("----------------");

    System.out.println("Lista de professores cadastrados:");

    for(Professor p: professores){
      System.out.println(p.getNome() + " " + p.getSobrenome() + " - " +p.getCargoAtual());


    }

    System.out.println("----------------");
    
    System.out.println("Voce deseja saber a Lista de todas as Disciplinas?");

    System.out.println("Digite 1 para sim e 2 para não");

    int resposta2 = scanner.nextInt();

    while (resposta2 == 1) {

      System.out.println("Disciplinas disponíveis:");
    

 List<TurmasArray> turmas = new ArrayList<TurmasArray>();

 turmas.add(new TurmasArray("Ingles", "Espanhol", "Frances", "Japones"));
 
 for(TurmasArray t: turmas){
    System.out.println(t.getIngles());
    System.out.println(t.getEspanhol());
    System.out.println(t.getFrances());
    System.out.println(t.getJapones());

    System.out.println("Deseja saber o horario semanal de cada disciplina?");

    System.out.println("Digite 1 para sim e 2 para não");

      int resposta3 = scanner.nextInt();

      while (resposta3 == 1) {

        System.out.println("Disciplinas disponíveis:");

       for (TurmasArray j: turmas){
          System.out.println("Aula com o professor " + professores.get(0).getNome() + " Nos Seguintes dias e horas : " +professores.get(0).getDiasDeTrabalho() + " "+ professores.get(0).getHorarioDeTrabalho());

          System.out.println("Aula com o professor " + professores.get(1).getNome() + " Nos Seguintes dias e horas : " +professores.get(1).getDiasDeTrabalho() + " " + professores.get(1).getHorarioDeTrabalho());
          
          System.out.println("Aula com o professor " + professores.get(2).getNome() + " Nos Seguintes dias e horas : " +professores.get(2).getDiasDeTrabalho() + " "+ professores.get(2).getHorarioDeTrabalho());

          System.out.println("Aula com o professor " + professores.get(3).getNome() + " Nos Seguintes dias e horas : " +professores.get(3).getDiasDeTrabalho() + " "+ professores.get(3).getHorarioDeTrabalho());

          resposta3 = scanner.nextInt();
        }

        
      }
        

        System.out.println("Obrigado por usar o sistema!");
       
      }
       
        
      
      
    }

   

   

}


}