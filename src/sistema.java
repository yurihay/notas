import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {

        /** import da class Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Bom dia! Qual é o seu curso: ");
        String curso = teclado.nextLine();

        System.out.print(" Qual é o nome do professor: ");
        String prof = teclado.nextLine();

        System.out.print("Qual é o nome do aluno: ");
        String aluno = teclado.nextLine();

        System.out.println("Qual a frequencia: ");
        int frequencia = teclado.nextInt();

        System.out.println("ola qual a nota1: ");
        int nota1 = teclado.nextByte();

        System.out.println("ola qual a nota2: ");
        int nota2 = teclado.nextByte();

        float media = (nota1 + nota2) / 2;

        if (media >= 7 && frequencia >= 75 || media >= 6 && frequencia >= 90) {
            System.out.println("aprovado");

        } else {
            System.out.println("reprovado");
        }


    }
}


