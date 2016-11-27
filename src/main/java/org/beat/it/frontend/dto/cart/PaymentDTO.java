package org.beat.it.frontend.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PaymentDTO implements Serializable{

    private Double totalPrice;
    private Double itemsPrice;
    private Double deliveryPrice;
    private String currency;
    private String deliveryType;
    private String paymentMethod;

}