public class Formatter {

    public String getRuble(double num) {
        num = Math.floor(num);
        double preLastDigit = (num % 100 / 10);
        if (preLastDigit == 1) {
            return "рублей";
        }

        return switch ((int) (num % 10)) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
}
