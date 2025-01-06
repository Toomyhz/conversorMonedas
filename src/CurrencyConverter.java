public class CurrencyConverter {
    private final ExchangeRateAPI api = new ExchangeRateAPI();

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equalsIgnoreCase(toCurrency)) {
            System.out.println("Las monedas son iguales, no se requiere conversión.");
            return amount;
        }

        double exchangeRate = api.getExchangeRate(fromCurrency, toCurrency);
        if (exchangeRate != 0.0) {
            return amount * exchangeRate;
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
            return 0.0;
        }
    }
}
