package esz.dev.nyt.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class NytMultimedia {
    private String url;
    private String format;
    private String height;
    private String width;
    private String type;

    @Setter(onMethod_={@JsonProperty("subtype")})
    @Getter(onMethod_={@JsonProperty("subType")})
    private String subType;
    private String caption;
    private String copyright;
}
