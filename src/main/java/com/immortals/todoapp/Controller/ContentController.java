package com.immortals.todoapp.Controller;

import com.immortals.todoapp.Models.Contents;
import com.immortals.todoapp.service.IContentService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@RestController
@RequestMapping("todo-contents")
public class ContentController {

    private final IContentService iContentService;

    public ContentController(IContentService iContentService) {
        this.iContentService = iContentService;
    }

    @GetMapping("contents/{id}")
    public ResponseEntity<Contents> getContentsById(@PathVariable("id") Integer id) {
        Contents contents = iContentService.getContentsByTopic(id);
        return new ResponseEntity<>(contents, HttpStatus.OK);
    }

    @GetMapping("contents")
    public ResponseEntity<List<Contents>> getAllContents() {
        List<Contents> list = iContentService.getAllContents();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("contents")
    public ResponseEntity<Void> addContents(@RequestBody Contents content, UriComponentsBuilder builder) {
        boolean flag = iContentService.addContentsByTopic(content);
        if (!flag) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/contents/{id}").buildAndExpand(content.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("contents")
    public ResponseEntity<Contents> updateContents(@RequestBody Contents contents) {
        iContentService.updateContents(contents);
        return new ResponseEntity<>(contents, HttpStatus.CREATED);
    }

    @DeleteMapping("contents/{id}")
    public ResponseEntity<Void> deleteContents(@PathVariable("id") Integer id) {
        iContentService.deleteContents(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
