import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
      boolean i = true;
      Array tarefas = new Array(3);

      
      Scanner teclado = new Scanner(System.in);

      System.out.println("Pressione 'C' Para Criar uma tarefa. ");
      System.out.println("Pressione 'L' Para Listar todas as tarefas. ");
      System.out.println("Pressione 'X' Para encerrar o programa. ");
      String comando = teclado.nextLine();
      
      while (i == true) {
      if (comando.equals("c") || comando.equals("C")) {
        Tarefa tar1 = new Tarefa();
        System.out.println("Insira o nome da Tarefa: ");
        String tarNome = teclado.nextLine();
        tar1.setNomeDep(tarNome);
        tarefas.insert(tar1); // <- change - objectifiy
        
      } if (comando.equals("l") || comando.equals("L")) {
        // listar

      } if (comando.equals("x") || comando.equals("X")) {
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
