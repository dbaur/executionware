package client.model.instances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Authorisation {

   @SerializedName("type")
    private String type = null;

    @SerializedName("ssh_keys")
    private List<SshKey> sshKeys = null;

    public Authorisation type(String id) {
        this.type = id;
        return this;
    }

    /**
     * Type
     * @return type
     **/
    @ApiModelProperty(value = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ApiModelProperty(value = "ssh keys")
    public List<SshKey> getSshKeys() {
        return sshKeys;
    }

    public void addSshKey(Integer id, String publicKey) {
        SshKey sshKey = new SshKey();
        sshKey.setId(id);
        sshKey.setPublicKey(publicKey);
        if(sshKeys == null) {
            this.sshKeys = new LinkedList<>();
        }

        this.sshKeys.add(sshKey);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Authorisation authorisation = (Authorisation) o;
        return Objects.equals(this.type, authorisation.type) &&
                Objects.equals(this.sshKeys, authorisation.sshKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sshKeys);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorisation {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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
