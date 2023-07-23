import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String FirstNum;
        String SecNum;
        int result = 0;
        int IntFirstNum;
        int IntSecNum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с выражением (например, 2 + 2): ");
        String expression = scanner.nextLine();
        String[] parts = expression.split(" ");
        FirstNum = parts[0];
        SecNum = parts[2];
        char operator = parts[1].charAt(0);
        IntFirstNum = Integer.parseInt(FirstNum);
        IntSecNum = Integer.parseInt(SecNum);
        if (IntFirstNum > 10 || IntSecNum > 10) {
            throw new ArithmeticException("Ошибка: введенное число превышает 10.");
        }
        if (IntFirstNum < 1 || IntSecNum < 1) {
            throw new ArithmeticException("Ошибка: введенное число меньше 1.");
        }
        switch (operator) {
            case '+' -> result = IntFirstNum + IntSecNum;
            case '-' -> result = IntFirstNum - IntSecNum;
            case '*' -> result = IntFirstNum * IntSecNum;
            case '/' -> result = IntFirstNum / IntSecNum;
            default -> System.out.println("Ошибка: некорректный символ операции.");
        }
        System.out.println("Результат: " + result);
    }
}