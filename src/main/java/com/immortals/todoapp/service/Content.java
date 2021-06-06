package com.immortals.todoapp.service;

import com.immortals.todoapp.Models.Contents;

import java.util.List;

public interface Content {
    List<Contents> getAllContents();

    Contents getContentsByTopic(long id);

    Boolean addContentsByTopic(Contents contents);

    void updateContents(Contents contents);

    void deleteContents(int id);
}
