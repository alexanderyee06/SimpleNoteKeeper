package ca.sait.simplenotekeeper.javabeans;

import java.io.Serializable;

/**
 * Represents a note
 * @author Alexander Yee
 */
public class Note implements Serializable {
    //Fields
    private String title;
    private String contents;

    public Note(){
    }

    //No-arg constructor
    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    //Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }   
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
