public class fluke18 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            System.out.print(i);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=totalF;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(totalF*2-i);
        }
    }
}
