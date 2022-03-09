package com.ibs.FlightBookingApp.VO;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "icao_code",
        "iata_city_code"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Origin {

    @JsonProperty("icao_code")
    private String icaoCode;
    @JsonProperty("iata_city_code")
    private String iataCityCode;

    @JsonProperty("icao_code")
    public String getIcaoCode() {
        return icaoCode;
    }

    @JsonProperty("icao_code")
    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    @JsonProperty("iata_city_code")
    public String getIataCityCode() {
        return iataCityCode;
    }

    @JsonProperty("iata_city_code")
    public void setIataCityCode(String iataCityCode) {
        this.iataCityCode = iataCityCode;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "icaoCode='" + icaoCode + '\'' +
                ", iataCityCode='" + iataCityCode + '\'' +
                '}';
    }
}
