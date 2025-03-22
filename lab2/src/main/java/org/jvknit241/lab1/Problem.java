package org.jvknit241.lab1;

class Problem {
    private String description;
    private int diff;

    public Problem(String description, int diff) {
        this.description = description;
        this.diff = diff;
    }

    public String getDescription() {
        return description;
    }

    public int getDiff() {
        return diff;
    }
}
