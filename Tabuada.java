 import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/


public class Tabuada {
     public static void main(String[] args) {
int tabuada;
int numero = 1;
int resultado = 0;

         Scanner scan = new Scanner(System.in);
         System.out.println("tabuada:" );
         tabuada = scan.nextInt();

         int count = 0;
         do {
             resultado = tabuada * numero;

System.out.println(tabuada + "X" + numero + "=" + resultado );
             numero++;
             count++;
         }while (count < 10);






     }


    }


