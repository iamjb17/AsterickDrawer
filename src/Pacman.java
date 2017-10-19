/**
 * Created by Jessie on 5/25/2017.
 */
public class Pacman {
    // Draw a pacman like pattern
   int size = 5;
    public void createPacman(){
       for (int i = 0; i <= size-1; i++){
           for (int j = size-1; j >= i; j--){
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i = 1; i < size; i++){
           for (int j = 0; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
