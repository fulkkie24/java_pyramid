public class fluke36 {
    public static void main(String den[]){
        int totalF=3;
        for(int i=1;i<=totalF;i++){
            for(int j=i;j<=totalF;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            for(int j=totalF;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=totalF-1;i>=1;i--){
            for(int j=i;j<=totalF;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            for(int j=totalF;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
