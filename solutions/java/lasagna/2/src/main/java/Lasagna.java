public class Lasagna {

    private static final int EXPECTED_MIN_IN_OVEN = 40;
    private static final int PREP_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MIN_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    
    public int preparationTimeInMinutes(int layersAdded) {
        return layersAdded * PREP_TIME_PER_LAYER;
    }
    
    public int totalTimeInMinutes(int layersAdded, int actualMinutesInOven) {
        return preparationTimeInMinutes(layersAdded) + actualMinutesInOven;
    }
}
