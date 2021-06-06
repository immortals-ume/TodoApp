package com.immortals.todoapp.Models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "contents")
@Table(name = "contents")
public class Contents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TOPIC")
    @NotNull(message = "ADD A TOPIC ")
    @Max(20)
    @Min(10)
    private String topic;

    @Column(name = "CONTENT")
    @NotNull(message = "Add the Contents")
    @Max(200)
    @Min(10)
    private String contents;

    public Contents(Long id, String topic, String contents) {
        this.id = id;
        this.topic = topic;
        this.contents = contents;
    }

    public Contents() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
