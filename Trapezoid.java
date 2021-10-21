package com.company;

public class Trapezoid extends Quadrangle{
    public Trapezoid(double point1X, double point1Y, double point2X, double point2Y, double point3X, double point3Y, double point4X, double point4Y) {
        super(point1X, point1Y, point2X, point2Y, point3X, point3Y, point4X, point4Y);
    }

    public boolean signOfTrapezoid(){
        double line41=Math.sqrt((getPoint1X()-getPoint4X())*(getPoint1X()-getPoint4X())+(getPoint1Y()-getPoint4Y())*(getPoint1Y()-getPoint4Y()));
        double line12=Math.sqrt((getPoint1X()-getPoint2X())*(getPoint1X()-getPoint2X())+(getPoint1Y()-getPoint2Y())*(getPoint1Y()-getPoint2Y()));
        double line23=Math.sqrt((getPoint3X()-getPoint2X())*(getPoint3X()-getPoint2X())+(getPoint3Y()-getPoint2Y())*(getPoint3Y()-getPoint2Y()));
        double line34=Math.sqrt((getPoint3X()-getPoint4X())*(getPoint3X()-getPoint4X())+(getPoint3Y()-getPoint4Y())*(getPoint3Y()-getPoint4Y()));

        double angle1 = Math.toDegrees(Math.asin(line12/line41));
        System.out.println("angel1 = "+angle1);
        double angle2 = Math.toDegrees(Math.asin(line12/line23));
        System.out.println("angel2 = "+angle2);
        double angle3 = Math.toDegrees(Math.asin(line23/line34));
        System.out.println("angel3 = "+angle3);

        if ((angle1==angle2 && angle2!=angle3) || (angle1!=angle2 && angle2==angle3)) {
            System.out.println("It is trapezoid");
            return true;
        }
        else {
            System.out.println("It is not trapezoid");
            return false;
        }

    }

    public double getAverageLine(){
        double line23=Math.sqrt((getPoint3X()-getPoint2X())*(getPoint3X()-getPoint2X())+(getPoint3Y()-getPoint2Y())*(getPoint3Y()-getPoint2Y()));
        double line41=Math.sqrt((getPoint1X()-getPoint4X())*(getPoint1X()-getPoint4X())+(getPoint1Y()-getPoint4Y())*(getPoint1Y()-getPoint4Y()));
        double size=(line23+line41)/2;
        return size;
    }
}

