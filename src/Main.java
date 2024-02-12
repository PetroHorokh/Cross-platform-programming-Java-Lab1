import java.util.*;

public class Main {

    public static void task1(Scanner scanner){

        System.out.println("Завдання №1");

        double A, B, C;

        System.out.print("Введіть довжину ребра A: ");
        A = scanner.nextDouble();

        System.out.print("Введіть довжину ребра B: ");
        B = scanner.nextDouble();

        System.out.print("Введіть довжину ребра C: ");
        C = scanner.nextDouble();

        double volume = A * B * C;
        System.out.println("Об'єм прямокутного паралелепіпеда: " + volume);

        double surfaceArea = 2 * (A * B + A * C + B * C);
        System.out.println("Площа поверхні прямокутного паралелепіпеда: " + surfaceArea);
    }

    public static void task2(Scanner scanner){

        System.out.println("Завдання №2");

        int number;

        System.out.print("Введіть чотирицифрове натуральне число: ");
        number = scanner.nextInt();

        int firstDigit = number / 1000;
        int fourthDigit = number % 10;

        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;

        int productOfOuterDigits = firstDigit * fourthDigit;
        int productOfInnerDigits = secondDigit * thirdDigit;

        int difference = productOfOuterDigits - productOfInnerDigits;

        System.out.println("Різниця добутків крайніх і внутрішніх цифр: " + difference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);

        task2(scanner);
    }
}