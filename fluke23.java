public class fluke23 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            System.out.print(i);
            for(int j=i;j<=totalF+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
