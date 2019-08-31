public class fluke17 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            for(int j=1;j<=totalF-1;j++){
                System.out.print(i+""+(totalF*2-i));
            }   
            System.out.println();
        }
    }
}
