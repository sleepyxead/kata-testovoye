import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String FirstNum = "";
        String SecNum = "";
        int result = 0;
        int IntFirstNum = 0;
        int IntSecNum = 0;
        int FNdiv = IntFirstNum % 2;
        int SNdiv = IntSecNum % 2;
        char operator = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с выражением (например, 2 + 2): ");
        String expression = scanner.nextLine();
        String[] parts = expression.split(" ");
        FirstNum = parts[0];
        try {
            SecNum = parts[2];
            operator = parts[1].charAt(0);
        } catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Ошибка: введеная строка не в формате");
            return;
        }

        try{
            IntFirstNum = Integer.parseInt(FirstNum);
        } catch (NumberFormatException forInputString) {
            System.out.println("Ошибка: введеное число является римским или не целым");
            return;
        }
        try{
            IntSecNum = Integer.parseInt(SecNum);
        } catch (NumberFormatException forInputString) {
            System.out.println("Ошибка: введеное число является римским или не целым");
            return;
        }
        if (IntFirstNum > 10 || IntSecNum > 10) {
            throw new ArithmeticException("Ошибка: введенное число превышает 10.");
        }
        if (IntFirstNum < 1 || IntSecNum < 1) {
            throw new ArithmeticException("Ошибка: введенное число меньше 1.");
        }
        if (FNdiv != 0 || SNdiv != 0) {
            throw new ArithmeticException("Ошибка: введенное число не является целым.");
        }
        switch (operator) {
            case '+' -> result = IntFirstNum + IntSecNum;
            case '-' -> result = IntFirstNum - IntSecNum;
            case '*' -> result = IntFirstNum * IntSecNum;
            case '/' -> result = IntFirstNum / IntSecNum;
            default -> {
                System.out.println("Ошибка: некорректный символ операции.");
                return;
            }
        }
        System.out.println("Результат: " + result);
    }
}