package ru.chebanov.springLesson13;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "ROOOCK!!";
    }
}
