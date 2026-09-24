package javaBasics;

public class totalsurfaceareaofcuboid {
    public static void main (String []args)
    {
        //total surface area of cuboid is: 2*(lb+bh+lh)
        double l ,b , h ;
        l = 14 ;
        b = 15 ;
        h = 15.6;
        double surface_area = 2*(l*b + b*h + l*h) ;
        System.out.println("total surface area of cuboid is:" + surface_area);
    }
}
