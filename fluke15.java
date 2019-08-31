public class fluke15 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            for(int j=i;j<=totalF;j++){
                System.out.print(i);
            }
            for(int j=1;j<=(i*2-1);j++){
                System.out.print(" ");
            }
            for(int j=i;j<=totalF;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
