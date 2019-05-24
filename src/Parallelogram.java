import static java.lang.System.out;

public class Parallelogram {
    private int a;
    private int b;
    private int h;


    public Parallelogram(int a,int b, int h) {
        this.a=15;
        this.b=5;
        this.h=4;
    }


    public long real() {
        return a  * h ;
    }
    public long perimetr() {
        return (a + b ) * 2;
    }
    Parallelogram c1 = new Parallelogram(15, 5, 4);
    Parallelogram c2 = new Parallelogram(30, 10, 8);

        System.out.println("Ploshad" + c1.real);
        System.out.println("Perimetr" + c2.perimetr);



    }

