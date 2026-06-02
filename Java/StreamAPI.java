import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamAPI{
    public static void main(String args[])
    {
        List<Integer> n=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> e=n.stream().filter(nu->nu%2==0).collect(Collectors.toList());
        System.out.println(e);
    }
}