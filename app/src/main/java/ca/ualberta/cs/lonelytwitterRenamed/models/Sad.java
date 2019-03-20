package ca.ualberta.cs.lonelytwitterRenamed.models;

public class Sad extends Mood{

    public Sad() {
        this.date = "today"; // default date if none is specified
    }

    public Sad(String d) {
        this.date = d;
    }

    @Override
    public String toString() {
        return "I am feeling sad on " + this.getDate();
    }
}
