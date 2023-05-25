public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        // Задание 1
        System.out.println("Задание 1");
        int costAmount = 0;
        for (int element : arr) {
            costAmount += element;
        }
        System.out.println("Сумма трат за месяц составила " + costAmount + " рублей");
        // Задание 2
        System.out.println("Задание 2");
        int maxCost = 0;
        int minCost = 200_000;
        for (int element : arr) {
            if (element > maxCost) {
                maxCost = element;
            }
            if (element < minCost) {
                minCost = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
        // Задание 3
        System.out.println("Задание 3");
        double costRate = costAmount / arr.length;// Cумму затрат мы считали в задании 1 (No flood edition)
        System.out.println("Средняя сумма трат за месяц составила" + costRate + " рублей");
        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
