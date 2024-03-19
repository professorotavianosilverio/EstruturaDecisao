// Informando para o Java que necessito utilizar entrada de dados//
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // criando uma variavel do tipo input para entrada de dados//
    Scanner teclado = new Scanner( System.in );
    // Declarar as variaveis
    int V1, V2, V3;
    double media;
    // Ler os valores
    System.out.print("Digite o Valor 1: ");
    V1 = teclado.nextInt();
    System.out.print("Digite o Valor 2: ");
    V2 = teclado.nextInt();
    System.out.print("Digite o Valor 3: ");
    V3 = teclado.nextInt();
    // Calcular a media
    media = (V1+V2+V3)/3;
    // Exibir a media
    System.out.println("A média é ->"+media);
    if (media <= 10){
       System.out.println("A média é menor que 10 "+media);
    }else{
       System.out.println("A média é maior que 10 "+media);
    }
    
    
  }

}