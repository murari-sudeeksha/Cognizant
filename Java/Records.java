import java.util.*;
import java.util.stream.Collectors;
class Person{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+"("+age+")";
    }
}
class Records {
    public static void main(String args[])
    {
        Person n1=new Person("xyz",12);
          Person n2=new Person("abc",11);
   Person n3=new Person("mnr",21);
   ArrayList<Person> l=new ArrayList<>();
   l.add(n1);
   l.add(n2);
   l.add(n3);
   List<Person> b=l.stream().filter(x->x.age>12).collect(Collectors.toList());
System.out.println(b);
    }
}