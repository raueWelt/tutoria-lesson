package rw.tutoria.post.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static rw.tutoria.post.client.UrlConstant.API;
import static rw.tutoria.post.client.UrlConstant.PING;

@RestController
@RequestMapping(value = API)
public class ApiController {
    @GetMapping(value = PING)
    public String ping() {
        return "pong";
    }
}
