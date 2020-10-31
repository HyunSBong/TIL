package Chapter05;
interface Shapes { // 원래는 Shape
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("---다시 그립니다. ");
        draw();
    }
}
class Circles implements Shapes { // 원래 Circle
    private int radius;
    Circles (int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }
    public double getArea() {
        return PI*radius*radius;
    }
}
class Ovals implements Shapes {
    private int x;
    private int y;
    private double r2;
    Ovals (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw() {
        r2 = x*y*PI;
        System.out.println("double" + r2);
        System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return PI*x*y;
    }
}
class Rects implements Shapes {
    private int x;
    private int y;
    Rects (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw() {
        System.out.println(x+"x"+y+"크기의 사각형입니다.");
    }
    public double getArea() {
        return x*y;
    }
}
public class Exercise0513r {
    public static void main(String [] args) {
//        Shapes donut = new Circles(10);
//        donut.redraw();
//        System.out.println("면적은 " + donut.getArea());
        //14번
        Shapes[] list = new Shapes[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new Circles(10); // 반지름이 10인 원 객체
        list[1] = new Ovals(20, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new Rects(10, 40); // 10x40 크기의 사각형
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }
}
