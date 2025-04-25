import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: if-else para la edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad == 18) {
            System.out.println("Tienes exactamente 18 años.");
        } else {
            System.out.println("Eres mayor de edad.");
        }

        // Parte 2: switch para el día de la semana
        System.out.print("Ingresa un número del 1 al 7 para saber el día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Debe ser entre 1 y 7.");
        }

        scanner.close();
    }
}
