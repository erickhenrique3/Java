
/*@param args */
// This is a simple Java application that prints "Hello World" to the console.

import java.util.Scanner;

public class App{

    //PARA USARMOS COSTANTES NO JAVA, USAMOS O "FINAL" ANTES DO TIPO DE DADO
    final  static String GREETING = "Hello World";
    public static void main(String[] args) {
        // oque é String[] ou seja e um array de strings, ou seja, um vetor de strings, ou seja, uma lista de strings

        System.out.println(GREETING);
 
        //SYSTEM IN "PARA ENTRADA DE DADOS"
        //SYSTEM OUT "PARA SAIDA DE DADOS"

        //SCANNER SERVE PARA LER TEXTO/INT/DOUBLE DIGITADO PELO USUÁRIO
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Ola " + name + "! Voce tem " + age + " anos de idade.");
        scanner.close();
    }
}