package com.com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.shape.Shape;
import com.kodilla.testing.com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.com.kodilla.testing.shape.Square;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void agterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    //Test 1: sprawdzający czy po dodaniu nowego kształtu (Shape) liczba elementów wynosi 1.
    @Test
    public void testAddFigure() {
        //Given
        Square square = new Square("Square", 25);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);

        //Then
        Assert.assertEquals(1, collector.getFigureNumbers());

    }

    //Test 2: sprawdzający czy Shape pobrany z klasy ShapeCollector jest taki sam jak Shape, który był wstawiany do klasy
    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square("Square", 25);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);

        //When
        Shape addedFigure;
        addedFigure = collector.getFigure(0);

        //Then
        Assert.assertEquals(square, addedFigure);
    }

    //Test 3: sprawdzający czy próba usunięcia nieistniejącego Shape skończy się zwróceniem wyniku false.
    @Test
    public void testRemoveShapeNotExisting() {
        //Given
        Square square = new Square("Square", 25);
        ShapeCollector collector = new ShapeCollector();

        //When
        boolean result = collector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    //Test 4: weryfikujący czy udało się usunąć wybrany Shape z klasy.
    @Test
    public void testRemoveShape() {
        //Given
        Square square = new Square("Square", 25);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);

        //When
        boolean result = collector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getFigureNumbers());
    }
}
