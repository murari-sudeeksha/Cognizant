import java.util.*;
class SimpleCalculator{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose the option +,-,*,/");
        char ch=sc.next().charAt(0);
        int c=0;
        switch(ch)
        {
            case '+':c=a+b;
            break;
            case '-':c=a-b;
            break;
            case '*':c=a*b;
            break;
            case '/':c=a/b;
            break;
        }
        System.out.println("res :"+c);
    }
}