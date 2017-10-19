/**
 * Created by Jessie on 5/23/2017. To draw the backslash symbol using *s
 *  *
 *   *
 *    *
 *     *
 *      *
 *       *
 */
public class BackSlash {

    public void createBackSlash(){
        // createBackSlash the asterisk backslash
        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }


}
