/**
 * Created by Jessie on 5/23/2017.
 */
public class AsteriskTester {
    public static void main(String[] args){
        BackSlash backslash = new BackSlash();
        Diamond diamond = new Diamond();
        Pacman pacman = new Pacman();
        diamond.createDiamond();
        System.out.println();
        backslash.createBackSlash();
        System.out.println();
        pacman.createPacman();

    }
}
