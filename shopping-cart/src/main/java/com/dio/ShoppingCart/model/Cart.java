package com.dio.ShoppingCart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
public class Cart {
    @Id
    private Integer id;
    private List<Item> itens;

    public Cart(){
    }

    public Cart(Integer id) {this.id = id;}

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public List<Item> getItens(){
        if (itens == null){
            itens = new ArrayList<>();}
        return itens;
    }

    public void setItens(List<Item> itens){this.itens = itens;
    }
}
