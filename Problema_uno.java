import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> c = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            c.put(num, c.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int x : c.keySet()) {
            ans += c.get(x) / 2;
        }
        System.out.println(ans);
    }
}

//9 10 26 20 16 10 30 50 16 20
//3