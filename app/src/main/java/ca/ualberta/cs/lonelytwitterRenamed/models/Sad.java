package ca.ualberta.cs.lonelytwitterRenamed.models;

public class Sad {
    private String date;

    public Sad() {
        this.date = "today"; // default date if none is specified
    }

    public Sad(String d) {
        this.date = d;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "I am feeling sad on " + this.getDate();
    }
}
