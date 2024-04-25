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
        System.out.println("Добавленные товары:");
        for (Product product : products) {
            System.out.println(product.name);
        }

        printSplitPrice();
    }

    void printSplitPrice() {
        Formatter formater = new Formatter();
        double splitPrice = total / countPersons;
        System.out.printf("Каждый человек должен заплатить %.2f %s", splitPrice, formater.getRubleAddition(splitPrice));
    }

}
