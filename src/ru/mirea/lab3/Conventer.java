package ru.mirea.lab3;//Создать класс конвертор валют.
import java.text.NumberFormat;
import java.util.Locale;
public class Conventer {
    private double ruble;
    private static final double USD = 96.65;
    private static final double EUR = 103.09;
    private static final double CNY = 0.075536;

    public Conventer(double ruble) {
        this.ruble = ruble;
    }

    public double getRuble() {
        return ruble;
    }

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }

    public void conventToDollars(){
        double ans = ruble / USD;
        NumberFormat USDFormat = NumberFormat.getInstance(Locale.US);
        System.out.println(ruble + " roubles is " + USDFormat.format(ans) + " dollars.");
    }

    public void conventToEuro(){
        double ans = ruble / EUR;
        NumberFormat EURFormat = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(ruble + " roubles is " + EURFormat.format(ans) + " euros.");
    }

    public void conventToCNY(){
        double ans = ruble * CNY;
        NumberFormat USDFormat = NumberFormat.getInstance(Locale.US);
        System.out.println(ruble + " roubles is " + USDFormat.format(ans) + " CNY.");
    }

}
