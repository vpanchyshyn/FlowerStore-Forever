package ua.edu.ucu.apps.lab8.decorator;

import ua.edu.ucu.apps.lab8.model.Flower;

public abstract class FlowerDecorator extends Flower {
    protected Flower item;

    public FlowerDecorator(Flower flower) {
        this.item = flower;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
    
    public abstract String getDescription();
}