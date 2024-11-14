import java.util.Scanner;

class Ejemplo7 {

    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.next();
        }

        imprimirEnMarco(cadenas);
    }


    public static void imprimirEnMarco(String[] cadenas) {
        int maxLength = 0;


        for (String cadena : cadenas) {
            if (cadena.length() > maxLength) {
                maxLength = cadena.length();
            }
        }


        StringBuilder bordeBuilder = new StringBuilder();
        for (int i = 0; i < maxLength + 4; i++) {
            bordeBuilder.append('*');
        }
        String borde = bordeBuilder.toString();


        System.out.println(borde);


        for (String cadena : cadenas) {

            String formatoLinea = "* " + String.format("%-" + maxLength + "s", cadena) + " *";
            System.out.println(formatoLinea);
        }


        System.out.println(borde);
    }
}



