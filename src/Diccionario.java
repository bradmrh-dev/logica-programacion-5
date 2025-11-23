import java.util.*;

public class Diccionario {
    public static void main(String[] args) {

        // Crear el diccionario, con definiciones en español e inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("comida", "food");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("computadora", "computer");
        diccionario.put("carro", "car");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");
        diccionario.put("ballena", "whale");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("comer", "eat");
        diccionario.put("beber", "drink");
        diccionario.put("historia", "history");
        diccionario.put("ciudad", "city");
        diccionario.put("país", "country");
        diccionario.put("luna", "moon");
        diccionario.put("sol", "sun");
        diccionario.put("código", "code");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String jugarOtraVez = "s";
        while (jugarOtraVez.equals("s")) {

            // Hacer una lista para elegir al azar
            // .keyset devuelve todos los valores del HashMap en español
            List<String> palabras = new ArrayList<>(diccionario.keySet());

            // Mostrar cantidades de palabras correctas e incorrectas
            int correctas = 0;
            int incorrectas = 0;

            System.out.println("Bienvenido al diccionario de Brad");
            System.out.println("Traduce las siguientes palabras para comprobar tus conocimientos:\n");

            // Elegir 5 palabras al azar
            for (int i = 0; i < 5; i++) {
                String palabraAleatoria = palabras.get(random.nextInt(palabras.size()));

                System.out.println("Traduce: " + palabraAleatoria + ":");
                String respuesta = scanner.nextLine().toLowerCase().trim();

                // Comprobar si es correcta
                if (respuesta.equals(diccionario.get(palabraAleatoria))) {
                    System.out.println("Correcto\n");
                    correctas++;
                } else {
                    System.out.println("Incorrecto\n");
                    incorrectas++;
                }

                // Evitar palabras repetidas por cada intento
                palabras.remove(palabraAleatoria);
            }

            // Mostrar el resultado de las traducciones
            System.out.println("Resultado:");
            System.out.println("Palabras correctas:" + correctas);
            System.out.println("Palabras incorrectas: " + incorrectas);

            // Preguntar si quieres jugar de nuevo
            System.out.println("¿Quieres intentarlo de nuevo? (s / n");
            jugarOtraVez = scanner.nextLine().toLowerCase().trim();
            System.out.println();
        }
        // Salir del programa
        System.out.println("Gracias por jugar en el diccionario de Brad");
    }
}
