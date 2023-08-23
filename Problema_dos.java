import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        miniMaxSum(arr);
    }

    public static void miniMaxSum(int[] arr) {
        int sum = Arrays.stream(arr).sum(); // Calcular la suma de todos los elementos del arreglo
        int max = sum - Arrays.stream(arr).max().getAsInt(); // Calcular la suma menos el valor máximo
        int min = sum - Arrays.stream(arr).min().getAsInt(); // Calcular la suma menos el valor mínimo

        System.out.println(max + " " + min);
    }
}

//1 2 3 4 5
//10 14

//1 3 5 7 9
//16 24
