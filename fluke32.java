public class fluke32 {
    public static void main(String den[]){
        int totalF=3;
        for(int i=1;i<=totalF*2-1;i++){
            for(int j=1;j<=(totalF*2-i+2);j++){
                System.out.print(j);
            }
            for(int j=totalF;j<=totalF+i+1;j++){
                System.out.print("*");
            }
            System.out.println(totalF-(totalF-2)+i);
        }
    }
}
