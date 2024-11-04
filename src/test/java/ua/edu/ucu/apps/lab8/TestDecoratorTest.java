package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab8.model.Flower;

import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.lab8.decorator.*;



public class TestDecoratorTest {

    @Test
    public void testPaper() {
        Flower flower = new Flower();
        flower.setName("Cactus");
        flower.setPrice(10.0);

        FlowerDecorator paperWrappedFlower = new PaperDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 23.0);
        assertEquals(paperWrappedFlower.getDescription(), "Cactus is wrapped!");   
    }

    @Test
    public void testBasket() {
        Flower flower = new Flower();
        flower.setName("Cactus");
        flower.setPrice(10.0);

        FlowerDecorator paperWrappedFlower = new BasketDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 14.0);
        assertEquals(paperWrappedFlower.getDescription(), "Cactus is added to basket!");   
    }

    @Test
    public void testRibbon() {
        Flower flower = new Flower();
        flower.setName("Cactus");
        flower.setPrice(10.0);

        FlowerDecorator paperWrappedFlower = new RibbonDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 50.0);
        assertEquals(paperWrappedFlower.getDescription(), "Cactus is decorated with ribbon!");   
    }
}