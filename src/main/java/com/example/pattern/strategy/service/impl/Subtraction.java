package com.example.pattern.strategy.service.impl;

import com.example.pattern.strategy.service.api.CalculationStrategy;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service("subtract")
public class Subtraction implements CalculationStrategy {

    @Override
    public Integer calculate(@NonNull Integer o1, @NonNull Integer o2) {
        return o1 - o2;
    }
}
