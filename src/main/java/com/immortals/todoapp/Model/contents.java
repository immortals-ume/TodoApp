package com.immortals.todoapp.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "contents")
public class contents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "TOPIC")
    @NotNull(message = "topic may not be null")
    private String topic;

    @Column(name = "CONTENT")
    @NotNull(message = "Content may not be null")
    private String content;

    protected contents() {
    }

    public contents(long id, String topic, String content) {
        this.id = id;
        this.topic = topic;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "contents{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
