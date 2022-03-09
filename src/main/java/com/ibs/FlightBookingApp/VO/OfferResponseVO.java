package com.ibs.FlightBookingApp.VO;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "offers"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class OfferResponseVO {


    @JsonProperty("offers")
    private List<OfferVO> offers;

    @JsonProperty("offers")
    public List<OfferVO> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<OfferVO> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "offers=" + offers ;
    }
}
