package codility;

public class BinaryGap {
    static int solution(int n){
        String bString=Integer.toString(n,2);
        //System.out.println(bString);
        boolean started=false;
        int counter=0;
        int max=0;
        for(int i=0; i< bString.length();i++){
            String sub=bString.substring(i,i+1);
            if(sub.equals("1")){
                if(started){
                    if(counter>max){
                        max=counter;
                    }
                }
                counter=0;
                started=true;

            }
            if(sub.equals("0")){
                counter++;
            }
          //  System.out.println(sub);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(569));
    }
}
