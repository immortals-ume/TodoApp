package com.immortals.todoapp.Repository;


import com.immortals.todoapp.Models.Contents;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContentRepository extends CrudRepository<Contents, Integer> {
   List<Contents> findByTopic(String Topic);
}
