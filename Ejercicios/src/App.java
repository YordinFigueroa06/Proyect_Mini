import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("ingresa tu altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");

        scanner.close();
    }
}
