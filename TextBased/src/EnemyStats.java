/**
 * Enemy stats class.
 *
 * @author Reaper
 *
 */
public class EnemyStats {

    int attack, defence, strength, hpMax, Lvl, gold, expGain, expGainMax, hp;
    String Name;

    /**
     * Holds Enemy statistics.
     * 
     * @param attack
     *            Enemy attack level
     * @param defence
     *            Enemy defense level
     * @param strength
     *            Enemy strength level
     * @param hpMax
     *            Enemy max health amount
     * @param Lvl
     *            Enemy level
     * @param gold
     *            Enemy gold gain per kill
     * @param hp
     *            Enemy health
     * @param expGain
     *            Enemy Exp gain per kill
     * @param expGainMax
     *            Enemy Exp gain max
     * @param Name
     *            Enemy Name
     */
    public EnemyStats(int attack, int defence, int strength, int hpMax, int Lvl,
            int gold, int hp, int expGain, int expGainMax, String Name) {
        this.hpMax = hpMax;
        this.attack = attack;
        this.defence = defence;
        this.strength = strength;
        this.gold = gold;
        this.Lvl = Lvl;
        this.expGain = expGain;
        this.Name = Name;
        this.hp = hp;
        this.expGainMax = expGainMax;

    }
}