package esz.dev.nyt.soap;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfiguration {

    private Bus bus;
    private TopStoriesWsImpl topStoriesWsImpl;

    public WebServiceConfiguration(Bus bus, TopStoriesWsImpl topStoriesWsImpl) {
        this.bus = bus;
        this.topStoriesWsImpl = topStoriesWsImpl;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpointImpl = new EndpointImpl(bus, topStoriesWsImpl);
        endpointImpl.publish("/topstoriesws");
        return endpointImpl;
    }
}
