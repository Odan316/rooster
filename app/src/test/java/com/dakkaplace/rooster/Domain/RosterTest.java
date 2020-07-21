package com.dakkaplace.rooster.Domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class RosterTest {

    @Test
    public void testCreateNew() {
        Roster roster = Roster.createNew(1, "Test");

        assertEquals(roster.getTitle(), "Test");
        assertEquals(roster.getId(), 1);
    }

    @Test
    public void testSetTitle() {
        Roster roster = Roster.createNew(1, "Test");
        roster.setTitle("Test2");

        assertEquals(roster.getTitle(), "Test2");
    }
}
