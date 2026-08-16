import java.util.Scanner;
public class shailu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i < 2) continue;
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.print(i + " ");
        }
    }
}

