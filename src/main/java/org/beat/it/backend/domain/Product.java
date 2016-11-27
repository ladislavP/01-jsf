package org.beat.it.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {

    private String id;
    private String name;
    private Double price;
    private String currency;
    private String description;
    private Double rating;
    private Image image;
}