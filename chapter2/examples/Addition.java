package chapter2.examples; // pertence ao package
// Figura 2.7:  Addition.java
// Programa de adição que insere dois números, então exibe a soma deles


import java.util.Scanner; // programa utiliza a classe Scanner


public class Addition {


    // método main inicia execução do programa
    public static void main (String[] args){

        // cria Scanner para obter entrada a partir da janela de comando
        Scanner sc = new Scanner(System.in);

        int number1; // primeiro número a somar
        int number2; // segundo núemro a somar
        int sum; // soma de number1 e number2

        System.out.print("Enter first integer: "); // prompt
        number1 = sc.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Enter second integer: "); // lê segundo número fornecido pelo usuário
        number2 = sc.nextInt(); // lê o segundo número fornecido pelo usuário

        sum = number1 + number2; // soma os números, depois armazena o total em sum

        System.out.printf("Sum is %d%n", sum); // exibe a soma

        sc.close(); // encerra Scanner


    } // fim do método main

} // fim da classe Additon
