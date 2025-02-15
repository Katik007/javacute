package org.jvknit241;

class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Капучино";
    }

    @Override
    public int getCalories() {
        return 50;
    }
}
