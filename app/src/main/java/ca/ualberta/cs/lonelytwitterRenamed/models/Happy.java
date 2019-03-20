package ca.ualberta.cs.lonelytwitterRenamed.models;

public class Happy extends Mood {

    public Happy() {
        this.date = "today"; // default date if none is specified
    }

    public Happy(String d) {
        this.date = d;
    }

    @Override
    public String toString() {
        return "I am feeling happy on " + this.getDate();
    }
}
