package com.keepit.rest.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement (name = "user")
@XmlAccessorType(XmlAccessType.FIELD)

public class UsersResponse {

    //creating XML response from endpoint /user
    @XmlElement(name = "enabled")
    public boolean enabled;
    @XmlElement(name = "created")
    public String created;
    @XmlElement(name = "product")
    public String product;
    @XmlElement(name = "parent")
    public String parent;
    @XmlElement(name = "subscribed")
    public boolean subscribed;


}
