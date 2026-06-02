import java.util.*;
class LambdaExpressions{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> s=new ArrayList<>();
        s.add("mango");
        s.add("banana");
        s.add("kite");

       Collections.sort(s,(a,b)->a.compareTo(b));
        System.out.println(s);


    }
}