import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
      boolean i = true;
      Array tarefas = new Array(3);

      
      Scanner teclado = new Scanner(System.in);

      while (i == true) {
      
        System.out.println("Pressione 'C' Para Criar uma tarefa. ");
        System.out.println("Pressione 'L' Para Listar todas as tarefas. ");
        System.out.println("Pressione 'X' Para encerrar o programa. ");
        String comando = teclado.nextLine();
      
      
        if (comando.equals("c") || comando.equals("C")) { // ESTRUTURA CONDICIONAL
          Tarefa tar1 = new Tarefa();
          System.out.println("Insira o nome da Tarefa: ");
          String tarNome = teclado.nextLine();
          tar1.setNomeTar(tarNome);
          tarefas.insert(tar1);
        
        } else if (comando.equals("l") || comando.equals("L")) {
            tarefas.printArray();

        } else if (comando.equals("x") || comando.equals("X")) {
          System.out.println("Encerrando programa! ");
          i = false;

        } else {
          System.out.println("Comando Inválido, Encerrando programa! ");
          i = false;
        }
    }
      
      teclado.close();
  }
}
