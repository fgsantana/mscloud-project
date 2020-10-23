package com.github.fgsantana.shppngcart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("item")
public class Item {
    @Id
    private String id;

    private int price;
}
