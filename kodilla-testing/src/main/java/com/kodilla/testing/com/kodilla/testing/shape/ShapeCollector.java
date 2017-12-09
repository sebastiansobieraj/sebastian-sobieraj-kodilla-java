package com.kodilla.testing.com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> listOfFigure = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        listOfFigure.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (listOfFigure.contains(shape)) {
            listOfFigure.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < listOfFigure.size()){
            shape = listOfFigure.get(n);
        }
        return shape;
    }

    public void showFigures() {
        for (Shape list : listOfFigure){
            System.out.println(list);
        }

    }

    public int getFigureNumbers() {
        return listOfFigure.size();
    }

    public ArrayList<Shape> getFigureList() {
        return listOfFigure;
    }
}
