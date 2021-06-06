package com.immortals.todoapp.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "contents")
public class Contents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "TOPIC")
    @NotNull(message = "ADD A TOPIC ")
    private String topic;

    @Column(name = "CONTENT")
    @NotNull(message = "Add the Contents")
    private String contents;

    public Contents(int id, String topic, String contents) {
        this.id = id;
        this.topic = topic;
        this.contents = contents;
    }

    public Contents() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Contents{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
