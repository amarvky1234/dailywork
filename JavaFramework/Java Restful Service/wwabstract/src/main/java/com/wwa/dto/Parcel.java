package com.wwa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "parcel")
public class Parcel {
    private String description;
    private double weight;
   /* @XmlElement(name = "booked-dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate bookedDate;*/
    private String source;
    private String destination;
    private double amount;
}
