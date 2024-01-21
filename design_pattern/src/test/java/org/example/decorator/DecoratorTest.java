package org.example.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    @DisplayName("데코레이터 패턴 테스트")
    void decorator_draw(){
        //given
        Display weatherDisplay = new WeatherDisplay(new TrafficDecorator(new RoadDisplay()));
        //when
        //then
        weatherDisplay.draw();
        System.out.println("test 한글");

    }

}