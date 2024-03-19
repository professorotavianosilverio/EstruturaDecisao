//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner( System.in );
    // Declaracao de variaveis
    int nota=0;
    System.out.println("Digite uma nota: ");
    nota = teclado.nextInt();
    while (nota > 10 || nota < 0){
      
      System.out.println("Nota invalida.Digite novamente");
     
      System.out.println("Digite uma nota: ");
      nota = teclado.nextInt();
    }
     System.out.println("Nota valida");
   }

  
}