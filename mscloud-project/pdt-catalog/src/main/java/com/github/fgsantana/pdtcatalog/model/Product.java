package com.github.fgsantana.pdtcatalog.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "product")
public class Product {

    @Id
    private String id;

    private String name;
    private int price;
}
