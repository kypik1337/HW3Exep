import java.util.Scanner;

public class FloatNumber{
    public static void main(String[] args) {
        System.out.println(convertFloatNumber());
        
    }
     public static float convertFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите дробное число (разделитель точка)");
        String number = null;
        while (number == null) {
            number = scanner.next();
            try {
                Float.parseFloat(number);
            } catch (NumberFormatException e) {
                System.out.println("повторите ввод (разделитель точка)");
                number = null;
            }
        }
        return Float.parseFloat(number);
    }
}