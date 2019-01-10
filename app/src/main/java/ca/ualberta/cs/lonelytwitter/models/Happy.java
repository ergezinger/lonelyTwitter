package ca.ualberta.cs.lonelytwitter.models;

public class Happy extends MoodObject {

    public Happy() {
        super();
    }

    public Happy(String d) {
        super(d);
    }

    @Override
    public String toString() {
        return "I am feeling happy on " + this.getDate();
    }
}
