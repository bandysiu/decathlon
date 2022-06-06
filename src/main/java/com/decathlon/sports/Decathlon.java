package com.decathlon.sports;

public class Decathlon extends Sport {

    private String name;
    private double run100m;
    private double longJump;
    private double shotPut;
    private double highJump;
    private double run400m;
    private double hurdles;
    private double discusThrow;
    private double poleVault;
    private double javelinThrow;
    private double run1500m;
    private String run1500mString;

    public Decathlon() {}

    public Decathlon(String name, double run100m, double longJump, double shotPut, double highJump, double run400m, double hurdles, double discusThrow, double poleVault, double javelinThrow, double run1500m, String run1500mString) {
        super();
    }

    public static Decathlon createDecathlon(String[] metadata){

        String name = metadata[0];
        double run100m = Double.parseDouble(metadata[1]);
        double longJump = Double.parseDouble(metadata[2]);
        double shotPut = Double.parseDouble(metadata[3]);
        double highJump = Double.parseDouble(metadata[4]);
        double run400m = Double.parseDouble(metadata[5]);
        double hurdles = Double.parseDouble(metadata[6]);
        double discusThrow = Double.parseDouble(metadata[7]);
        double poleVault = Double.parseDouble(metadata[8]);
        double javelinThrow = Double.parseDouble(metadata[9]);
        double run1500m = calculateSeconds(metadata[10]);
        String run1500mString = metadata[10];

        return new Decathlon(name, run100m, longJump, shotPut, highJump, run400m, hurdles, discusThrow, poleVault, javelinThrow, run1500m, run1500mString);
    }

    private static double calculateSeconds(String time){
        double seconds = 0;

        String[] arrayOfStr = time.split("\\.", 3);

        for(int i = 0; i < arrayOfStr.length; i++){
            if (i == 0) seconds += Double.parseDouble(arrayOfStr[i]) * 60;
            else if (i ==1) seconds += Double.parseDouble(arrayOfStr[i]);
            else seconds += Double.parseDouble(arrayOfStr[i]) / 1000;
        }

        return seconds;
    }

    @Override
    void calculatePoints(){

    }
}
