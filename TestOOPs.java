class Shapes{

    private double length;
    private double breadth;
    private double result;

    public Shapes(){
        this.length = 0.00;
        this.breadth = 0.00;
    }

    public Shapes(double length){
        this.length = length;
        this.breadth = 0.00;
    }

    public Shapes(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        if (this.length != 0 && this.breadth != 0){
            this.result = this.length * this.breadth;

            if (Double.compare(this.length , this.breadth) == 0) {
                System.out.println("area of SQUARE : " + this.result);
            }

            else{
                System.out.println("area of RECTANGLE : " + this.result);
            }
            return;

        }
        System.out.println("SORRY !! either length or breadth is 0.00");
        return;
    }

}

public class TestOOPs {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Shapes s2 = new Shapes(75);
        Shapes s3 = new Shapes(25 , 25);
        Shapes s4 = new Shapes(125 , 125);
        s1.getArea();
        s2.getArea();
        s3.getArea();
        s4.getArea();
    }
}
