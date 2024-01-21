package org.example.decorator;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        addDraw();
    }
    public void addDraw(){
        System.out.println("교통량 표시");
    }
}
