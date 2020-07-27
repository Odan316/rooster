package com.dakkaplace.rooster.Infrastructure;

import com.dakkaplace.rooster.Application.RosterStorage;
import com.dakkaplace.rooster.Domain.Roster;

import java.util.ArrayList;

final public class StubRosterStorage implements RosterStorage {

    @Override
    public ArrayList<Roster> getAll() {
        ArrayList<Roster> list = new  ArrayList<>();
        list.add(Roster.createNew(1, "First Roster"));
        list.add(Roster.createNew(2, "Second Roster"));
        list.add(Roster.createNew(3, "Third Roster"));

        return list;
    }
}
