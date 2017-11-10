import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Visible {

    @Expose
    private Integer type;
    @SerializedName("list_id")
    @Expose
    private Integer listId;

    /**
     * 
     * @return
     *     The type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The listId
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * 
     * @param listId
     *     The list_id
     */
    public void setListId(Integer listId) {
        this.listId = listId;
    }

}
