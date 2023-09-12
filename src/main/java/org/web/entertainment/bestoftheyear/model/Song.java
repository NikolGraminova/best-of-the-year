package org.web.entertainment.bestoftheyear.model;

public class Song {

    // fields
    private int id;
    private String title;


    // constructors
    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }


    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
