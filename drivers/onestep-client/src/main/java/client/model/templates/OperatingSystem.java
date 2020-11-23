package client.model.templates;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;

/**
 * ImageTemplate
 */
@ApiModel(description = "OperatingSystem")
public class OperatingSystem {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("authorization_types")
    private List<String> authorizationTypes = null;

    @SerializedName("versions")
    private List<Version> versions = null;

    public OperatingSystem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Id
     * @return id
     **/
    @ApiModelProperty(value = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperatingSystem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name
     * @return name
     **/
    @ApiModelProperty(value = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperatingSystem authorizationTypes(List<String> authorization_types) {
        this.authorizationTypes = authorization_types;
        return this;
    }

    /**
     * Get diskAuthorizationTypes
     * @return authorizationTypes
     **/
    @ApiModelProperty(value = "AuthorizationTypes")
    public List<String> getAuthorizationTypes() {
        return authorizationTypes;
    }

    public void setAuthorizationTypes(List<String> authorizationTypes) {
        this.authorizationTypes = authorizationTypes;
    }

    @ApiModelProperty(value = "")
    public List<Version> getVersions() {
        return versions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperatingSystem template = (OperatingSystem) o;
        return Objects.equals(this.id, template.id) &&
                Objects.equals(this.name, template.name) &&
                Objects.equals(this.authorizationTypes, template.authorizationTypes) &&
                Objects.equals(this.versions, template.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authorizationTypes, versions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperatingSystem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authorization_types: ").append(toIndentedString(authorizationTypes)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

