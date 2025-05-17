package codility;

public class FrogJump {
    public int Solution(int X,int Y,int D){
        int sum=X;
        int counter=1;
        while(sum<=Y){
            sum+=D;
            counter++;
        }
        return --counter;
    }
    public int Solution1(int X,int Y,int D){
        int distance=Y-X;
        return (int)Math.ceil((double) distance/D);
        //return  jumps;
    }
    public static void main(String[] args) {
        FrogJump fj=new FrogJump();
        System.out.println(fj.Solution(10,85,30));
        System.out.println(fj.Solution1(10,85,30));
    }
}
