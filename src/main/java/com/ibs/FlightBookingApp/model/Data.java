package com.ibs.FlightBookingApp.model;

import com.fasterxml.jackson.annotation.*;



import javax.annotation.Generated;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "slices",
        "passengers",
        "cabin_class",
        "offers"
})
@Generated("jsonschema2pojo")
@JsonRootName("data")
public class Data {



        /**
         *
         * (Required)
         *
         */
        @JsonProperty("slices")
        private List<Slice> slices = new ArrayList<>();
        /**
         *
         * (Required)
         *
         */
        @JsonProperty("passengers")
        private List<Passenger> passengers = new ArrayList<>();
        /**
         *
         * (Required)
         *
         */


        @JsonProperty("cabin_class")
        private String cabinClass;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("slices")
        public List<Slice> getSlices() {
            return slices;
        }

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("slices")
        public void setSlices(List<Slice> slices) {
            this.slices = slices;
        }

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("passengers")
        public List<Passenger> getPassengers() {
            return passengers;
        }

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("passengers")
        public void setPassengers(List<Passenger> passengers) {
            this.passengers = passengers;
        }

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("cabin_class")
        public String getCabinClass() {
            return cabinClass;
        }

        /**
         *
         * (Required)
         *
         */
        @JsonProperty("cabin_class")
        public void setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slices");
        sb.append('=');
        sb.append(((this.slices == null)?"<null>":this.slices));
        sb.append(',');
        sb.append("passengers");
        sb.append('=');
        sb.append(((this.passengers == null)?"<null>":this.passengers));
        sb.append(',');
        sb.append("cabinClass");
        sb.append('=');
        sb.append(((this.cabinClass == null)?"<null>":this.cabinClass));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.slices == null)? 0 :this.slices.hashCode()));
            result = ((result* 31)+((this.cabinClass == null)? 0 :this.cabinClass.hashCode()));
            result = ((result* 31)+((this.passengers == null)? 0 :this.passengers.hashCode()));
            result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
            return result;
        }

    @Override public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((((((this.slices!= null)&&this.slices.equals(rhs.getSlices())))&&((this.cabinClass == rhs.getCabinClass())||((this.cabinClass!= null)&&this.cabinClass.equals(rhs.getCabinClass()))))&&(((this.passengers!= null)&&this.passengers.equals(rhs.getPassengers()))))&&((this.additionalProperties == rhs.getAdditionalProperties())||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.getAdditionalProperties()))));
    }




    public static class Slice {

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getDeparture_date() {
                return departure_date;
            }

            public void setDeparture_date(String departure_date) {
                this.departure_date = departure_date;
            }

            public String getArrival_date() {
            return arrival_date;
            }

           public void setArrival_date(String arrival_date) {
            this.arrival_date = arrival_date;
            }

            String origin;
            String destination;
            String departure_date;
            String arrival_date;

        }

        public static class Passenger {


            String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

}
