package org.pedro.enumerations;

enum Months {
    JAN(31),
    FEB(28),
    MAR(30),
    APR(31),
    MAY(30),
    JUN(31),
    JUL(31),
    AUG(30),
    SEP(30),
    OCT(31),
    NOV(30),
    DEC(31);

    private final int days;

    Months(int days) {
        this.days = days;
    }

    public int tellMeHowManyDays() {
        return this.days;
    }
}

