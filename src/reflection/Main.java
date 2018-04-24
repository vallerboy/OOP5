package reflection;

import sun.security.jca.GetInstance;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        docStrategy();
    }

    public static void docStrategy(){
        Method[] methods = Person.class.getDeclaredMethods();
        Field[] fields = Person.class.getDeclaredFields();
        Constructor[] constructors = Person.class.getConstructors();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Doc.class)){
                System.out.println(method.getAnnotation(Doc.class).info());
            }
        }


        for (Field field : fields) {
            if(field.isAnnotationPresent(Doc.class)){
                System.out.println(field.getAnnotation(Doc.class).info());
            }
        }

        for (Constructor constructor : constructors) {
            if(constructor.isAnnotationPresent(Doc.class)){
                System.out.println(constructor.getAnnotation(Doc.class));
            }
        }

    }
}
