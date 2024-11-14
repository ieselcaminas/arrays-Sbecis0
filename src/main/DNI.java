import java.util.Scanner;

public class DNI {

    public static char obtenerLetra(int DNI) {

        final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int res = DNI % 23;

        return letras[res];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número del DNI (sin letra): ");
        int numeroDNI = scanner.nextInt();


        char letraDNI = obtenerLetra(numeroDNI);


        System.out.println("El DNI completo es: " + numeroDNI + letraDNI);


        scanner.close();
    }
}









