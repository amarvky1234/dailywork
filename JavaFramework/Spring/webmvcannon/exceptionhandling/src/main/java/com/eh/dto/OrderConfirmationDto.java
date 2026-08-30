package com.eh.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class OrderConfirmationDto {
    private String orderId;
    private double paymentAmount;
    @DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:SS")
    private LocalDateTime paymentDate;
}
