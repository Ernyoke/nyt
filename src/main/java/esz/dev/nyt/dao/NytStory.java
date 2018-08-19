package esz.dev.nyt.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class NytStory {
    private String section;

    @Setter(onMethod_={@JsonProperty("subsection")})
    @Getter(onMethod_={@JsonProperty("subSection")})
    private String subSection;
    private String title;

    @JsonProperty("abstract")
    private String abstractContent;
    private String url;

    @Setter(onMethod_={@JsonProperty("short_url")})
    @Getter(onMethod_={@JsonProperty("shortUrl")})
    private String shortUrl;

    @Setter(onMethod_={@JsonProperty("byline")})
    @Getter(onMethod_={@JsonProperty("byLine")})
    private String byLine;

    @Setter(onMethod_={@JsonProperty("item_type")})
    @Getter(onMethod_={@JsonProperty("itemType")})
    private String itemType;

    @Setter(onMethod_={@JsonProperty("published_date")})
    @Getter(onMethod_={@JsonProperty("publishedDate")})
    private Date publishedDate;

    @Setter(onMethod_={@JsonProperty("updated_date")})
    @Getter(onMethod_={@JsonProperty("updatedDate")})
    private Date updatedDate;

    @Setter(onMethod_={@JsonProperty("created_date")})
    @Getter(onMethod_={@JsonProperty("createdDate")})
    private Date createdDate;

    @Setter(onMethod_={@JsonProperty("material_type_facet")})
    @Getter(onMethod_={@JsonProperty("materialTypeFacet")})
    private Date materialTypeFacet;
    private String kicker;

    @Setter(onMethod_={@JsonProperty("des_facet")})
    @Getter(onMethod_={@JsonProperty("desFacet")})
    private List<String> desFacet;

    @Setter(onMethod_={@JsonProperty("org_facet")})
    @Getter(onMethod_={@JsonProperty("orgFacet")})
    private List<String> orgFacet;

    @Setter(onMethod_={@JsonProperty("per_facet")})
    @Getter(onMethod_={@JsonProperty("perFacet")})
    private List<String> perFacet;

    @Setter(onMethod_={@JsonProperty("geo_facet")})
    @Getter(onMethod_={@JsonProperty("geoFacet")})
    private List<String> geoFacet;
    private List<NytMultimedia> multimedia;

}
