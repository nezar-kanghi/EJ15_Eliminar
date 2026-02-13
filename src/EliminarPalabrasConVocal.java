import java.util.*;

public class EliminarPalabrasConVocal {

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar == true) {
            System.out.print("Introduce una palabra (FIN para terminar): ");
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("FIN")) {
                continuar = false;
            } else {
                palabras.add(palabra);
            }
        }

        System.out.print("Introduce una vocal: ");
        String vocal = scanner.next().toLowerCase();

        Iterator<String> it = palabras.iterator();

        while (it.hasNext()) {
            String palabra = it.next();

            if (palabra.toLowerCase().contains(vocal)) {
                it.remove();
            }
        }

        System.out.println("Lista resultante:");
        System.out.println(palabras);
    }
}
