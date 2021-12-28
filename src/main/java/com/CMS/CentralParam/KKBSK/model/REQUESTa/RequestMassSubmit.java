package com.CMS.CentralParam.KKBSK.model.REQUESTa;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ids"
})
@Generated("jsonschema2pojo")
public class RequestMassSubmit {

    @JsonProperty("ids")
    private String ids;

    public RequestMassSubmit() {
    }

    public RequestMassSubmit(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public RequestMassSubmit ids(String ids) {
        setIds(ids);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " ids='" + getIds() + "'" +
            "}";
    }

}
