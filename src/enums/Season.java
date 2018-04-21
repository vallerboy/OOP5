package enums;

public enum Season {
    WINTER(-20), SUMMER(30), SPRING(20),  AUTUMN(15);

    private int avgTemp;

    Season(int avgTemp){
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}