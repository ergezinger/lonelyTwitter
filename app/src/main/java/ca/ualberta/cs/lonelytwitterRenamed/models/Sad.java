package ca.ualberta.cs.lonelytwitterRenamed.models;

public class Sad extends MoodObject {

    public Sad() {
        super();
    }

    public Sad(String d) {
        super(d);
    }

    @Override
    public String toString() {
        return "I am feeling sad on " + this.getDate();
    }
}
