public class fluke05 {
    public static void main(String den[]){
        int totalF=4;
        for(int i=1;i<=totalF;i++){
            for(int j=totalF-1;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++){
                System.out.print("**");
            }
            System.out.println(i);
        }
        for(int i=1;i<totalF;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print(totalF-i);
            for(int j=totalF-1;j>i;j--){
                System.out.print("**");
            }
            System.out.println(totalF-i);
        }
    }
}
