import java.util.Scanner;
public class CalculatorUsingMethods {

public static int add(int a,int b){

    int res=a+b;
    System.out.println(a + "+" + b + "=" + res);
    return res;
}
    public static int sub(int a,int b){

        int res=a-b;
        System.out.println(a + "-" + b + "=" + res);
        return res;
    }
    public static int multiply(int a,int b){

        int res=a*b;
        System.out.println(a + "*" + b + "=" + res);
        return res;
    }
    public static int div(int a,int b){

        int res=a/b;
        System.out.println(a + "/" + b + "=" + res);
        return res;
    }
    public static double power(int a,int b){

        double res=Math.pow(a,b);
        System.out.println(a + "^" + b + "=" + res);
        return res;
    }
    public static float percentage(int a,int b){

        float per = (float)(a*(100.0/b));
        System.out.println(a + "%" + b + "=" + per);
        return per;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char t;
        while(true) {
            System.out.println("Select Operation");
            t = sc.next().charAt(0);
            int a,b;
            if (t == '+') {
                System.out.println("Addition is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                add(a, b);
            } else if (t == '-') {
                System.out.println("Subtraction is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                sub(a,b);
            } else if (t == '*') {
                System.out.println("Multiplication is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                multiply(a,b);
            } else if (t == '/') {
                System.out.println("Division is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                div(a,b);
            } else if (t == '^') {
                System.out.println("Power is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                power(a,b);
            } else if (t == '%') {
                System.out.println("Percentage is selected");
                System.out.println("Take 2 inputs");
                a = sc.nextInt();
                b = sc.nextInt();
                percentage(a,b);
            } else if (t == '0') {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Wrong operator entered");
            }


        }
    }
}
