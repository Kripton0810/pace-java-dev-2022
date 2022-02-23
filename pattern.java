public class pattern {
    public static void main(String[] args) {
    int k =1 ;
        for (int i = 1; i <=5; i++) {
            if (i%2!=0) {
                int j;
                for (j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                k=j;
                
            }
            else
            {
                for (int j = k+1; j <= 1; j++) {
                    System.out.println(j+" ");
                }
            }
            System.out.println();
        }
    }
}
