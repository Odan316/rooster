package com.dakkaplace.rooster.Application;

import com.dakkaplace.rooster.Domain.Roster;

import java.util.ArrayList;

public interface RosterStorage {
    ArrayList<Roster> getAll();
}
