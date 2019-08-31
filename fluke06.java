public class fluke06 {
    public static void main(String den[]){
        int totalF=7;
        for(int i=totalF;i>=1;i--){ 
            for(int j=totalF;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print((j%2));
            }
            System.out.println();
        }
    }
}
