package com.dakkaplace.rooster.Domain;

final public class Roster {
    private final int id;
    private String title;

    private Roster(int id){
        this.id = id;
    }

    public static Roster createNew(int id, String title) {
        Roster newRoster = new Roster(id);
        newRoster.setTitle(title);

        return newRoster;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}
