package Stream;

    import QUeue.MyHAsh;

    import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

    public class MethodParameterLister {

        public static void main(String[] args) {
      listMethodsAndParameters(MyHAsh.class);
        }

        public static void listMethodsAndParameters(Class<?> myClass) {
            Method[] methods = myClass.getDeclaredMethods();

            Arrays.stream(methods)

                    .forEach(method -> {
        System.out.println("METHod: " + method.getName());
        Parameter[] parameters = method.getParameters();
        if (parameters.length > 0) {
             System.out.println("Parameters:");
           Arrays.stream(parameters)
           .forEach(parameter -> System.out.println(parameter.getType() + " " + parameter.getName()));
        } else {System.out.println(" paramaetr yoxdu");
                        }
        System.out.println();
                    });
        }

// LISTDEKI ELEMENTLERI FILTER NUM>5
    }

