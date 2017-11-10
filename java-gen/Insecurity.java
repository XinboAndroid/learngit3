import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Insecurity {

    @SerializedName("sexual_content")
    @Expose
    private Boolean sexualContent;

    /**
     * 
     * @return
     *     The sexualContent
     */
    public Boolean getSexualContent() {
        return sexualContent;
    }

    /**
     * 
     * @param sexualContent
     *     The sexual_content
     */
    public void setSexualContent(Boolean sexualContent) {
        this.sexualContent = sexualContent;
    }

}
