import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char t;


            while(true){
                System.out.println("Select Operation");
                 t = sc.next().charAt(0);
            if (t == '+') {

                System.out.println("Addition is selected");
            } else if (t == '-') {
                System.out.println("Subtraction is selected");
            } else if (t == '*') {
                System.out.println("Multiplication is selected");
            } else if (t == '/') {
                System.out.println("Division is selected");
            }
            else if (t == '0') {
                System.out.println("Exit");
                break;
            }
            else {
                System.out.println("Wrong operator entered");
            }
                System.out.println("Take 2 inputs");
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
            switch (t) {

                case '+':

                    int add = a + b;
                    System.out.println(a + "+" + b + "=" + add);
                    break;

                case '-':

                    int sub = a - b;
                    System.out.println(a + "-" + b + "=" + sub);
                    break;

                case '*':
                    int mul = a * b;
                    System.out.println(a + "*" + b + "=" + mul);
                    break;

                case '/':
                    int div = a / b;
                    System.out.println(a + "/" + b + "=" + div);
                    break;

                default:
                    System.out.println("Wrong");
            }

        }

    }

}