import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //задание 1.
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + IntStream.of(arr).sum() + " рублей");

        //задание 2.
        System.out.println("Задание 2");
        int min = 200001;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                for (int j : arr) {
                    if (j < min) {
                        min = j;
                    }
                    if (arr[i] > max) {
                        max = arr[i];
                        if (j > max) {
                            max = j;
                        }
                    }
                    System.out.println("Минимальная сумма трат за день" +
                            " составила "+ min  +" рублей. Максимальная" +
                            " сумма трат за день составила "+ max  +" рублей");
                }
            }
        }
        //задание 3.
        System.out.println("Задание 3");
        double sredExpenses=IntStream.of(arr).sum()/ arr.length;
        System.out.println("«Средняя сумма трат за месяц составила "+ sredExpenses +" рублей»");
        double mediumExpenses = IntStream.of(arr).sum()/ arr.length;
        System.out.println("«Средняя сумма трат за месяц составила "+ mediumExpenses +" рублей»");

        //задание 4.
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        StringBuilder sb = new StringBuilder();
        for(char c : reverseFullName) {
            sb.insert(0, c);
        }
        String reversed = sb.toString();
        System.out.print(reversed);
    }
}