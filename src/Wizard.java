/**
 * Created by Feras on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {

    private int spellNumber;


    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.setSpellNumber(spellNumber);
    }

    public String Play() {
        return ("\nClass -- Wizard" + "\n" + "Name -- " + getName() + "\n" + "Strength -- " + getStrength()+ "\n" + "Intelligence -- "  + getIntelligence() + "\n" +
                "Spell Number -- " + getSpellNumber() + "\n" + "Magical Energy -- " + getMagicalEnergy());
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }
}
