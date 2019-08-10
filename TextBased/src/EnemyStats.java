
public class EnemyStats {

    int attack, defence, strength, hpMax, Lvl,gold, expGain,expGainMax,hp;
    String Name;

    public EnemyStats(int attack,int defence,int strength,int hpMax,int Lvl,int gold,int hp,int expGain,int expGainMax,String Name) {
        this.hpMax=hpMax;
        this.attack=attack;
        this.defence=defence;
        this.strength=strength;
        this.gold=gold;
        this.Lvl=Lvl;
        this.expGain=expGain;
        this.Name=Name;
        this.hp=hp;
        this.expGainMax=expGainMax;


    }
}