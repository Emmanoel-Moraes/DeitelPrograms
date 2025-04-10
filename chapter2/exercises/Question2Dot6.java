package chapter2.exercises; //pertence ao  package
// Question2Dot6.java



import java.util.Scanner; // utiliza Scanner para ler dados via prompt

public class Question2Dot6 {

    public static void main (String[] args){

        // Cria Scanner para obter entrada a partir da linha de comando
        Scanner sc = new Scanner(System.in);

        // Declaração dos números a serem  inseridos pelo usuário
        int number1, number2 , number3, multiple;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt(); // lê primeiro número inserido pelo usuário e armazena em number1

        System.out.print("Enter second number: ");
        number2 = sc.nextInt(); // lê primeiro número inserido pelo usuário e armazena em number2

        System.out.print("Enter third number: ");
        number3 = sc.nextInt(); // lê primeiro número inserido pelo usuário e armazena em number3

        // multiplo dos três números inseridos pelo usuário
        multiple = number1 * number2 * number3;

        // result
        System.out.printf("The product between the three numbers are %d%n", multiple);

        sc.close(); // encerra Scanner


    } // fim do método main

} // fim da classe Quetion2Dot6
