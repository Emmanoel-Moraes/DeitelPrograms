package chapter2.exercises; // pertence ao package

import java.util.Scanner; // utiliza Scanner para ler dados via linha de comando



public class Question2Dot15 {

    public static void main (String[] args){

        // Instanciação de objeto Scanner para receber dados via prompt de  comando
        Scanner sc = new Scanner(System.in);

        int num1, num2, // declaração  dos números a serem inseridos pelo usuário
            sum, product, subtration, division; // declaração das variáveis  para receber soma, produto, subtração e divisão entre num1 e num2, respectivamente

        System.out.print("insert first number: "); // promt
        num1 = sc.nextInt(); // lê inteiro via linha de comando e atribui a num1

        System.out.print("insert second number: "); // prompt
        num2 = sc.nextInt(); // lê inteiro via linha de comando e atribui a num2

        // Operações com num1 e num2
        sum = num1 +  num2;
        product = num1 * num2;
        subtration = num1 - num2;
        division = num1 / num2;

        System.out.printf("Sum between %d and %d is: %d\n", num1, num2, sum);
        System.out.printf("Product between %d and %d is: %d\n", num1, num2, product);
        System.out.printf("Subtration between %d and %d is: %d\n", num1, num2, subtration);
        System.out.printf("Division between %d and %d is: %d\n", num1, num2, division);

    } // fim do método main

} // fim da classe Question2Dot15
