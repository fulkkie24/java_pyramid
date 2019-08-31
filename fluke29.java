public class fluke29 {
    public static void main(String den[]){
        int totalF=5;
        for(int i=1;i<=totalF;i++){
            System.out.print(i+"*"+(i+2));
            for(int j=1;j<=i+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
