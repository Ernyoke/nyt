package esz.dev.nyt.soap;

import esz.dev.nyt.InvalidNytResponse;
import esz.dev.nyt.TopStoriesService;
import esz.dev.nyt.dao.NytResponse;
import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class TopStoriesWsImpl implements TopStoriesWs {

    private TopStoriesService topStoriesService;

    public TopStoriesWsImpl(TopStoriesService topStoriesService) {
        this.topStoriesService = topStoriesService;
    }

    public NytResponse getTopStories() throws IOException, InvalidNytResponse {
        return topStoriesService.getTopStories();
    }
}
