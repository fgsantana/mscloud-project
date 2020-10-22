package com.github.fgsantana.shppngcart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {
    @Id
    private String id;

    private List<Item> items;

    public List<Item> getItems() {
        if(items==null){
            items = new ArrayList<Item>();
        }
        return items;
    }

    public String getId() {
        return id;
    }
}
