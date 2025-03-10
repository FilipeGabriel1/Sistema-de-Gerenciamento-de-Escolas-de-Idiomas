package co.Servicos;

import co.Entidades.Curso;

public class CursoServicos {

     public void disciplinaDisponiveis(Curso curso){
           curso.setDisciplinas("Ingles, Espanhol, Frances, Japones");
           
        }

        public void cargaHorariaDoCurso(Curso curso, String materia) {
            if (materia.equalsIgnoreCase("Ingles")) {
  
                curso.setCargaHoraria(200);
                System.out.println("A Carga Horaria do curso de Ingles é de: " + curso.getCargaHoraria());
            }
            else if (materia.equalsIgnoreCase("Espanhol")) {
                curso.setCargaHoraria(150);
                System.out.println("A Carga Horaria do curso de Espanhol é de: " + curso.getCargaHoraria());
            }
            else if (materia.equalsIgnoreCase("Frances")) {
                curso.setCargaHoraria(180);
                System.out.println("A Carga Horaria do curso de Frances é de: " + curso.getCargaHoraria());
            }
            else if (materia.equalsIgnoreCase("Japones")) {
                curso.setCargaHoraria(160);
                System.out.println("A Carga Horaria do curso de Japones é de: " + curso.getCargaHoraria());
            }
            else {
                System.out.println("Disciplina não encontrada");
            }
        }

        public void capacidadeMaxAlunos(Curso curso, String materia, int capacidadeMaxAlunos) {
            if (materia.equalsIgnoreCase("Ingles")) {
                curso.setCapacidadeMaxAlunos(30);
                if (capacidadeMaxAlunos > curso.getCapacidadeMaxAlunos()) {
                    System.out.println("Capacidade máxima de alunos excedida");
                } else {
                    System.out.println("Capacidade máxima de alunos permitida");
                    
                }
            } else if (materia.equalsIgnoreCase("Espanhol")) {
                curso.setCapacidadeMaxAlunos(25);
                if (capacidadeMaxAlunos > curso.getCapacidadeMaxAlunos()) {
                    System.out.println("Capacidade máxima de alunos excedida");
                } else {
                    System.out.println("Capacidade máxima de alunos permitida");
                    
                }
            } else if (materia.equalsIgnoreCase("Frances")) {
                curso.setCapacidadeMaxAlunos(20);
                if (capacidadeMaxAlunos > curso.getCapacidadeMaxAlunos()) {
                    System.out.println("Capacidade máxima de alunos excedida");
                } else {
                    System.out.println("Capacidade máxima de alunos permitida");
                    
                }
            } else if (materia.equalsIgnoreCase("Japones")) {
                curso.setCapacidadeMaxAlunos(15);
                if (capacidadeMaxAlunos > curso.getCapacidadeMaxAlunos()) {
                    System.out.println("Capacidade máxima de alunos excedida");
                } else {
                    System.out.println("Capacidade máxima de alunos permitida");
                    
                }
            } else {
                System.out.println("Disciplina não encontrada");
            }
        }



}
