import ru.mirea.lab3.Conventer;

public class TestConventer {
    public static void main(String[] args) {
        Conventer conv = new Conventer(215);
        System.out.println("Lets convent " + conv.getRuble() + " rubles:");

        conv.conventToDollars();
        conv.conventToEuro();
        conv.conventToCNY();
    }

}
