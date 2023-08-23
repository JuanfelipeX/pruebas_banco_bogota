import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> c = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Contar la frecuencia del número en el mapa 'c'
            // Si el número ya está en el mapa, aumentar su frecuencia en 1, de lo contrario, establecerlo en 1
            int num = scanner.nextInt();
            c.put(num, c.getOrDefault(num, 0) + 1);
        }
        int ans = 0;

        // Calcular la respuesta final sumando la mitad de la frecuencia de cada número en el mapa 'c'
        for (int x : c.keySet()) {
            ans += c.get(x) / 2;
        }
        System.out.println(ans);
    }
}

//9 10 20 20 10 10 30 50 10 20
//3
