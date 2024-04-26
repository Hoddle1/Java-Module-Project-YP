import java.util.ArrayList;

public class Calculator {
    int countPersons;
    ArrayList<Product> products = new ArrayList<>();
    double total;

    Calculator(int countPersons) {
        this.countPersons = countPersons;
    }

    void addProduct(Product product) {
        total += product.price;
        products.add(product);
        System.out.println("Товар добавлен!");
    }

    void printProducts() {
        System.out.println("\nДобавленные товары:");
        for (Product product : products) {
            System.out.printf("%s (%.2f)\n", product.name, product.price);
        }
        printSplitPrice();
    }

    void printSplitPrice() {
        Formatter formatter = new Formatter();
        double splitPrice = total / countPersons;
        System.out.printf("Каждый человек должен заплатить %.2f %s\n", splitPrice, formatter.getRuble(splitPrice));
    }

}
