package com.wwa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "receipt")
public class Receipt {
    @XmlElement(name = "awb-no")
    private String awbNo;
    @XmlElement(name = "booked-dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate bookedDate;
    @XmlElement(name = "delivery-dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate deliveryDate;
    private double amount;
}
