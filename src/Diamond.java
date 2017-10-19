/**
 * Created by Jessie on 5/23/2017.
 */
public class Diamond {

    int z = 0;
    int size = 4;
    public void createDiamond(){
        // create a diamond

       for (int i=0; i <= size; i++){
           for (int j =size; j > i; j--){
               System.out.print(" ");
           }
           System.out.print("*");
           if (i>0){
               for (int k=0; k<=z;k++) {

                   System.out.print(" ");
               }
                   z += 2;
                   System.out.print("*");


           }
           System.out.println();
       }
       int t = size;
       for (int i=0; i < size; i++){
           for (int j =0; j <= i; j++){
               System.out.print(" ");
           }
           System.out.print("*");
           if (i<size-1){
               for (int k=0; k <= t; k++){

                       System.out.print(" ");
                   }
                   System.out.println("*");
                    t -= 2;
               }
           }
       }
    }

