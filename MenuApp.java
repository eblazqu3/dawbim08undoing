import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Opción 1: Introducir nombre");
                    // Aquí se puede implementar la funcionalidad para introducir el nombre
                    break;
                case 2:
                    System.out.println("Opción 2: Introducir edad");
                    // Aquí se puede implementar la funcionalidad para introducir la edad
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
}
