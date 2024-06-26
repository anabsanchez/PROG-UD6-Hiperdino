import java.util.Scanner;

import com.hiperdino.exceptions.SupermarketException;
import com.hiperdino.management.Manager;

public class HiperdinoApp {

    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();
    private static String option;

    public static void main(String[] args) {

        System.out.println("\nHIPERDINO - Simulación de Supermercado");

        while(true) {

            showMenu();
            performAction();
        }
    }

    private static void showMenu() {

        System.out.print("""
            
                            Menú de opciones:
                            1. Abrir caja.
                            2. Añadir un nuevo cliente a la cola.
                            3. Atender un cliente.
                            4. Ver clientes pendientes.
                            5. Cerrar supermercado.
                            Q. Detener simulación.
                            """);
    }

    private static void performAction() {

        System.out.print("-> ");
        option = scanner.nextLine().toUpperCase();

        try {
            switch (option) {
                case "1":
                    manager.openCashier();
                    break;
                case "2":
                    manager.addCustomer();
                    break;
                case "3":
                    manager.serveCustomer();
                    break;
                case "4":
                    manager.checkQueue();
                    break;
                case "5":
                    manager.closeCashier();
                    exitProgram();
                case "Q":
                    exitProgram();
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } catch (SupermarketException supermarketException) {
            System.out.println(supermarketException.getMessage());
        }
    }

    private static void exitProgram() {

        System.out.println("\nSaliendo de la simulación...");
        System.exit(0);
    }
}