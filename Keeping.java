package com.company;

import java.util.ArrayList;

public class Keeping {
    private ArrayList<Quadrangle> quadrangles =new ArrayList<Quadrangle>();
    private ArrayList<Trapezoid> trapezoids =new ArrayList<Trapezoid>();

    public void setQuadrangles(ArrayList<Quadrangle> quadrangles) {
        this.quadrangles = quadrangles;
    }
    public ArrayList<Quadrangle> getQuadrangles() {
        return quadrangles;
    }

    public Keeping() {
        //this.quadrangles();
    }

    public void addQuadrangle(Quadrangle quadrangle){
        this.quadrangles.add(quadrangle);
    }

    public void getQuadrangleByIndex(int index){
        Quadrangle quadrangle= this.quadrangles.get(index);
    }

    public int getQuadrangleMinArea(){
        Quadrangle quadrangleTest= this.quadrangles.get(0);
        double areaSize=quadrangleTest.getArea();
        int quadrangleNumber=0;
        for (int i = 0; i < this.quadrangles.size(); i++) {
            Quadrangle quadrangle= this.quadrangles.get(i);
            if (quadrangle.getArea()<areaSize){
                areaSize=quadrangle.getArea();
                quadrangleNumber=i;
            }
        }
        quadrangleNumber++;
        System.out.println("Min area in "+quadrangleNumber+"’s quadrangle ");
        return quadrangleNumber;
    }

    public int getTrapezoidMaxLine(){
        Trapezoid trapezoidsTest= this.trapezoids.get(0);
        double averageLine=trapezoidsTest.getAverageLine();
        int trapezoidsNumber=0;
        for (int i = 0; i < this.trapezoids.size(); i++) {
            Trapezoid trapezoid= this.trapezoids.get(i);
            if (trapezoidsTest.getAverageLine()<averageLine){
                averageLine=trapezoid.getAverageLine();
                trapezoidsNumber=i;
            }
        }
        trapezoidsNumber++;
        System.out.println("Max average line in "+trapezoidsNumber+"’s trapezoid ");
        return trapezoidsNumber;
    }

}