import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";  // Para almacenar el nombre del usuario
        int userAge = -1;
        int option = 0;

        while (option != 4) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Introducir nombre");
            System.out.println("2. Introducir edad");
            System.out.println("3. Mostrar usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            
            switch (option) {
                case 1:
                    userName = getUserName(scanner);
                    System.out.println("Nombre registrado correctamente.");
                    break;
                case 2:
                    userAge = getUserAge(scanner);
                    System.out.println("Edad registrada correctamente.");
                    break;
                case 3:
                    System.out.println("Opción 3: Mostrar usuario");
                    // Aquí se puede implementar la funcionalidad para mostrar el usuario
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    // Método para solicitar y devolver el nombre del usuario
    public static String getUserName(Scanner scanner) {
        System.out.print("Por favor, introduzca su nombre: ");
        return scanner.nextLine();
    }


    // Método para solicitar y devolver la edad del usuario
    public static int getUserAge(Scanner scanner) {
        System.out.print("Por favor, introduzca su edad: ");
        while (!scanner.hasNextInt()) {  // Validación para asegurarse de que el usuario ingrese un número
            System.out.println("Entrada no válida. Introduzca un número entero para la edad.");
            scanner.next();  // Descartar la entrada inválida
        }
        return scanner.nextInt();
    }
}
