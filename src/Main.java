import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int a1= input.nextInt();
        int b1 = input.nextInt();
        int x2 = input.nextInt();
        int a2= input.nextInt();
        int b2 = input.nextInt();
        int x3 = input.nextInt();
        int a3= input.nextInt();
        int b3 = input.nextInt();

        Expression e1 = new Expression(x1, a1, b1);
        e1.expression1();

        Expression e2 = new Expression(x2, a2, b2);
        e2.expression2();

        Expression e3 = new Expression(x3, a3, b3);
        e3.expression3();
    }

    static class Expression{
        public int x;
        public int a;
        public int b;

        Expression(int x, int a, int b){
            this.x = x;
            this.a = a;
            this.b = b;
        }

        public void expression1(){ // y = 3x + 5
            int result = 3 * x + 5;
            System.out.printf("\ny = %d", result);
        }

        public void expression2(){ //y = (a + b) / (a - b)
            if(a - b == 0){
                System.out.println("На ноль делить нельзя!");
                return;
            }

            int result = (a + b) / (a - b);
            System.out.printf("\ny = %d", result);
        }

        public void expression3(){ //y = (ax / b)!
            if (b == 0){
                System.out.println("На ноль делить нельзя!");
                return;
            }

            int number = a * x / b;
            int result = 1;
            for(int i = 1; i <= number; i++){
                result *= i;
            }
            System.out.printf("\ny = %d", result);
        }
    }
}