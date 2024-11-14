import java.util.Scanner;

public class SumaPosyNeg8 {

    public static void calcularSumaPositivosYNegativos(int[] numeros) {
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }


        System.out.println("Suma de números positivos: " + sumaPositivos);
        System.out.println("Suma de números negativos: " + sumaNegativos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números (positivos o negativos):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        calcularSumaPositivosYNegativos(numeros);

        sc.close();
    }
}


