package hiera;

public class Manager extends Worker {

    private boolean hasGymAccess;

    public Manager(int salary, String name, boolean hasGymAccess) {
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
}
