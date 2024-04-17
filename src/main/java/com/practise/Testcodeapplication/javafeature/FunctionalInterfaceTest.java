package com.practise.Testcodeapplication.javafeature;

import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

@FunctionalInterface
interface OrderService {
    Employee sumOrderDetails();

    static int sumData(int x, int y) {
        return x + y;
    }


}

@Slf4j
public class FunctionalInterfaceTest {

    public static void main(String[] args) {


        OrderService orderService = () -> Employee.builder()
                .name("Nishant")
                .build();
        Employee sumOderDetails = orderService.sumOrderDetails();
        log.info("Order sum :" + sumOderDetails);

        int sumValue=OrderService.sumData(10,20);
        log.info("Sum :"+sumValue);
    }
}
