public class Pattern{

    static void check(Object b1)
    {

switch(b1){
    case Integer i->
    System.out.println("Integer "+i);
    case String s->System.out.println("String "+s);
    case Double d->System.out.println("Double "+d);
    case null->System.out.println("null");
     default ->
                    System.out.println("Unknown Type");
    }
    }


    public static void main(String args[])
    {
        check(100);
        check("hello");
        check(3.3);
    }
}