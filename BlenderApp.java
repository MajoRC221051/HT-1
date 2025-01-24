import java.util.Scanner;

public class BlenderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la licuadora
        BlenderInterface blender = new Blender();
        int option;

        do { // Menú
            System.out.println("  ╔════════════════════════════════════╗");
            System.out.println("  ║           * Blender Menu *         ║");
            System.out.println("  ╠════════════════════════════════════╣");
            System.out.println("  ║  1. Encender la licuadora          ║");
            System.out.println("  ║  2. Llenar la licuadora            ║");
            System.out.println("  ║  3. Aumentar velocidad (0-20)      ║");
            System.out.println("  ║  4. Verificar velocidad            ║");
            System.out.println("  ║  5. Verificar si está llena        ║");
            System.out.println("  ║  6. Vaciar licuadora               ║");
            System.out.println("  ║  7. Apagar la licuadora  (Salir)   ║");
            System.out.println("  ╚════════════════════════════════════╝");
            System.out.print("  -*- Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    blender.turnOn();
                    break;
                case 2:
                    System.out.print("*Ingresa el contenido*: ");
                    String content = scanner.nextLine();
                    blender.fill(content);
                    break;
                case 3:
                    blender.increaseSpeed();
                    break;
                case 4:
                    System.out.println("*La velocidad actual es*: " + blender.getSpeed());
                    break;
                case 5:
                    System.out.println("*La licuadora está llena*: " + blender.isFull());
                    break;
                case 6:
                    blender.emptyBlender();
                    break;
                case 7:
                    System.out.println("*Apagando la licuadora, saliendo...*");
                    break;
                default:
                    System.out.println("*Esa opción no es válida, prueba otra vez :(*");
            }
        } while (option != 7);

        scanner.close();
    }
}
