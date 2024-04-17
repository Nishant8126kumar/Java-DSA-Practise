package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SumOfProductInventory {

    private String name;
    private double quantity;
    private double price;

    public static void main(String[] args) {

        List<SumOfProductInventory> product = new ArrayList<>();
        product.add(new SumOfProductInventory("radio", 99.0, 0));
        product.add(new SumOfProductInventory("television", 82.0, 3));
        product.add(new SumOfProductInventory("earbud", 82.5, 5));
        product.add(new SumOfProductInventory("charger", 88.5, 0));
        product.add(new SumOfProductInventory("mobile", 99.5, 2));

        double inventorySum=product.stream().filter(it->it.getQuantity()>0)
                .mapToDouble(it->it.quantity).sum();

        Map<Double,List<SumOfProductInventory>> list=product.stream().collect(Collectors.groupingBy(it->it.quantity));

        log.info("Inventory sum :"+inventorySum);

    }

}
