public class App {

    public static void main(String[] args){
        /*1. square */
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*2. triangle */
        for (int n=0;n<10;n++){
            for (int m=0;m<n;m++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*3. parallelogram */
        for (int i=0;i<10;i++){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        for (int n=10;n>0;n--){
            for (int i=10;i>n;i--){
                System.out.print(" ");
            }
            for (int m=0;m<n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}