public class Formatter {


    public String getRubleAddition(double num)
    {

        double preLastDigit = (Math.floor(num) % 100 / 10);
        if (preLastDigit == 1)
        {
            return "рублей";
        }

        return switch ((int) (Math.floor(num) % 10)) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
    }
}
