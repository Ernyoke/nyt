package esz.dev.nyt.rest;

import esz.dev.nyt.InvalidNytResponse;
import esz.dev.nyt.TopStoriesService;
import esz.dev.nyt.dao.NytResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class TopStoriesController {

    private final TopStoriesService topStoriesService;

    public TopStoriesController(TopStoriesService topStoriesService) {
        this.topStoriesService = topStoriesService;
    }

    @GetMapping(value = "/topstories", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NytResponse getTopStories() throws IOException, InvalidNytResponse {
        return topStoriesService.getTopStories();
    }

    @ExceptionHandler
    public String handleException(Exception ex) {
        return ex.getMessage();
    }
}
