package reflection;

@Doc(info = "Klasa reprezentująca człowieka")
public final class Person {

    @Doc(info = "Pole reprezentujące wiek (zakres od 0-99)")
    private int age;
    @Doc(info = "Pole reprezentujące imię człowieka")
    public String name;


    @Doc(info = "Konstruktor z dwoma argumentami")
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Doc(info = "Konstruktor bez arg")
    public Person() {
    }



    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void shout(){
        System.out.println("Krzyyyycze");
    }


    @Deprecated
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
