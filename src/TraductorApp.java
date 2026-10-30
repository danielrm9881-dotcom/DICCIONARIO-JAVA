import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TraductorApp {
    public static void main(String[] args) {
        // 1. Crear un diccionario Español-Inglés con al menos 20 palabras usando un HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("auto", "car");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("manzana", "apple");
        diccionario.put("escuela", "school");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("comida", "food");
        diccionario.put("leche", "milk");
        diccionario.put("camino", "path");

        // 2. Escoger al azar 5 palabras en español del diccionario
        List<String> palabrasEspanol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabrasEspanol);
        List<String> seleccionadas = palabrasEspanol.subList(0, 5);

        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("=== MINI DICCIONARIO: ESPAÑOL - INGLÉS ===");
        System.out.println("Escribe la traducción en inglés para cada una de las siguientes palabras:\n");

        // 3. Pedir al usuario que teclee la traducción al inglés y comprobar si son correctas
        for (String palabraEsp : seleccionadas) {
            System.out.print("¿Cómo se dice '" + palabraEsp + "' en inglés?: ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            String traduccionCorrecta = diccionario.get(palabraEsp);

            if (respuestaUsuario.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!\n");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + traduccionCorrecta + "\n");
                incorrectas++;
            }
        }

        // 4. Mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario
        System.out.println("================================");
        System.out.println("       RESULTADOS FINALES       ");
        System.out.println("================================");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}