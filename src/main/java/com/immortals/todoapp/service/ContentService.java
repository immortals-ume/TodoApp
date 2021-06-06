package com.immortals.todoapp.service;


import com.immortals.todoapp.Models.Contents;
import com.immortals.todoapp.Repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService implements IContentService {

    @Autowired
    private final ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public List<Contents> getAllContents() {
        List<Contents> list = new ArrayList<>();
        contentRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Contents getContentsByTopic(int id) {
        return contentRepository.findById(id).orElse(null);
    }


    @Override
    public synchronized Boolean addContentsByTopic(Contents contents) {
        List<Contents> list = contentRepository.findByTopic(contents.getTopic());
        if (list.size() > 0) {
            return false;
        } else {
            contentRepository.save(contents);
            return true;
        }
    }

    @Override
    public void updateContents(Contents contents) {
        contentRepository.save(contents);
    }

    @Override
    public void deleteContents(int id) {
        contentRepository.delete(getContentsByTopic(id));
    }


}
