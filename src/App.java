public class App {

    public static void main(String[] args){

        /*1. square */
        // making a double for loop for so each line the code will write 10 *
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*2. triangle */
        // making double for loop so every line the code will write the line number *
        for (int n=0;n<10;n++){
            for (int m=0;m<n;m++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*3. parallelogram */
        // making double for loop so get the first part of the parallelogram that is just the traingle
        for (int i=0;i<10;i++){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        // making a 2 double for loop so its will be a reverse traingle + added spaces by the line number
        for (int n=10;n>0;n--){
            // for loop for spaces
            for (int i=10;i>n;i--){
                System.out.print(" ");
            }
            // for loop for *
            for (int m=0;m<n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}