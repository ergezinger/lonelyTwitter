package ca.ualberta.cs.lonelytwitterRenamed.models;

public class Happy {
    private String date;

    public Happy() {
        this.date = "today"; // default date if none is specified
    }

    public Happy(String d) {
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
        return "I am feeling happy on " + this.getDate();
    }
}
