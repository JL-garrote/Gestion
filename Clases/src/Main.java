import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opciones = 0;
        boolean admin = false;

        Scanner keyboard = new Scanner(System.in);

        try {

            do {
                System.out.println("Insertar alumno");
                System.out.println("Leer datos");
                System.out.println("Salir");

                opciones = keyboard.nextInt();

                switch (opciones) {

                    case 1: {

                    }

                    case 2: {

                    }

                    case 3: {
                        break;
                    }
                }

            }while (opciones != 3);

        } catch (Exception e) {
            System.err.println("[Error en el menu principal]");
        }
    }
}