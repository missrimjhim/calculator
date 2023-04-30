import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Operation");
        char t=sc.next().charAt(0);
        if(t=='+'){
            System.out.println("Addition is selected");
        } else if (t=='-') {
            System.out.println("Subtraction is selected");
        }
        else if (t=='*') {
            System.out.println("Multiplication is selected");
        }
        else if (t=='/'){
            System.out.println("Division is selected");
        }
        else{
            System.out.println("Wrong operator entered");
        }
        System.out.println("Take 2 inputs");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        switch(t){
            case '+':
                int add=a+b;
                System.out.println(a+"+"+b+"="+add);
                break;

            case '-':
                int sub=a-b;
                System.out.println(a+"-"+b+"="+sub);
                break;

            case '*':
                int mul=a*b;
                System.out.println(a+"*"+b+"="+mul);
                break;

            case '/':
                int div=a/b;
                System.out.println(a+"/"+b+"="+div);
                break;

            default:
                System.out.println("Error");
        }


    }
}