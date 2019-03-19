package ca.ualberta.cs.lonelytwitterRenamed.models;

public abstract class MoodObject {
    private String date;

    public MoodObject() {
        this.date = "today"; // default date if none is specified
    }

    public MoodObject(String d) {
        this.date = d;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}