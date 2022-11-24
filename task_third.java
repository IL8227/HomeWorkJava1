// Реализовать простой калькулятор



import java.util.Scanner;
public class task_third { 
    static double sum(double a,double b) {
        double result = a + b;
        String res = String.format("%f + %f = %f",a,b,result);
        System.out.printf("%f + %f = %f",a,b,result);
        return result;
    }
    static double sub(double a,double b) {
        double result = a - b;
        String res = String.format("%f - %f = %f",a,b,result);
        System.out.printf("%f - %f = %f",a,b,result);
        return result;       
    } 
    static double multi(double a,double b) {
        double result = a * b;
        String res = String.format("%f * %f = %f",a,b,result);
        System.out.printf("%f * %f = %f",a,b,result);
        return result;       
    } 
    static double div(double a,double b) {
        double result = a / b;
        String res = String.format("%f / %f = %f",a,b,result);
        System.out.printf("%f / %f = %f",a,b,result);
        return result;       
    } 

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = iScanner.nextInt();
        System.out.printf("Выберите операцию:\n1. Сложение.\n2. Вычитание.\n3. Умножение\n4. Деление\n");
        int n = iScanner.nextInt();
        System.out.printf("Введите число: ");
        int b = iScanner.nextInt();
        switch (n) {
            case 1 : 
            sum(a,b);
            break;
            case 2 :
            sub(a,b);
            break;
            case 3 :
            multi(a,b);
            case 4 :
            div(a,b);
        }
        iScanner.close();
    }
}        