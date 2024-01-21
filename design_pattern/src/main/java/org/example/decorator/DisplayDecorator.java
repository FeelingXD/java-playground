package org.example.decorator;

public class DisplayDecorator extends Display{
    public Display decoratedDisplay; // 합성된 디스플레이
    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay; // 기능 합성시키기
    }
    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
