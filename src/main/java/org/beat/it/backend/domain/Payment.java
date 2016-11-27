package org.beat.it.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Martin Petruna
 */
@AllArgsConstructor
@Getter
public class Payment {

    private Double totalPrice;
    private Double itemsPrice;
    private Double deliveryPrice;
    private String deliveryType;
    private String paymentMethod;
}
