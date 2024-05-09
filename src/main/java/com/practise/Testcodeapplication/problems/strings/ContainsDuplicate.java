package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class ContainsDuplicate {
    public static void main(String[] args) {
        String str = "clementisacapp";

        Stream<Map.Entry<String,Long> >list=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(it->it,Collectors.counting()))
                .entrySet().stream().filter(it->it.getValue()>1);

        list.forEach(it->{
            log.info(it.getKey() +" =: "+it.getValue());
        });

        Map<String,Long> map=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(it->it,Collectors.counting()))
                .entrySet().stream().filter(it->it.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        log.info("Map =:"+map);

    }
}
