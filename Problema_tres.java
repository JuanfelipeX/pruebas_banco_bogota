import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int maxHeight = Integer.MIN_VALUE; // Inicializado con el valor mínimo posible para rastrear la altura máxima de las velas
        int count = 0;

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();

            // Comprobar si la altura actual es mayor que la altura máxima encontrada hasta ahora
            if (height > maxHeight) {
                maxHeight = height;
                count = 1; // Reiniciar el contador, ya que hemos encontrado una nueva altura máxima
            } else if (height == maxHeight) {
                count++; // Incrementar el contador si encontramos una vela con la misma altura que la máxima
            }
        }

        System.out.println(count);
    }
}

//4 
//3 2 1 3
//2

//4
//4 4 1 3
//2