package com.ibs.FlightBookingApp.VO;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class OfferData {

    @JsonProperty("data")
    private OfferResponseVO data;


    @JsonProperty("data")
    public OfferResponseVO getData() {

        return data;
    }

    @JsonProperty("data")
    public void setData(OfferResponseVO data) {

        this.data = data;

    }


    @Override
    public String toString() {
        return
                "data=" + data;
    }
}
