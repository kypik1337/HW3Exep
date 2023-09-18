import java.util.Scanner;

public class EmpatyString {
    public static void main(String[] args) {
        System.out.println("введите строку");
        Scanner scanner = new Scanner(System.in);

        EmptyStringException(scanner.nextLine());
    }
    public static void EmptyStringException(String stringValue) {
        if (stringValue.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }
}
