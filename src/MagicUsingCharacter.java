/**
 * Created by Feras on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.setMagicalEnergy(magicalEnergy);
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }


    public String Play() {
        return null;
    }
}
