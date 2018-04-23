package reflection;

import sun.security.jca.GetInstance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Method[] methodsInMyClass = Person.class.getDeclaredMethods();
        try {
            Person person  = Person.class.newInstance();

            for (Method inMyClass : methodsInMyClass) {
                if(inMyClass.getName().equals("shout")){
                    inMyClass.invoke(person, null);
                }
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
