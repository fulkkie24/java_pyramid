public class fluke34 {
    public static void main(String den[]){
        int totalF=4;
        for(int i=1;i<=totalF;i++){
           for(int j=i;j<=totalF+1;j++){
               System.out.print(" ");
           }
           System.out.print("*");
           for(int j=1;j<i;j++){
               System.out.print(j);
           }
           for(int j=i;j>2;j--){
               System.out.print(j-1);
           }
           if (i!=1) System.out.print("*"); 
        
           System.out.println();
        }
        for(int i=1;i<=totalF-1;i++){
            for(int j=totalF-1;j<=totalF+i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=2;j<=totalF-i;j++){
                System.out.print(j);
            }
            for(int j=totalF-i;j>2;j--){
                System.out.print(j);
            }
            if (i!=totalF-1) System.out.print("*"); 
            System.out.println();
        }
    }    
}
