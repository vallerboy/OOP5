package reflection;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Doc {
     String info();
}
