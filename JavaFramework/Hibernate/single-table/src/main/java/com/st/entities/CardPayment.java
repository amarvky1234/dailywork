package com.st.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("card")
public class CardPayment extends Payment{
    private String issuer;
    @Column(name = "card_num")
    private String cardNumber;
    @Column(name = "card_type")
    private String cardType;
    private String expiry;
}
