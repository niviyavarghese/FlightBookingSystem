package com.ibs.FlightBookingApp.VO;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data",
        "slices",
        "passengers",
        "offers",
        "total_currency",
        "total_amount",
        "operating_carrier_flight_number",
        "operating_carrier",
        "name",
        "id"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class OffersVO {

    @JsonProperty("data")
    private Object data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("total_currency")
    private String totalCurrency;
    @JsonProperty("total_amount")
    private String totalAmount;
    @JsonProperty("operating_carrier_flight_number")
    private Object operatingCarrierFlightNumber;



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

    @JsonProperty("operating_carrier_flight_number")
    public Object getOperatingCarrierFlightNumber() {
        return operatingCarrierFlightNumber;
    }

    @JsonProperty("operating_carrier_flight_number")
    public void setOperatingCarrierFlightNumber(Object operatingCarrierFlightNumber) {
        this.operatingCarrierFlightNumber = operatingCarrierFlightNumber;
    }

    @JsonProperty("slices")
    private List<Object> slices;
    @JsonProperty("passengers")
    private List<Object> passengers;
    @JsonProperty("offers")
    private Object offers ;
    @JsonProperty("slices")
    public List<Object> getSlices() {
        return slices;
    }

    @JsonProperty("slices")
    public void setSlices(List<Object> slices) {
        this.slices = slices;
    }

    @JsonProperty("passengers")
    public List<Object> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Object> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("offers")
    public Object getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Object offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "OffersVO{" +
                "data=" + data +
                ", additionalProperties=" + additionalProperties +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", totalCurrency='" + totalCurrency + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", operatingCarrierFlightNumber=" + operatingCarrierFlightNumber +
                ", slices=" + slices +
                ", passengers=" + passengers +
                ", offers=" + offers +
                '}';
    }
}





