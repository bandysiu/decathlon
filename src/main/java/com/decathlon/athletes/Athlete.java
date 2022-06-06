package com.decathlon.athletes;

import com.decathlon.sports.Decathlon;

public class Athlete {
    private final String name;
    private final int points;
    private final String place;

    public Athlete(String name, int points, String place) {
        this.name = name;
        this.points = points;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getPlace() {
        return place;
    }
}
