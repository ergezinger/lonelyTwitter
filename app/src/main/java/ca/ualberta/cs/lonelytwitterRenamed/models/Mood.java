package ca.ualberta.cs.lonelytwitterRenamed.models;

public abstract class Mood {
    protected String date;

    public String retrieveDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
