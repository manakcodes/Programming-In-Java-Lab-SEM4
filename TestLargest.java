class Largest{

    private int num1;
    private int num2;
    private int num3;
    private int res;

    public void inputData(int num1 , int num2 , int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int findLargest(){
        this.res = Math.max(num1 , Math.max(num2 , num3));
        return this.res;
    }

    public void displayLargest(){
        this.res = Math.max(num1 , Math.max(num2 , num3));
        System.out.printf("largest of (%d , %d , %d) is : %d" , this.num1 , this.num2 , this.num3 , this.res);
    }

}

public class TestLargest {
    public static void main(String[] args) {
        Largest L = new Largest();
        L.inputData(5 , 10 , 100);
        L.displayLargest();
        L.findLargest();
    }
}
