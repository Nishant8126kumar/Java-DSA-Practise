package com.practise.Testcodeapplication.AccenturesTest;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntityData {
    private String name;
    private Double salary;

    @Override
    public int hashCode() {
        return 5;
    }
}
