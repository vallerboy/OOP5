import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private int height;

    Person(int age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    Person(int age, String name){
        this(age, name, 0);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                height == person.height &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }
}
