package com.ibs.FlightBookingApp.VO;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "origin",
        "operating_carrier_flight_number",
        "operating_carrier",
        "duration",
        "departing_at",
        "arriving_at"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Segment {
    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("operating_carrier_flight_number")
    private Object operatingCarrierFlightNumber;
    @JsonProperty("operating_carrier")
    private OperatingCarrier operatingCarrier;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("departing_at")
    private String departingAt;
    @JsonProperty("arriving_at")
    private String arrivingAt;

    @JsonProperty("operating_carrier_flight_number")
    public Object getOperatingCarrierFlightNumber() {
        return operatingCarrierFlightNumber;
    }

    @JsonProperty("operating_carrier_flight_number")
    public void setOperatingCarrierFlightNumber(Object operatingCarrierFlightNumber) {
        this.operatingCarrierFlightNumber = operatingCarrierFlightNumber;
    }

    @JsonProperty("operating_carrier")
    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operating_carrier")
    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDepartingAt() {
        return departingAt;
    }

    public void setDepartingAt(String departingAt) {
        this.departingAt = departingAt;
    }

    public String getArrivingAt() {
        return arrivingAt;
    }

    public void setArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "origin=" + origin +
                ", operatingCarrierFlightNumber=" + operatingCarrierFlightNumber +
                ", operatingCarrier=" + operatingCarrier +
                ", duration='" + duration + '\'' +
                ", departingAt='" + departingAt + '\'' +
                ", arrivingAt='" + arrivingAt + '\'' +
                '}';
    }
}
