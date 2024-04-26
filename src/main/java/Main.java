import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("На сколько человек необходимо разделить счёт?");
        int countPersons = getCountPersons();
        Calculator calculator = getComliteCalculator(countPersons);
        calculator.printProducts();
    }

    private static Calculator getComliteCalculator(int countPersons) {
        Calculator calculator = new Calculator(countPersons);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название товара:");
            String productName = scanner.next();

            double productPrice = 0;
            boolean validPrice = false;
            while (!validPrice) {
                System.out.println("Введите цену товара:");
                if (scanner.hasNextDouble()) {
                    productPrice = scanner.nextDouble();
                    validPrice = true;
                } else {
                    scanner.next();
                    System.out.println("Вы ввели не число");
                }
            }
            calculator.addProduct(new Product(productName, productPrice));

            System.out.println("\nХотите добавить еще один товар?");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("Завершить")) {
                return calculator;
            }
        }
    }

    private static int getCountPersons() {
        int count = 0;
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);

        while (!isValid) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("Колличество человек не может быть равно 1.\nВведите корректное число гостей:");
                } else if (input < 1) {
                    System.out.println("Колличество человек не может быть меньше 1.\nВведите корректное число гостей:");
                } else {
                    count = input;
                    isValid = true;
                }
            } else {
                scanner.next();
                System.out.println("Вы ввели не целое число");
            }
        }

        return count;
    }
}