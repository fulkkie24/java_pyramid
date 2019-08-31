public class fluke33 {
    public static void main(String den[]){
        int totalF=3;
            for(int i=1;i<=totalF;i++){
                for(int j=i;j<=totalF+1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<totalF;i++){
                for(int j=1;j<=i+2;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<=(totalF-1)*2-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}
