package esz.dev.nyt.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class NytResponse implements Serializable {
    private String status;
    private String copyright;
    private String section;

    @Setter(onMethod_={@JsonProperty("last_updated")})
    @Getter(onMethod_={@JsonProperty("lastUpdated")})
    private Date lastUpdated;

    @Setter(onMethod_={@JsonProperty("num_results")})
    @Getter(onMethod_={@JsonProperty("numResults")})
    private Integer numResults;
    private List<NytStory> results;
}
