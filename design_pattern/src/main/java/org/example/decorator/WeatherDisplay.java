package org.example.decorator;

public class WeatherDisplay extends DisplayDecorator{
    public WeatherDisplay(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        addDraw();
    }
    public void addDraw(){
        System.out.println("날씨 표시");
    }
}
