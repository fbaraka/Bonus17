/**
 * Created by Feras on 7/17/2017.
 */
public class Warrior extends GameCharacter {

    private String weaponType;


    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.setWeaponType(weaponType);
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }




    public String Play() {
        return ("\n" + "\n" + "Class -- Warrior" + "\n" + "Name -- " + getName() + "\n" + "Strength -- " + getStrength()+ "\n" + "Intelligence -- "  + getIntelligence() + "\n" +
                "Weapon Type -- " + weaponType);
    }
}
