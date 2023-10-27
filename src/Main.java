import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        // Создаем экземпляр класса Random
        Random rand = new Random();

        int[] arr_random = new int[10];
        // Генерируем рандомные целые числа в диапазоне 0 to 50
        for (int i = 0; i < arr_random.length; i++){
            arr_random[i] = rand.nextInt(51);
        }

        System.out.println("arr_random:");
        System.out.println(Arrays.toString(arr_random));
        Arrays.sort(arr_random);
        System.out.println("sorted arr_random:");
        System.out.println(Arrays.toString(arr_random));

        int[] arr_math_random = new int[10];

        for (int i = 0; i < arr_math_random.length; i++){
            arr_math_random[i] = (int)(Math.random() * 100);
        }

        System.out.println("arr_math_random:");
        System.out.println(Arrays.toString(arr_math_random));
        Arrays.sort(arr_math_random);
        System.out.println("sorted arr_math_random:");
        System.out.println(Arrays.toString(arr_math_random));

        // Task 3

        int[] four_random = new int[4];
        // Генерируем рандомные целые числа в диапазоне 10 to 99
        for (int i = 0; i < four_random.length; i++){
            four_random[i] = rand.nextInt(90) + 10;
        }

        System.out.println("four_random:");
        System.out.println(Arrays.toString(four_random));

        boolean flag = true;
        for (int i = 0; i < four_random.length - 1; i++){
            if (four_random[i] >= four_random[i+1]){
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("Массив four_random сторого возрастающий.");
        }else{
            System.out.println("Массив four_random НЕ сторого возрастающий.");
        }

        // Task 4

        Scanner in = new Scanner(System.in);

        System.out.print("Enter array's length (int, >0): ");
        String answer = in.next();
        boolean error = false;

        do {
            if (answer.contains(".") || answer.equals("0")){
                error = true;
                System.out.print("Wrong! Enter array's length again (int, >0): ");
                answer = in.next();
            }else{
                error = false;
            }
        }while(error == true);

        int n = Integer.parseInt(answer);
        int cnt_even = 0;

        int[] this_arr = new int[n];
        // Генерируем рандомные целые числа в диапазоне 0 to n
        for (int i = 0; i < this_arr.length; i++){
            this_arr[i] = rand.nextInt(n+1);
            if ((this_arr[i] % 2) == 0){
                cnt_even++;
            }
        }

        System.out.println("this_arr:");
        System.out.println(Arrays.toString(this_arr));

        int[] even_arr = new int[cnt_even];
        int j = 0;

        for (int  i = 0; i < this_arr.length; i++){
            if ((this_arr[i] % 2) == 0){
                even_arr[j] = this_arr[i];
                j++;
            }
        }

        System.out.println("even_arr:");
        System.out.println(Arrays.toString(even_arr));

    }
}

