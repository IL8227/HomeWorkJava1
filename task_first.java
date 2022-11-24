// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)


import java.util.Scanner;
public class task_first { 
    static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i ++) {
            result = result + i;
        }
        return result;
    }
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i ++) {
            result = result * i;
        }
        return result;       
    } 

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберите операцию:\n1. Сложение.\n2. Факториал.\n");
        int a = iScanner.nextInt();
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        switch (a) {
            case 1 : 
            System.out.println(sum(n));
            break;
            case 2 :
            System.out.println(factorial(n));
            break;
            
        }
        iScanner.close();
    }
}           
    
    
