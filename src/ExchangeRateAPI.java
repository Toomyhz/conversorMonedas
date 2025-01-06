import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ExchangeRateAPI {
    private static final String API_KEY = "5db599ac94eecd0a2ec76349";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/"+ API_KEY + "/pair/";

    public double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            String url = BASE_URL + fromCurrency + "/" + toCurrency;
            // Construye la solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Envía la solicitud y obtiene la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Procesa la respuesta JSON
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            double conversion = jsonObject.get("conversion_rate").getAsDouble();

            return conversion;
        } catch (Exception e) {
            System.err.println("Error al obtener las tasas de cambio: " + e.getMessage());
            return 0.0;
        }
    }
}
