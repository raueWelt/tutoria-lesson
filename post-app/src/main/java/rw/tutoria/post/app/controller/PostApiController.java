package rw.tutoria.post.app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rw.tutoria.post.persistence.post.PostDto;
import rw.tutoria.post.persistence.post.PostRepository;
import rw.tutoria.post.util.ObjectUtil;

import static rw.tutoria.post.client.UrlConstant.API_POST;
import static rw.tutoria.post.client.UrlConstant.SAVE;

@Log4j2
@RestController
@RequestMapping(value = API_POST)
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PostApiController {
    private final PostRepository postRepo;

    @PostMapping(value = SAVE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PostDto save(@RequestBody PostDto post) throws JsonProcessingException {
        log.info("called " + SAVE + " with request: " + ObjectUtil.toJsonString(post));
        postRepo.save(post);
        return post;
    }
}