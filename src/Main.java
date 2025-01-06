import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int mainOption = scanner.nextInt();

            switch (mainOption) {
                case 1:
                    System.out.println("\nSelecciona la moneda de origen:");
                    String fromCurrency = selectCurrency(scanner);

                    System.out.println("\nSelecciona la moneda de destino:");
                    String toCurrency = selectCurrency(scanner);

                    System.out.print("\nIngresa la cantidad a convertir: ");
                    double amount = scanner.nextDouble();

                    // Llama a CurrencyConverter para realizar la conversión
                    double result = converter.convert(amount, fromCurrency, toCurrency);

                    if (result != 0.0) {
                        System.out.printf("\nResultado: %.2f %s equivale a %.2f %s\n",
                                amount, fromCurrency, result, toCurrency);
                    } else {
                        System.out.println("No se pudo realizar la conversión. Verifica las monedas o tu conexión.");
                    }
                    break;

                case 2:
                    exit = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private static String selectCurrency(Scanner scanner) {
        System.out.println("1. USD (Dólar estadounidense)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. CLP (Peso chileno)");
        System.out.println("4. GBP (Libra esterlina)");
        System.out.println("5. JPY (Yen japonés)");
        System.out.print("Elige una opción: ");
        int currencyOption = scanner.nextInt();

        switch (currencyOption) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "CLP";
            case 4:
                return "GBP";
            case 5:
                return "JPY";
            default:
                System.out.println("Opción no válida. Se seleccionará USD por defecto.");
                return "USD";
        }
    }
}

