package ru.chebanov.springLesson10;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
