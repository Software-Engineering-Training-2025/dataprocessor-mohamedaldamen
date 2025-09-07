package org.example.dataprocessor.analysis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3Frequant implements AnalysisInterface{
    // 1 2 1 3
    // 1 --> 2
    // 2 --> 1
    // 3 --> 1
    @Override
    public double analysis(List<Integer> list) {
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyMap.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToLong(item -> item)
                .sum();
    }
}