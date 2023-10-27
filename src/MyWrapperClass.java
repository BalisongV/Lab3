public class MyWrapperClass {
    //В языке Джава у каждого примитивного типа есть соответствующий этому
    //типу ссылочный или объектный тип класс – оболочка или обертка.
    //Типы оболочки используются в Джава, поскольку контейнеры не могут
    //хранить примитивные типы данных. Поэтому необходимо выполнять
    //преобразование примитивного типа к ссылочному.
    public static void main(String[] args) {
        //1. Создайте объекты класса Double, используя методы valueOf().
        Double a = Double.valueOf(9.05);
        Double b = Double.valueOf(5);
        Double c = Double.valueOf(0.1);

        //2. Преобразовать значение типа String к типу double. Используем
        //метод Double.parseDouble().
        System.out.println(Double.parseDouble("55.223"));

        //3. Преобразовать объект класса Double ко всем примитивным типам.
        Double n = Double.valueOf(14.45341237);

        System.out.println("Double to byte: " + n.byteValue());
        System.out.println("Double to short: " + n.shortValue());
        System.out.println("Double to int: " + n.intValue());
        System.out.println("Double to long: " + n.longValue());
        System.out.println("Double to float: " + n.floatValue());
        System.out.println("Double to double: " + n.doubleValue());

        //4. Вывести значение объекта Double на консоль.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //5. Преобразовать литерал типа double к строке: String d =
        //Double.toString(3.14);
        String d = Double.toString(3.14);

        System.out.println(d);
    }

}
