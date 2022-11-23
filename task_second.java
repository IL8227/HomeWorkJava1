// Вывести все простые числа от 1 до 1000


public class task_second {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j != 0) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
