package com.immortals.todoapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "contents")
public class contents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    private String TOPIC;
    private String CONTENT;

    protected contents() {
    }

    public contents(long ID, String TOPIC, String CONTENT) {
        this.ID = ID;
        this.TOPIC = TOPIC;
        this.CONTENT = CONTENT;
    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTOPIC() {
        return TOPIC;
    }

    public void setTOPIC(String TOPIC) {
        this.TOPIC = TOPIC;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    @Override
    public String toString() {
        return "contents{" +
                "ID=" + ID +
                ", TOPIC='" + TOPIC + '\'' +
                ", CONTENT='" + CONTENT + '\'' +
                '}';
    }
}
