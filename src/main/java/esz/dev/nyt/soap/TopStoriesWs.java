package esz.dev.nyt.soap;

import esz.dev.nyt.dao.NytResponse;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface TopStoriesWs {
    @WebMethod
    @WebResult(name = "response")
    NytResponse getTopStories() throws Exception;
}
