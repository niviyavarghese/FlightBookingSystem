package com.ibs.FlightBookingApp.VO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

        "total_currency",
        "total_amount",
        "slices",
        "id"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class OfferVO {

    @JsonProperty("total_currency")
    private String totalCurrency;
    @JsonProperty("total_amount")
    private String totalAmount;
    @JsonProperty("slices")
    private List<Slice> slices;
    @JsonProperty("id")
    private String id;


    @JsonProperty("total_currency")
    public String getTotalCurrency() {
        return totalCurrency;
    }

    @JsonProperty("total_currency")
    public void setTotalCurrency(String totalCurrency) {
        this.totalCurrency = totalCurrency;
    }

    @JsonProperty("total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("slices")
    public List<Slice> getSlices() {
        return slices;
    }

    @JsonProperty("slices")
    public void setSlices(List<Slice> slices) {
        this.slices = slices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OfferVO{" +
                "totalCurrency='" + totalCurrency + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", slices=" + slices +
                ", id='" + id + '\'' +
                '}';
    }
}
