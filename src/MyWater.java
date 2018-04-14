public class MyWater {
    private static int BIG_BOTTLE = 2;
    private static int MID_BOTTLE = 1;
    private static float SMALL_BOTTLE = 0.5f;

    private int bigBottleCount;
    private int midBottleCount;
    private int smallBottleCount;


    public void addBigBottle(int i){
        bigBottleCount += i;
    }

    public void addMidBottle(int i){
        midBottleCount += i;
    }

    public void addSmallBottle(int i){
        smallBottleCount += i;
    }

    public float getAllWater(){
        return bigBottleCount * BIG_BOTTLE +
                midBottleCount * MID_BOTTLE +
                smallBottleCount * SMALL_BOTTLE;
    }

    public static int getBigBottle() {
        return BIG_BOTTLE;
    }

    public static void setBigBottle(int bigBottle) {
        BIG_BOTTLE = bigBottle;
    }

    public static int getMidBottle() {
        return MID_BOTTLE;
    }

    public static void setMidBottle(int midBottle) {
        MID_BOTTLE = midBottle;
    }

    public static float getSmallBottle() {
        return SMALL_BOTTLE;
    }

    public static void setSmallBottle(float smallBottle) {
        SMALL_BOTTLE = smallBottle;
    }

    @Override
    public String toString() {
        return "Capity: " + getAllWater();
    }
}
