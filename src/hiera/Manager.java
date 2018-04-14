package hiera;

public class Manager extends Worker implements Management{

    private boolean hasGymAccess;

    public Manager(int salary, String name, String lastname,  boolean hasGymAccess) {
        super(salary, name, lastname);
        this.hasGymAccess = hasGymAccess;
    }

    public boolean isHasGymAccess() {
        return hasGymAccess;
    }

    public void setHasGymAccess(boolean hasGymAccess) {
        this.hasGymAccess = hasGymAccess;
    }

    @Override
    public void shout() {
        System.out.println("Pracuj tam szybciej, bo nie bede mial premi! ");
    }

    @Override
    public void kickOut(String name) {
        System.out.println("Wyrzucam z pracy: " + name);
    }


}
