// Вывести все простые числа от 1 до 1000


public class task_second {
    public static void main(String[] args) {
        int input = 1000;
        boolean b = true;
        for (int P = 2; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    } 
}
