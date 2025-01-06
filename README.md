# Proyecto: API de Tipo de Cambio

## Descripción
Este proyecto en Java permite realizar peticiones a una API externa para obtener información de tipo de cambio entre diferentes monedas. Además, proporciona funcionalidades para analizar y extraer datos específicos del JSON recibido.

## Tecnologías Utilizadas
- **Java 11 o superior**: Para el desarrollo del proyecto.
- **HttpClient**: Manejo de peticiones HTTP.
- **Gson**: Parseo y manejo de datos en formato JSON.

## Características
- Realizar peticiones HTTP a la API de tipo de cambio.
- Parsear respuestas JSON para extraer información relevante como:
  - Tasa de conversión (conversion_rate).
  - Moneda base (base_code).
  - Moneda objetivo (target_code).
- Diseño modular con métodos reutilizables.

## Requisitos
1. **Java 11 o superior**.
2. **Dependencias**:
   - Gson:
     ```xml
     <dependency>
         <groupId>com.google.code.gson</groupId>
         <artifactId>gson</artifactId>
         <version>2.11.0</version>
     </dependency>
     ```

## Estructura del Proyecto
- **Main.java**:
  - Contiene el menu junto con las opciones a imprimir, realiza el llamado a los otros modulos.
- **ExchangeRateAPI.java**:
  - Contiene el método para realizar peticiones HTTP a la API.
- **JSONExtractor.java**:
  - Verifica si la moneda es distinta, en caso que sea así realiza la respectiva multiplicación

