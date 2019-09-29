import java.util.Scanner;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextByte();

        int sum = ((num1 + num2) / num3) * num4;

        System.out.println(sum);
    }
}
