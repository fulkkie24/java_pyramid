public class fluke30 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=totalF*2-i;j++){
                System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
