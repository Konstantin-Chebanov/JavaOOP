package ru.chebanov.springLesson11;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
