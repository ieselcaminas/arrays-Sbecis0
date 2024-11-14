import java.util.Scanner;

public class Mes17 {


    public static int obtenerDiasDelMes(int mes) {

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        return diasPorMes[mes - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();


        if (mes < 1 || mes > 12) {
            System.out.println("Error: El mes debe estar entre 1 y 12.");
        } else {

            int dias = obtenerDiasDelMes(mes);


            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }

        scanner.close();
    }
}

