package org.beat.it.frontend.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.beat.it.frontend.dto.ImageDTO;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CartItemDTO implements Serializable {

    private String name;
    private ImageDTO image;
    private Integer quantity;
    private Double pricePerItem;
    private String currency;
    private Double totalPrice;
}
