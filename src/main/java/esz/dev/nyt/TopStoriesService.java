package esz.dev.nyt;

import com.fasterxml.jackson.databind.ObjectMapper;
import esz.dev.nyt.dao.NytResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class TopStoriesService {

    @Value("${nyt.topstories.key}")
    private String apiKey;

    public NytResponse getTopStories() throws IOException, InvalidNytResponse {
        URL url = new URL("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=" + apiKey);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int statusCode = connection.getResponseCode();
        if (statusCode != HttpStatus.OK.value()) {
            throw new InvalidNytResponse("NYT responded with:" + statusCode);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line+"\n");
        }
        bufferedReader.close();
        return toObject(stringBuilder.toString());
    }

    private NytResponse toObject(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, NytResponse.class);
    }
}
