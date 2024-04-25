import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("На скольких человек необходимо разделить счёт?");


        int countPersons;
        do {
            countPersons = scanner.nextInt();
            if (countPersons == 1) {
                System.out.println("Колличество человек не может быть равное 1.\nВведите корректное число гостей:");
            }

            if (countPersons < 1) {
                System.out.println("Колличество человек не может быть меньше 1.\nВведите корректное число гостей:");
            }

        } while (countPersons <= 1);

        Calculator calculator = new Calculator(countPersons);
        while(true){
            System.out.println("Введите название товара:");
            String productName = scanner.next();
            System.out.println("Введите цену товара:");
            double price = scanner.nextDouble();
            calculator.addProduct(new Product(productName, price));

            System.out.println("Хотите ли вы добавить еще один товар?");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("Завершить")){
                break;
            }
        }

        calculator.printProducts();

    }
}