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

    private int points;

    public Decathlon(String name, double run100m, double longJump, double shotPut, double highJump, double run400m, double hurdles, double discusThrow, double poleVault, double javelinThrow, double run1500m, String run1500mString) {
        this.name = name;
        this.run100m = run100m;
        this.longJump = longJump;
        this.shotPut = shotPut;
        this.highJump = highJump;
        this.run400m = run400m;
        this.hurdles = hurdles;
        this.discusThrow = discusThrow;
        this.poleVault = poleVault;
        this.javelinThrow = javelinThrow;
        this.run1500m = run1500m;
        this.run1500mString = run1500mString;
    }

    public static Decathlon createDecathlon(String[] metadata) {

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

    private static double calculateSeconds(String time) {
        double seconds = 0;

        String[] arrayOfStr = time.split("\\.", 3);

        for (int i = 0; i < arrayOfStr.length; i++) {
            if (i == 0) seconds += Double.parseDouble(arrayOfStr[i]) * 60;
            else if (i == 1) seconds += Double.parseDouble(arrayOfStr[i]);
            else seconds += Double.parseDouble(arrayOfStr[i]) / 1000;
        }

        return seconds;
    }

    @Override
    public void calculatePoints() {
        setPoints((int) (25.4347 * Math.pow((18 - getRun100m()), 1.81) + 0.14354 * Math.pow((getLongJump() * 100 - 220), 1.4) + 51.39 * Math.pow((getShotPut() - 1.5), 1.05) + 0.8465 * Math.pow((getHighJump() * 100 - 75), 1.42) + 1.53775 * Math.pow((82 - getRun400m()), 1.81) + 5.74352 * Math.pow((28.5 - getHurdles()), 1.92) + 12.91 * Math.pow((getDiscusThrow() - 4), 1.1) + 0.2797 * Math.pow((getPoleVault() * 100 - 100), 1.35) + 10.01 * Math.pow((getJavelinThrow() - 7), 1.08) + 0.03768 * Math.pow((480 - getRun1500m()), 1.85)));
    }

    public String getName() {
        return name;
    }

    public double getRun100m() {
        return run100m;
    }

    public double getLongJump() {
        return longJump;
    }

    public double getShotPut() {
        return shotPut;
    }

    public double getHighJump() {
        return highJump;
    }

    public double getRun400m() {
        return run400m;
    }

    public double getHurdles() {
        return hurdles;
    }

    public double getDiscusThrow() {
        return discusThrow;
    }

    public double getPoleVault() {
        return poleVault;
    }

    public double getJavelinThrow() {
        return javelinThrow;
    }

    public double getRun1500m() {
        return run1500m;
    }

    public String getRun1500mString() {
        return run1500mString;
    }

    private void setPoints(int points) {
        this.points = points;
    }
}
