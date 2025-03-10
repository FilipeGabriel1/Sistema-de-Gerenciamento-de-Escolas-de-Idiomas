package co.Servicos;

import co.Entidades.Aluno;




public class AlunoServicos extends Aluno {

    public void matricular(Aluno aluno, int matricula, String nome, String sobrenome, int idade) {
          
            aluno.setMatricula(matricula);
            aluno.setNome(nome);
            aluno.setSobrenome(sobrenome);
            aluno.setIdade(idade);

            if (aluno.getIdade() < 14) {
                System.out.println("Aluno menor de 14 anos, nao pode ser matriculado");
            } else {
                System.out.println("Aluno matriculado com sucesso, informações do dado do aluno abaixo:");

                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Sobrenome: " + aluno.getSobrenome());
                System.out.println("Idade: " + aluno.getIdade());
          
            }
            
        
    }
    
        public void mensalidade(Aluno aluno, int mensalidade){
            aluno.setMensalidade(mensalidade);
        }

      public void turma(Aluno aluno, String turma){
     aluno.setTurma(turma);
      }

      public void cursando(Aluno aluno, String cursando){
        aluno.setCursando(cursando);
        if (aluno.getCursando().equalsIgnoreCase("Ingles")) {
            System.out.println("Aluno cursando Ingles");
        } else if (aluno.getCursando().equalsIgnoreCase("Japones")) {
            System.out.println("Aluno cursando Japones");
        } else if (aluno.getCursando().equalsIgnoreCase("Frances")) {
            System.out.println("Aluno cursando Frances");
        } else if (aluno.getCursando().equalsIgnoreCase("Espanhol")) {
            System.out.println("Aluno cursando Espanhol");
        } else {
            System.out.println("Curso nao identificado");
        }
          
            
        }
      }

    
     
       
    
        

       
        
    


