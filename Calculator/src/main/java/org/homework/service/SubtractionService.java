package org.homework.service;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService{
    @Override
    public int operate(int x, int y) {
        return x - y;
    }
}
