/**
 * Weapon info class.
 *
 * @author Reaper
 *
 */
public class Weapons {
    int Wattack, Wdefence, Wstrength, WLvl, Cost;
    String WName;

    /**
     * Holds weapon statistics.
     * 
     * @param attack
     *            Weapon attack gain when equipped
     * @param defence
     *            Weapon defense gain when equipped
     * @param strength
     *            Weapon strength gain when equipped
     * @param Lvl
     *            Weapon level required to equip
     * @param cost
     *            Weapon cost at store
     * @param Name
     *            Weapon name
     */
    public Weapons(int attack, int defence, int strength, int Lvl, int cost,
            String Name) {
        this.Wattack = attack;
        this.Wdefence = defence;
        this.Wstrength = strength;
        this.WLvl = Lvl;
        this.WName = Name;

    }
}
