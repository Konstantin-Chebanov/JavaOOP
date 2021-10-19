package ru.chebanov.springLesson12;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "ROOOCK!!";
    }
}
