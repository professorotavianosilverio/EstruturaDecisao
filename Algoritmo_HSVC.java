//Armazene em um vetor a quantidade de dinheiro que as 10 pessoas presaspossuíam
//Este vetor deve ser preenchido pelo usuário.
//Leia a quantidade de dinheiro que o bandido confesso (item b) revelou
//Este valor deve ser preenchido pelo usuário
//Calcule e informe ao delegado quanto dinheiro foi roubado.
  
import java.util.Scanner;

  
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Cria uma lista com no máximo 10 elementos, pois 10 pessoas foram levadas pela polícia.
    int[] quantidades = new int[10];
    //Cria um loop que gira pela quantidade de pessoas pegas, e pergunta em cada uma das voltas a quantidade de dinheiro que a pessoa possuia
    for (int i = 0; i < quantidades.length; i++) {
      System.out.print("Digite a quantidade de dinheiro da pessoa " + (i + 1) + ": ");
      //Armazena a quantidade de dinheiro que a pessoa possuia na sua respectiva posição.
      quantidades[i] = scanner.nextInt();
    }
    System.out.print("Digite a quantidade de dinheiro que o menor bandido confessou: ");
    int quantidadeConfesso = scanner.nextInt();
    
    int soma = 0;
    //Cria um loop que soma todos os valores da lista de quantidades de dinheiro
    for (int i = 0; i < quantidades.length; i++) {
      if ((quantidades[i] >= quantidadeConfesso) && (quantidades[i] % 10 == 0)) {
        soma += quantidades[i];
      }
    }
    
    System.out.println("A quantidade de dinheiro roubado foi: " + soma);
    
      
    
  }

  
}