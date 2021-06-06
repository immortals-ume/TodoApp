package com.immortals.todoapp.service;

import java.util.List;

public interface Content {

    List<String> getContents(int ID);

    List<String> postContents(Object Object);

    List<String> updateContents(int ID);

    void deleteContents(int ID);
}
