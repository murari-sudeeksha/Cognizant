import java.lang.reflect.Method;

class Demo {

    public void show() {
        System.out.println("Reflection Example");
    }
}

public class ReflectionInJava {

    public static void main(String[] args)
            throws Exception {

        Class<?> c =
                Class.forName("Demo");

        Object obj =
                c.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                c.getDeclaredMethods();

        for(Method m : methods) {

            System.out.println(
                    "Method: " + m.getName());

            m.invoke(obj);
        }
    }
}