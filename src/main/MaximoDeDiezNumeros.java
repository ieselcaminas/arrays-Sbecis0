import java.util.Scanner;

public class MaximoDeDiezNumeros {


    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


       int maximo = encontrarMaximo(numeros);


        System.out.println("El número mayor es: " + maximo);


        scanner.close();
    }
}

