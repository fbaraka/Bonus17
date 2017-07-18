import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Feras on 7/17/2017.
 */
public class CreateCharacter {
    public static void main(String[] args) {


        GameCharacter[] gameCharacters = makeCharacters();

        loopPlayMethod(gameCharacters);


    }

    private static void loopPlayMethod(GameCharacter[] gameCharacters) {
        for (int i = 0; i < gameCharacters.length ; i++) {

            System.out.println(gameCharacters[i].Play());

        }
    }

    private static GameCharacter[] makeCharacters() {
        GameCharacter[] gameCharacters = new GameCharacter[5];
        gameCharacters[0] = new Warrior("Kaladin", 100, 15,"Spear");
        gameCharacters[1] = new Warrior("Jezal", 80, 7,"Dual Swords");
        gameCharacters[2] = new Wizard("Bayaz", 10, 100, 500, 100 );
        gameCharacters[3] = new Wizard("Yulwei", 10, 50, 100, 30 );
        gameCharacters[4] = new Wizard("Harry Potter", 5, 10, 50, 20 );
        return gameCharacters;
    }

}
