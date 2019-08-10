import java.util.*;
public class ActivityMain{
                                                                            //Number Decelerations
    public static int health = 100, defence = 10, strength = 10, attack = 10, healthMax = 100, defenceMax = 10, strengthMax = 10, attackMax = 10, expOut, expNeededOut, playerLvl = 1, gold = 500,
            pots = 4, num, cost, potions = 0, randA, randD, randS, potionsUpgrade = 100, potionHealth = 10, potionAttack = 1, potionDefence = 2, potionStrength = 1, potsDrinkCount, potA, potD, potS,
            skillPoints = 1, daggerC = 50, rustySwordC = 100, hatchetC = 250, spearC = 500, runeSwordC = 5000, godSwordC = 15000, infinitySwordC = 78000, townLvl, playerLvlCongrats;
    //..........................................................................................................................................................................................................

    public static boolean dagger = false, rSword = false, hatchet = false, spear = false, runeSword = false, godSword = false, infinitySword = false;
    public static boolean Potion = false, QM = false, QM1 = false, town = false, store = false, mainM = false,equip=false,Amara=false, introS=false;
    public static String playerName, Town, Equipped="";
    public static float multExp = 1.2f, expNeeded = 100f, exp = 0f, uGrade = 1.2f, uCost = 100;
    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    public static String[] Inv = new String[7];      //this is a array that we use for the inventory
    public static EnemyStats EnemyIG;   //this is a global enemy var so you can set enemy's equal to tge EnemyStats.
    //..........................................................................................................................................................................................................
                                                                            //Over here we declare our enemy Levels and stats
                                                                            //EnemyLvl1 means that all lvl 1 enemy's will have the same stats.
    public static EnemyStats EnemyLvl1 = new EnemyStats(5, 5, 5, 100, 1, 50, 100, 30, 30, ".");//this get changed up a bit in the PreFight method
    public static EnemyStats EnemyLvl5 = new EnemyStats(10, 15, 10, 125, 5, 100, 125, 50, 50, ".");
    public static EnemyStats EnemyLvl10 = new EnemyStats(15, 20, 15, 150, 10, 150, 150, 100, 100, ".");
    public static EnemyStats EnemyLvl20 = new EnemyStats(25, 25, 20, 200, 20, 200, 200, 200, 200, ".");
    public static EnemyStats EnemyLvl30 = new EnemyStats(30, 30, 30, 250, 30, 250, 250, 300, 300, ".");
    public static EnemyStats EnemyLvl40 = new EnemyStats(35, 40, 35, 350, 40, 300, 350, 600, 600, ".");
    public static EnemyStats EnemyLvl60 = new EnemyStats(45, 50, 55, 500, 60, 400, 500, 800, 800, ".");
    public static EnemyStats EnemyLvl90 = new EnemyStats(80, 99, 90, 1000, 90, 550, 1000, 1500, 1500, ".");

    //..........................................................................................................................................................................................................
                                                            //Over here we declare out weapons level and stats

    public static Weapons WoodenDagger = new Weapons(5, 1, 2, 1, 51, "Wooden Dagger");
    public static Weapons RustySword = new Weapons(10, 3, 5, 5, 100, "Rusty Sword");
    public static Weapons Hatchet = new Weapons(15, 6, 10, 15, 250, "Hatchet");
    public static Weapons Spear = new Weapons(20, 10, 15, 20, 500, "Spear");                           //THIS IS WEAPONS DECELERATION
    public static Weapons RuneScimitar = new Weapons(45, 25, 30, 30, 5000, "Rune Scimitar");
    public static Weapons GodSword = new Weapons(70, 50, 55, 50, 15000, "GodSword");
    public static Weapons InfinitySword = new Weapons(200, 99, 120, 100, 78000, "Infinity Sword");
    public static Weapons WeaponIG; //this works the same way as EnemyIG we don't want to have to type out each weapon when using it so we just use this as a global instance that we can set equal to any weapon

    //..........................................................................................................................................................................................................
                                                     // Over here we declare what enemy names equal what lvl
                                                                        //LVL (1) ENEMY DECELERATION
    public static EnemyStats BabyGoblin = EnemyLvl1;
    public static EnemyStats BabyImp = EnemyLvl1;
    public static EnemyStats Skeleton1 = EnemyLvl1;             //making enemy names equal the EnemyStats1 to that all lvl 1 enemy's will have the same stats.
    public static EnemyStats WildCat = EnemyLvl1;
    public static EnemyStats Monkey = EnemyLvl1;
    public static EnemyStats Bat = EnemyLvl1;
    public static EnemyStats Dog = EnemyLvl1;
    public static EnemyStats Sloth = EnemyLvl1;
    public static EnemyStats GiantS1 = EnemyLvl1;
    public static EnemyStats Cow = EnemyLvl1;

    //..........................................................................................................................................................................................................
                                                                        //LVL (5) ENEMY DECELERATION
    public static EnemyStats Imp = EnemyLvl5;
    public static EnemyStats Goblin = EnemyLvl5;
    public static EnemyStats GiantSpider5 = EnemyLvl5;
    public static EnemyStats Fox = EnemyLvl5;
    public static EnemyStats Guard5 = EnemyLvl5;
    public static EnemyStats Dwarf = EnemyLvl5;
    public static EnemyStats GiantScorpion = EnemyLvl5;
    public static EnemyStats GoblinGuard = EnemyLvl5;
    public static EnemyStats DwarfGuard = EnemyLvl5;
    public static EnemyStats ImpGuard = EnemyLvl5;

    //..........................................................................................................................................................................................................
                                                                        //LVL (10) ENEMY DECELERATION
    public static EnemyStats Guard10 = EnemyLvl10;
    public static EnemyStats GiantSpider10 = EnemyLvl10;
    public static EnemyStats Bear = EnemyLvl10;
    public static EnemyStats FireBird = EnemyLvl10;
    public static EnemyStats SpellCaster = EnemyLvl10;
    public static EnemyStats GiantBat = EnemyLvl10;
    public static EnemyStats ArmosWarrior = EnemyLvl10;
    public static EnemyStats Pirate = EnemyLvl10;
    public static EnemyStats DwarfCaptain = EnemyLvl10;
    public static EnemyStats ImpCaptain = EnemyLvl10;

    //..........................................................................................................................................................................................................
                                                                        //LVL (20) ENEMY DECELERATION
    public static EnemyStats Guard = EnemyLvl20;
    public static EnemyStats GoblinGeneral = EnemyLvl20;
    public static EnemyStats Unicorn = EnemyLvl20;
    public static EnemyStats Panda = EnemyLvl20;
    public static EnemyStats Gorilla = EnemyLvl20;
    public static EnemyStats BabyTazhar = EnemyLvl20;
    public static EnemyStats IceBlade = EnemyLvl20;
    public static EnemyStats LivingRock = EnemyLvl20;
    public static EnemyStats EvilMonk = EnemyLvl20;
    public static EnemyStats SpellCaster20 = EnemyLvl20;

    //..........................................................................................................................................................................................................
                                                                        //LVL (30) ENEMY DECELERATION
    public static EnemyStats HillGiant = EnemyLvl30;
    public static EnemyStats IceWarrior = EnemyLvl30;
    public static EnemyStats RogueWarrior = EnemyLvl30;
    public static EnemyStats Bandit = EnemyLvl30;
    public static EnemyStats Wizard = EnemyLvl30;
    public static EnemyStats WizardGuard = EnemyLvl30;
    public static EnemyStats TheGreatWizard = EnemyLvl30;
    public static EnemyStats ElementalWizard = EnemyLvl30;
    public static EnemyStats FireWizard = EnemyLvl30;
    public static EnemyStats SpellCaster30 = EnemyLvl30;

    //..........................................................................................................................................................................................................
                                                                        //LVL (40) ENEMY DECELERATION
    public static EnemyStats YoungDragonRider = EnemyLvl40;
    public static EnemyStats CastleGuard = EnemyLvl40;
    public static EnemyStats Archer = EnemyLvl40;
    public static EnemyStats GuardCaptain = EnemyLvl40;
    public static EnemyStats Assassin = EnemyLvl40;
    public static EnemyStats Lion = EnemyLvl40;
    public static EnemyStats AxeThrower = EnemyLvl40;
    public static EnemyStats Mercenary = EnemyLvl40;
    public static EnemyStats GiantAlligator = EnemyLvl40;
    public static EnemyStats TazharKet = EnemyLvl40;

    //..........................................................................................................................................................................................................
                                                                        //LVL (60) ENEMY DECELERATION
    public static EnemyStats DragonRider = EnemyLvl60;
    public static EnemyStats YoungDragon = EnemyLvl60;
    public static EnemyStats GrizzlyBear = EnemyLvl60;
    public static EnemyStats Giant = EnemyLvl60;
    public static EnemyStats BanditWarLord = EnemyLvl60;
    public static EnemyStats EliteFireWizard = EnemyLvl60;
    public static EnemyStats LivingRockWarrior = EnemyLvl60;
    public static EnemyStats ArcherGeneral = EnemyLvl60;
    public static EnemyStats Daedra = EnemyLvl60;
    public static EnemyStats DarkOrg = EnemyLvl60;

    //..........................................................................................................................................................................................................
                                                                        //LVL (90) ENEMY DECELERATION
    public static EnemyStats Condor = EnemyLvl90;
    public static EnemyStats TheGreatDragon = EnemyLvl90;
    public static EnemyStats ElveravTheDragon = EnemyLvl90;
    public static EnemyStats WizardLord = EnemyLvl90;
    public static EnemyStats King = EnemyLvl90;
    public static EnemyStats MasterDragonRider = EnemyLvl90;
    public static EnemyStats AssassinElite = EnemyLvl90;
    public static EnemyStats TazharKing = EnemyLvl90;
    public static EnemyStats ElderDragon = EnemyLvl90;
    public static EnemyStats WarLock = EnemyLvl90;

    public static EnemyStats DragonGod = EnemyLvl90;    //set to the lvl 90 because its the highest, but we will add stats to him later on.

    //..........................................................................................................................................................................................................
                                                    // And this is were our game starts.. Everything above this is just declarations of value's that we use in our game
    public static void main(String[] args) {
        playerLvlCongrats = 1;
        Town = "Barkel";
        Inv[0] = "";
        Inv[1] = "";
        Inv[2] = "";    //making the strings in the array equal nothing because if i don't then when i print out the inventory it will say null.
        Inv[3] = "";
        Inv[4] = "";
        Inv[5] = "";
        Inv[6] = "";
        expNeededOut = (int) expNeeded;    //making this show up before loop is ran
        expOut = (int) exp;         //making sure this still shows up even if while loop is not run.
        health = healthMax;
        attack = attackMax;
        defence = defenceMax;     //just so i don't have to add this in multiple methods i make this known up here
        strength = strengthMax;
        Name();

    }

    public static void PlayerScreenSet() {
        Clear();    //clearing the screen
        System.out.println("                   Name:" + playerName + "\nHealth: " + health + "    Exp: " + expOut + "/" + expNeededOut + "    Levvl: " + playerLvl + "    Gold: " + gold);   //setting the screen
        //in this method we are just printing the players need to know info like there name and exp and gold and level. you will see this method used a lot in other methods
    }

    public static void Win() {
        exp = exp + EnemyIG.expGain;
        expNeededOut = (int) (expNeeded);    //making this show up before loop is ran
        expOut = (int) (exp);   //making sure this still shows up even if while loop is not run.                the exp is the players total exp and exp Needed is how much the player need to level up
        gold = gold + EnemyIG.gold;                                                                                                 //it would look like this 150/1200

        while (exp >= expNeeded) {  //checks if exp is greater that exp needed to Lvl up
            skillPoints++;
            playerLvl++;    //adding 1 to the players LVL for each time this loop runs
            exp = exp - expNeeded;  // subtracting (expNeeded) from the current exp the player has to get their remaining exp after they Lvl up
            expNeeded = expNeeded * multExp;    //making exp needed to lvl up higher (multiplying it by 1.2)
            expOut = (int) (exp);     //making the float into a int
            expNeededOut = (int) (expNeeded);    //same making float into int
            healthMax = healthMax + 10;
            System.out.println("Congratulations You Have Leveled Up!!");
        }
    }

    public static void StatsScreen() {
        Clear();    //clearing the screen
        System.out.println("    Name: " + playerName + "     Level: " + playerLvl + "    Gold: " + gold + "     SkillPoints: " + skillPoints);     //all this code is just printing to the screen the stats and name of player.
        System.out.println("\nHealth: " + health + "          (h+)");
        System.out.println("Exp: " + expOut + "/" + expNeededOut);
        System.out.println("Attack: " + attack + "          (a+)");
        System.out.println("Defence: " + defence + "        (d+)");
        System.out.println("Strength: " + strength + "      (s+)");
        System.out.println("Potions: " + pots);
        System.out.println("\nType a+ to level up attack s+ for strength and d+ for defence.");
        System.out.println("\n1: Back");

        String were = in.nextLine();     //making "were" equal the player input. //this do/while loop if so that the player does not crash the game when or if he types in the wrong stuff.
        switch (were) {

            case "1":   //if the player entered the #2 then this code would run.
                if (QM1 == true) {
                    QM1 = false;
                    Quartermaster(); //the if statement makes sure that the player goes back to were they came from EX. like if they came from store so they go back there and not to main menu.
                } else if (town == true) {
                    town = false;
                    Town();
                } else if (mainM == true) {
                    mainM = false;
                    MainMenu();
                }else if (introS == true){
                    introS = false;
                    Town();
                } else {
                MainMenu();
                }

                break;
            case "A+":
            case "a+":
                if (skillPoints > 0) {
                    attack++;
                    attackMax++;
                    skillPoints--;
                    StatsScreen();
                } else {
                    StatsScreen();      //this is how you level up your stats
                }
                break;
            case "S+":
            case "s+":
                if (skillPoints > 0) {
                    strength++;
                    strengthMax++;
                    skillPoints--;
                    StatsScreen();
                } else {
                    StatsScreen();
                }
                break;
            case "D+":
            case "d+":
                if (skillPoints > 0) {
                    defence++;
                    defenceMax++;
                    skillPoints--;
                    StatsScreen();
                } else {
                    StatsScreen();
                }
            case "h+":
                if (skillPoints > 0) {
                    health = health + 10;
                    healthMax = healthMax + 10;
                    StatsScreen();
                } else {
                    StatsScreen();
                }

            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not break the game.
                try {
                    System.out.println("Please Enter a valid number");
                    Thread.sleep(1000);
                    Clear();
                    StatsScreen();//running a loop of this exact code
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }


        }


    }

    public static void Name() {
        System.out.println("Please enter name: ");
        String playerName1 = in.nextLine();   //creating and making playername1 equal the player input.
        playerName = playerName1;             // making playerName equal playerName1(just need to to make it work, because playerName1 is equal to a scanner and it will trow errors if you try to use it.)
        Clear();   //clearing the screen
        System.out.println("                  Name: " + playerName); //printing name.
        Intro();    //starting the Intro method.
    }

    public static void Intro() {
        introS = true;
        Clear();   //clearing the screen
        System.out.println("You wake up in a hospital bed and can't remember anything.\n\n" + playerName + ": \"Nurse were am i?\"\nNurse: \"Your are in " + Town + ", you were found in the Forest. You need to get some rest\"\n" +
                playerName + ": \"...No No im good i have to go\"" +
                "\n\nYou stand up and walk outside.\n");
        System.out.println("1: Talk to Quartermaster" + "\n2: View my stats\n3: Inventory\n4: Store");


        String were = in.nextLine();            //making "were" equal the player input. //this do/while loop if so that the player does not crash the game when or if he types in the wrong stuff.
        switch (were) {

            case "1":   //this is saying if the player types in the #1 then it will run this code.
                Quartermaster();
                break;

            case "2":   //if the player entered the #2 then this code would run.
                StatsScreen();  //running the StatsScreen method. Because the #2 option is to look at your stats.
                break;

            case "3":
                Inventory();
                break;

            case "4":
                Store();
                break;


            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not beak the game.
                try {
                    Clear();
                    System.out.println("Please Enter a valid number");
                    System.out.println("1: Fight" + "\n2: View my stats\n3: Store");
                    Thread.sleep(1500);
                    Clear();
                    Intro();//running a loop of this exact code
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }

        }


    }

    public static void MainMenu() {
        Clear();
        mainM = true;
        System.out.println("Health: " + health + "    Exp: " + expOut + "/" + expNeededOut + "    Level: " + playerLvl);   //setting the screen
        System.out.println("\n\t\tYour are in " + Town);
        System.out.println("\n\n\n\n1: Continue Fighting\n2: Return to town\n3: Inventory\n4: Stats\n5: Fast Travel");
        String were = in.nextLine();          //making were equal the player input and were is going to be checked in the switch statement to see if any of the cases equal player input.
        switch (were) {
            case "1":
                PreFight();
                FightScreen();
                break;
            case "2":   //if the player entered the #2 then this code would run.
                Town();  //running the Town method. Because the #2 option is to Return to the town.
                break;
            case "3":
                Inventory();
                break;
            case "4":
                StatsScreen();
                break;
            case "5":
                FastTravel();
                break;
            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not beak the game.
                MainMenu();
        }

    }

    public static void PreFight() {
        Random rand = new Random();        //when a player goes to fight it will choose a random enemy for the player to fight
        num = rand.nextInt(10);    //okay this is a lot to take in basically it is made to if you are in a town the levels of the enemy's there will change accordingly.
        switch (Town) {
                                //Each city has different Levels, this method sets all the names and what levels each city had. it also chooses what city to run by player input
            case "Barkel":      //Lvl 1 Area(Town)
                switch (num) {

                    case 0:
                        BabyGoblin.Name = "Baby Goblin";       //were you see #####.Name=##### that is just setting the name to what ever enemy because we have declared the instance Goblin but their name are all se to Name
                        EnemyIG = BabyGoblin;             //so we have to set their name in order for the player to see the correct name. NOTE that all their level's are the same that is why we only have to se their Name.
                        break;
                    case 1:
                        BabyImp.Name = "Baby Imp";
                        EnemyIG = BabyImp;
                        break;
                    case 2:
                        Skeleton1.Name = "Skeleton";
                        Skeleton1.expGain = 40;         //here we mix it up a bit and set the exp a bit higher, don't want all them to have the same exp or it will look as if we cloned all the same enemy...we did
                        EnemyIG = Skeleton1;          //if you like you can change anything you want in each enemy by typing EnemyIG.what you want to change for example EnemyIG.hp=150 . this will set the hp to 150
                        break;                      //just make sure you rest this by adding EnemyIG.hp=EnemyIG.hpMax in the EnemyDeathScreen method.. or else the hp will go negative and the player would win instantly
                    case 3:                         //if you want to change the Enemy's stats you will have to add some code to the EnemyStats.java Class. this process is a bit long so i will not explain it..
                        WildCat.Name = "Wild Cat";    //But if you do wish to chang it you will have to add a attack/strength/defence Max like the hpMax in order to reset it after that enemy dies.
                        EnemyIG = WildCat;
                        break;
                    case 4:
                        Monkey.Name = "Monkey";
                        EnemyIG = Monkey;
                        break;
                    case 5:
                        Bat.Name = "bat";
                        EnemyIG = Bat;
                        break;
                    case 6:
                        Dog.Name = "Dog";
                        EnemyIG = Dog;
                        break;
                    case 7:
                        Sloth.Name = "Sloth";
                        EnemyIG = Sloth;
                        break;
                    case 8:
                        GiantS1.Name = "Giant Spider";
                        GiantS1.expGain = 50;
                        EnemyIG = GiantS1;
                        break;
                    case 9:
                        Cow.Name = "Cow";
                        EnemyIG = Cow;
                        break;
                }
                break;
            case "Fairview":        //Lvl 5 Area(Town)
                switch (num) {
                    case 0:
                        Imp.Name = "Imp";
                        EnemyIG = Imp;
                        break;
                    case 1:
                        Goblin.Name = "Goblin";
                        EnemyIG = Goblin;
                        break;
                    case 2:
                        GiantSpider5.Name = "Giant Spider";
                        EnemyIG = GiantSpider5;
                        break;
                    case 3:
                        Fox.Name = "Fox";
                        EnemyIG = Fox;
                        break;
                    case 4:
                        Guard5.Name = "Guard";
                        EnemyIG = Guard5;
                        break;
                    case 5:
                        Dwarf.Name = "Dwarf";
                        EnemyIG = Dwarf;
                        break;
                    case 6:
                        GiantScorpion.Name = "Giant Scorpion";
                        GiantScorpion.expGain = 75;
                        EnemyIG = GiantScorpion;
                        break;
                    case 7:
                        GoblinGuard.Name = "Goblin Guard";
                        GoblinGuard.hpMax = 165;
                        GoblinGuard.hp = 165;
                        GoblinGuard.expGain = 75;     //i wanted to make a few stronger so i added a bit more hp on them
                        EnemyIG = GoblinGuard;
                        break;
                    case 8:
                        DwarfGuard.Name = "Dwarf Guard";
                        DwarfGuard.hpMax = 180;
                        DwarfGuard.hp = 180;
                        DwarfGuard.expGain = 75;
                        EnemyIG = DwarfGuard;
                        break;
                    case 9:
                        ImpGuard.Name = "Imp Guard";
                        ImpGuard.hpMax = 160;
                        ImpGuard.hp = 160;
                        ImpGuard.expGain = 75;
                        EnemyIG = ImpGuard;
                        break;
                }
                break;
            case "Angel Grove":     //Lvl 10 Area1(Town)
                switch (num) {
                    case 0:
                        Guard10.Name = "Guard";
                        EnemyIG = Guard10;
                        break;
                    case 1:
                        GiantSpider10.Name = "Giant Spider";
                        EnemyIG = GiantSpider10;
                        break;
                    case 2:
                        Bear.Name = "Bear";
                        EnemyIG = Bear;
                        break;
                    case 3:
                        FireBird.Name = "Fire Bird";
                        EnemyIG = FireBird;
                        break;
                    case 4:
                        SpellCaster.Name = "Spell Caster";
                        EnemyIG = SpellCaster;
                        break;
                    case 5:
                        GiantBat.Name = "Giant Bat";
                        EnemyIG = GiantBat;
                        break;
                    case 6:
                        ArmosWarrior.Name = "Armos Warrior";
                        ArmosWarrior.expGain = 150;
                        ArmosWarrior.gold = 200;
                        ArmosWarrior.hp = 250;
                        EnemyIG = ArmosWarrior;
                        break;
                    case 7:
                        Pirate.Name = "Pirate";
                        EnemyIG = Pirate;
                        break;
                    case 8:
                        DwarfCaptain.Name = "Dwarf Captain";
                        EnemyIG = DwarfCaptain;
                        break;
                    case 9:
                        ImpCaptain.Name = "Imp Captain";
                        EnemyIG = ImpCaptain;
                        break;
                }
                break;
            case "Oakdale":         //Lvl 20 Area(Town)
                switch (num) {
                    case 0:
                        Guard.Name = "Elite Guard";
                        EnemyIG = Guard;
                        break;
                    case 1:
                        GoblinGeneral.Name = "Goblin General";
                        EnemyIG = GoblinGeneral;
                        break;
                    case 2:
                        Unicorn.Name = "Unicorn";
                        EnemyIG = Unicorn;
                        break;
                    case 3:
                        Panda.Name = "Panda";
                        EnemyIG = Panda;
                        break;
                    case 4:
                        Gorilla.Name = "Gorilla";
                        EnemyIG = Gorilla;
                        break;
                    case 5:
                        BabyTazhar.Name = "Baby TazHar";
                        EnemyIG = BabyTazhar;
                        break;
                    case 6:
                        EvilMonk.Name = "Evil Monk";
                        EnemyIG = EvilMonk;
                        break;
                    case 7:
                        LivingRock.Name = "Living Rock";
                        EnemyIG = LivingRock;
                        break;
                    case 8:
                        IceBlade.Name = "Ice Blade";
                        EnemyIG = IceBlade;
                        break;
                    case 9:
                        SpellCaster20.Name = "Spell Caster";
                        EnemyIG = SpellCaster20;
                        break;
                }
                break;
            case "Wizards Cove":    //Lvl 30 Area(Town)
                switch (num) {
                    case 0:
                        HillGiant.Name = "Hill Giant";
                        EnemyIG = HillGiant;
                        break;
                    case 1:
                        IceWarrior.Name = "Ice Warrior";
                        EnemyIG = IceWarrior;
                        break;
                    case 2:
                        RogueWarrior.Name = "Rouge Warrior";
                        EnemyIG = RogueWarrior;
                        break;
                    case 3:
                        Wizard.Name = "Wizard";
                        EnemyIG = Wizard;
                        break;
                    case 4:
                        WizardGuard.Name = "Wizard Guard";
                        EnemyIG = WizardGuard;
                        break;
                    case 5:
                        ElementalWizard.Name = "Elemental Wizard";
                        EnemyIG = ElementalWizard;
                        break;
                    case 6:
                        FireWizard.Name = "Fire Wizard";
                        EnemyIG = FireWizard;
                        break;
                    case 7:
                        TheGreatWizard.Name = "The Great Wizard";
                        TheGreatWizard.attack = 35;
                        TheGreatWizard.defence = 40;
                        TheGreatWizard.hp = 300;
                        EnemyIG = TheGreatWizard;
                        break;
                    case 8:
                        Bandit.Name = "Bandit";
                        EnemyIG = Bandit;
                        break;
                    case 9:
                        SpellCaster30.Name = "Spell Caster";
                        EnemyIG = SpellCaster30;
                        break;
                }
                break;
            case "Echo Valley":     //Lvl 40 Area(Town)
                switch (num){
                    case 0:
                        YoungDragonRider.Name = "Young Dragon Rider";
                        EnemyIG = YoungDragonRider;
                        break;
                    case 1:
                        CastleGuard.Name = "Castle Guard";
                        EnemyIG = CastleGuard;
                        break;
                    case 2:
                        GuardCaptain.Name = "Guard Captain";
                        GuardCaptain.attack = 40;
                        GuardCaptain.defence = 45;
                        GuardCaptain.hp = 400;
                        EnemyIG = GuardCaptain;
                        break;
                    case 3:
                        Archer.Name = "Archer";
                        EnemyIG = Archer;
                        break;
                    case 4:
                        Assassin.Name = "Assassin";
                        EnemyIG = Assassin;
                        break;
                    case 5:
                        Lion.Name = "Lion";
                        EnemyIG = Lion;
                        break;
                    case 6:
                        AxeThrower.Name = "Axe Thrower";
                        EnemyIG = AxeThrower;
                        break;
                    case 7:
                        Mercenary.Name = "Mercenary";
                        EnemyIG = Mercenary;
                        break;
                    case 8:
                        TazharKet.Name = "Tazhar Ket";
                        EnemyIG = TazharKet;
                        break;
                    case 9:
                        GiantAlligator.Name = "Giant Alligator";
                        EnemyIG = GiantAlligator;
                        break;
                 }
                break;
            case "Nuzim":           //Lvl 60 Area(Town)
                switch (num){
                    case 0:
                        DragonRider.Name = "Dragon Rider";
                        EnemyIG = DragonRider;
                        break;
                    case 1:
                        YoungDragon.Name = "Young Dragon";
                        EnemyIG = YoungDragon;
                        break;
                    case 2:
                        GrizzlyBear.Name = "Grizzly Bear";
                        EnemyIG = GrizzlyBear;
                        break;
                    case 3:
                        Giant.Name = "Giant";
                        EnemyIG = Giant;
                        break;
                    case 4:
                        EliteFireWizard.Name = "Elite Fire Wizard";
                        EnemyIG = EliteFireWizard;
                        break;
                    case 5:
                        BanditWarLord.Name = "Bandit WarLord";
                        EnemyIG = BanditWarLord;
                        break;
                    case 6:
                        LivingRockWarrior.Name = "LivingRock Warrior";
                        EnemyIG = LivingRockWarrior;
                        break;
                    case 7:
                        Daedra.Name = "Daedra";
                        EnemyIG = Daedra;
                        break;
                    case 8:
                        DarkOrg.Name = "Dark Org";
                        EnemyIG = DarkOrg;
                        break;
                    case 9:
                        ArcherGeneral.Name = "Archer General";
                        EnemyIG = ArcherGeneral;
                        break;
                }
                break;
            case "Amara":           //Lvl 90 Area(Town)
                switch (num){
                    case 0:
                        TheGreatDragon.Name = "The Great Dragon";
                        TheGreatDragon.attack = 99;
                        TheGreatDragon.strength = 95;
                        TheGreatDragon.hp = 1250;
                        TheGreatDragon.expGain = 1600;
                        EnemyIG = TheGreatDragon;
                        break;
                    case 1:
                        Condor.Name = "Condror";
                        EnemyIG = Condor;
                        break;
                    case 2:
                        ElveravTheDragon.Name = "Elverav The Dragon";
                        EnemyIG = ElveravTheDragon;
                        break;
                    case 3:
                        WizardLord.Name = "Wizard Lord";
                        EnemyIG = WizardLord;
                        break;
                    case 4:
                        King.Name = "KIng";
                        EnemyIG = King;
                        break;
                    case 5:
                        MasterDragonRider.Name = "Master Dragon Rider";
                        EnemyIG = MasterDragonRider;
                        break;
                    case 6:
                        AssassinElite.Name = "Elite Assassin";
                        EnemyIG = AssassinElite;
                        break;
                    case 7:
                        WarLock.Name = "WarLock";
                        EnemyIG = WarLock;
                        break;
                    case 8:
                        TazharKing.Name = "Tazhar King";
                        EnemyIG = TazharKing;
                        break;
                    case 9:
                        ElderDragon.Name = "Elder Dragon";
                        ElderDragon.attack = 120;
                        ElderDragon.strength = 110;
                        ElderDragon.hp = 1500;
                        ElderDragon.expGain = 1800;
                        EnemyIG = ElderDragon;
                }
                break;
        }
    }

    public static void Store() {
        Clear();
        PlayerScreenSet();
        store = true;
        System.out.println("\nCode | Name | Cost          To buy type in the item code. Add a v at the end to view the weapon stats. To sell, type \"sell \" and then item code\n");
        System.out.println("111: Wooden Dagger | $50\n112: Rusty Sword | $100\n113: Hatchet | $250\n114: Spear | $500\n115: Rune Scimitar | $5,000\n116: GodSword | $15,000\n117: Infinity Sword | $78,000\n118: Potion | $100" +
                "\n119: Upgrade Potions | $" + potionsUpgrade);
        System.out.println("\n1: Leave Store\n2: Inventory");
        String were = in.nextLine();
        switch (were) {
            case "111":
                if (dagger == true) {
                    WaitForStore();
                } else {
                    cost = 50;
                    NotEnoughGold();
                    dagger = true;
                    Inv[0] = "1: WoodenDagger";
                    gold = gold - cost;
                    Clear();
                    Store();
                }
                break;
            case "112":
                if (rSword == true) {
                    WaitForStore();
                } else {
                    cost = 100;
                    NotEnoughGold();
                    rSword = true;
                    Inv[1] = "2: Rusty Sword";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "113":
                if (hatchet == true) {
                    WaitForStore();
                } else {
                    cost = 250;
                    NotEnoughGold();
                    hatchet = true;
                    Inv[2] = "3: Hatchet";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "114":
                if (spear == true) {
                    WaitForStore();
                } else {
                    cost = 500;
                    NotEnoughGold();
                    spear = true;
                    Inv[3] = "4: Spear";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "115":
                if (runeSword == true) {
                    WaitForStore();
                } else {
                    cost = 5000;
                    NotEnoughGold();
                    runeSword = true;
                    Inv[4] = "5: Rune Sword";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "116":
                if (godSword == true) {
                    WaitForStore();
                } else {
                    cost = 15000;
                    NotEnoughGold();
                    godSword = true;
                    Inv[5] = "6: God Sword";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "117":
                if (infinitySword == true) {
                    WaitForStore();
                } else {
                    cost = 78000;
                    NotEnoughGold();
                    infinitySword = true;
                    Inv[6] = "7: Infinity Sword";
                    gold = gold - cost;
                    Store();
                }
                break;
            case "Sell 111":
            case "sell 111":
                if (dagger) {
                    dagger=false;
                    Inv[0] = "";
                    gold = daggerC / 2 + gold;            //the cases that say sell in them that is the selling item coeds for if the player want to sell there items
                    Store();
                }
                break;
            case "Sell 112":
            case "sell 112":
                if (rSword) {    //here checking if the item is in the inventory. this is a boolean that is set to tru when the player buys the item
                    runeSword=false;
                    Inv[1] = "";        //clearing the item from the player inventory
                    gold = rustySwordC / 2 + gold;       // the player only get back half of what they bought it for when they sell an item
                    Store();
                }
                break;
            case "Sell 113":
            case "sell 113":
                if (hatchet) {
                    hatchet=false;
                    Inv[2] = "";
                    gold = hatchetC / 2 + gold;
                    Store();
                }
                break;
            case "Sell 114":
            case "sell 114":
                if (spear) {
                    spear=false;
                    Inv[3] = "";
                    gold = spearC / 2 + gold;
                    Store();
                }
                break;
            case "Sell 115":
            case "sell 115":
                if (runeSword) {
                    Inv[4] = "";
                    gold = runeSwordC / 2 + gold;
                    Store();
                }
                break;
            case "Sell 116":
            case "sell 116":
                if (godSword) {
                    godSword=false;
                    Inv[5] = "";
                    gold = godSwordC / 2 + gold;
                    Store();
                }
                break;
            case "Sell 117":
            case "sell 117":
                if (infinitySword) {
                    infinitySword=false;
                    Inv[6] = "";
                    gold = infinitySwordC / 2 + gold;
                    Store();
                }
                break;
            case "118":
                cost = 100;
                NotEnoughGold();
                potions = potions + 1;
                gold = gold - cost;
                Store();
                break;
            case "119":
                if (gold < potionsUpgrade | gold <= 0) {
                    NotEnoughGold();
                }//this is for if the player does not have enough money to buy the upgrade so the player does not go negative
                else {
                    if (potionAttack == 20 & potionDefence == 20 & potionStrength == 20) {      //if potion all potion stats equal 20 you will no longer be able to but it.
                        System.out.println("You have reached the max amount of upgrades.");
                    } else {
                        PotionsUpgrade();
                        gold = gold - potionsUpgrade;
                    }
                }
                Store();
                break;
            case "111V":
            case "111v":
                WoodenDagger();          //the methods that are being called here are just to show stats of each Store item.. you can find it buy the method name(WoodenDagger) Bellow
                break;
            case "112V":
            case "112v":
                RustySword();
                break;
            case "113V":
            case "113v":
                Hatchet();
                break;
            case "114V":
            case "114v":
                Spear();
                break;
            case "115V":
            case "115v":
                RuneScimitar();
                break;
            case "116V":
            case "116v":
                GodSword();
                break;
            case "117V":
            case "117v":
                InfinitySword();
                break;
            case "118V":
            case "118v":
                PotionsStats();
                break;
            case "1":
                store=false;
                Town();
                break;
            case "2":
                Inventory();
                break;

            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not break the game.
                try {
                    Clear();
                    System.out.println("Please Enter a valid number");
                    Thread.sleep(1000);
                    Clear();
                    Store();//running a loop of this exact code
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }

        }

    }

    public static void NotEnoughGold() {//if player does not have enough gold this will happen
        if (gold < cost) {
            try {
                Clear();
                System.out.println("Not enough money");
                Thread.sleep(1000);
                Clear();
                Store();//running a loop of this exact code
            } catch (InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }
    }

    public static void Inventory() {
        Clear();
        System.out.println("\t\tINVENTORY");
        System.out.println("Type e and the number you would like to equip to equip a weapon\n");
        System.out.println(Equipped);
        Arrays.stream(Inv).forEach(System.out::println);
        if (pots > 0) {
            System.out.println("Potions: " + pots);
        }

        System.out.println("\n1: Back");
        String were = in.nextLine();
        switch (were) {
            case "1":
                if (store == true) {
                    store = false;
                    Store();
                } else if (mainM == true) {
                    mainM = false;
                    MainMenu();
                } else {
                    Town();
                }
            break;

            case "E1":  //we did this so if the player does a uppercase letter so it still runs the code
            case "e1":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }

                }
                if (dagger==true){
                    equip=true;
                    Equipped ="Wooden Dagger";
                    WeaponIG=WoodenDagger;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;       //over here we are adding the weapon stats to the players stats if he equips the weapon
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E2":
            case "e2":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (rSword==true) {
                    equip=true;
                    Equipped = "Rusty Sword";
                    WeaponIG=RustySword;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E3":
            case "e3":
                if(equip==true){
                        Clear();
                        System.out.println("You already have a item equipped, Would you like to unequip it?");
                        System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (hatchet==true){
                    equip=true;
                    Equipped ="Hatchet";
                    WeaponIG=Hatchet;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E4":
            case "e4":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (spear==true){
                    equip=true;
                    Equipped ="Spear";
                    WeaponIG=Spear;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E5":
            case "e5":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (runeSword==true){
                    equip=true;
                    Equipped ="Rune Scimitar";
                    WeaponIG=RuneScimitar;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E6":
            case "e6":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (godSword==true){
                    equip=true;
                    Equipped ="God Sword";
                    WeaponIG=GodSword;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();
            break;

            case "E7":
            case "e7":
                if(equip==true){
                    Clear();
                    System.out.println("You already have a item equipped, Would you like to unequip it?");
                    System.out.println("1: Yes\n2: No");
                    String yes1 = in.nextLine();
                    switch (yes1){
                        case "1":
                            Equipped =" ";
                            attack=attack-WeaponIG.Wattack;
                            attackMax=attackMax-WeaponIG.Wattack;
                            defenceMax=defenceMax-WeaponIG.Wdefence;
                            defence=defence-WeaponIG.Wdefence;
                            strengthMax=strengthMax-WeaponIG.Wstrength;
                            strength=strength-WeaponIG.Wstrength;
                            equip=false;
                            Inventory();
                            break;
                    }
                }
                if (infinitySword==true){
                    equip=true;
                    Equipped ="Infinity Sword";
                    WeaponIG=InfinitySword;
                    attack=attack+WeaponIG.Wattack;
                    attackMax=attackMax+WeaponIG.Wattack;
                    defenceMax=defenceMax+WeaponIG.Wdefence;
                    defence=defence+WeaponIG.Wdefence;
                    strengthMax=strengthMax+WeaponIG.Wstrength;
                    strength=strength+WeaponIG.Wstrength;
                }
                Inventory();

            break;

            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not break the game.
                try {
                    Clear();
                    System.out.println("Please Enter a valid number");
                    Thread.sleep(1000);
                    Clear();
                    Inventory();//running a loop of this exact code
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }
        }
    }

    public static void BackToStore() {
        System.out.println("\n\n1: Back"); //here to send player back to store after viewing the weapon stats
        String were = in.nextLine();
        switch (were) {
            case "1":
                Store();
                break;
            default:        //just here to make sure that if a player entered anything other that 1 or 2 it would not break the game.
                try {
                    Clear();
                    System.out.println("Please Enter a valid number");
                    Thread.sleep(1000);
                    Clear();
                    Inventory();//running a loop of this exact code
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }

        }

    }

    public static void WoodenDagger() {
        PlayerScreenSet();
        System.out.println("\nName: " + WoodenDagger.WName);
        System.out.println("Attack: +" + WoodenDagger.Wattack);
        System.out.println("Strength: +" + WoodenDagger.Wstrength);
        System.out.println("Defence: +" + WoodenDagger.Wdefence);
        System.out.println("Level: " + WoodenDagger.WLvl);
        BackToStore();
    }             //..

    public static void RustySword() {
        PlayerScreenSet();
        System.out.println("\nName: " + RustySword.WName);
        System.out.println("Attack: +" + RustySword.Wattack);
        System.out.println("Strength: +" + RustySword.Wstrength);
        System.out.println("Defence: +" + RustySword.Wdefence);
        System.out.println("Level: " + RustySword.WLvl);
        BackToStore();
    }               //..

    public static void Hatchet() {
        PlayerScreenSet();
        System.out.println("\nName: " + Hatchet.WName);
        System.out.println("Attack: +" + Hatchet.Wattack);
        System.out.println("Strength: +" + Hatchet.Wstrength);
        System.out.println("Defence: +" + Hatchet.Wdefence);
        System.out.println("Level: " + Hatchet.WLvl);
        BackToStore();
    }                  //..

    public static void Spear() {
        PlayerScreenSet();
        System.out.println("\nName: " + Spear.WName);
        System.out.println("Attack: +" + Spear.Wattack);
        System.out.println("Strength: +" + Spear.Wstrength);
        System.out.println("Defence: +" + Spear.Wdefence);
        System.out.println("Level: " + Spear.WLvl);
        BackToStore();
    }                    // IN ALL THE WEAPON METHODS WE ARE JUST MAKING THE NAMES/LEVELS CORRESPOND TO TO WEAPON LEVELS DECLARED AT THE TOP OF THE PROGRAM

    public static void RuneScimitar() {
        PlayerScreenSet();
        System.out.println("\nName: " + RuneScimitar.WName);
        System.out.println("Attack: +" + RuneScimitar.Wattack);
        System.out.println("Strength: +" + RuneScimitar.Wstrength);
        System.out.println("Defence: +" + RuneScimitar.Wdefence);
        System.out.println("Level: " + RuneScimitar.WLvl);
        BackToStore();
    }             //..

    public static void GodSword() {
        PlayerScreenSet();
        System.out.println("\nName: " + GodSword.WName);
        System.out.println("Attack: +" + GodSword.Wattack);
        System.out.println("Strength: +" + GodSword.Wstrength);
        System.out.println("Defence: +" + GodSword.Wdefence);
        System.out.println("Level: " + GodSword.WLvl);
        BackToStore();
    }                 //..

    public static void InfinitySword() {
        PlayerScreenSet();
        System.out.println("\nName: " + InfinitySword.WName);
        System.out.println("Attack: +" + InfinitySword.Wattack);
        System.out.println("Strength: +" + InfinitySword.Wstrength);
        System.out.println("Defence: +" + InfinitySword.Wdefence);
        System.out.println("Level: " + InfinitySword.WLvl);
        BackToStore();
    }            //..

    public static void Quartermaster() {
        Clear();
        QM1 = true;   //making this boolean true so that if the payer goes to stats screen they can not go anywhere else but back, And so if they do go back so they fot back to the right place.

        if (Amara==true&QM==true) {//this was added just so players can fight a boss, like the dragon good i want there to be an extra dialog. (IN case 2)
            Clear();
            QM1 = true;   //making this boolean true so that if the payer goes to stats screen they can not go anywhere else but back, And so if they do go back so they fot back to the right place.
                System.out.println("Quartermaster: \"Welcome back " + playerName + " what can i do for you?\"");
            System.out.println("1: Find a fight\n2: Fight Dragon God\n3: View Stats\n4: Walk Away");
            String DragonFight = in.nextLine();
            switch (DragonFight) {
                case "1":
                    PreFight();
                    FightScreen();
                    break;

                case "2":
                    Clear();
                    System.out.println("Quartermaster: Are You sure you want to fight the Dragon God!? He is a very tough opponent");
                    System.out.println("\n\n\n1: Yes I Am Sure, I Know The Risks\n2: No I Do Not Want To Fight Him");
                    String YesorNo = in.next();
                    switch (YesorNo) {
                        case "1":
                            DragonGod.Name = "Dragon God";
                            DragonGod.attack = 200;
                            DragonGod.defence = 200;
                            DragonGod.strength = 200;
                            DragonGod.hp = 2500;
                            DragonGod.hpMax = 2500;
                            DragonGod.expGain = 8000;
                            EnemyIG = DragonGod;
                            FightScreen();
                            break;
                        case "2":
                            Quartermaster();
                            break;
                    }
                    break;

                case "3":
                    StatsScreen();
                    break;

                case "4":
                    Town();
                    break;

                default:
                    Quartermaster();
            }
        }

            if (QM == false) {
            System.out.println("Quartermaster: \"So your the new guy..\"\n" + playerName + ": \"Yes my name is "+playerName+"\nQuartermaster: \"Well if you are ever looking for something to fight come talk to me.\"");
            QM = true;
        } else {
            System.out.println("Quartermaster: \"Welcome back " + playerName + " what can i do for you?\"");
        }
        System.out.println("1: Find a fight\n2: View Stats\n3: Walk Away");
        String doWhat = in.nextLine();
        switch (doWhat) {
            case "1":
                PreFight();
                FightScreen();
                break;
            case "2":
                StatsScreen();
                break;
            case "3":
                Town();
                break;
            default:
                Quartermaster();

        }
    }

    public static void PotionsStats() {
        Clear();
        PlayerScreenSet();
        System.out.println("\n\t\tPotion Stats:");
        System.out.println("\nHp +" + potionHealth + "\nAttack +" + potionAttack + "\nDefence +" + potionDefence + "\nStrength +" + potionStrength);
        BackToStore();
    }

    public static void PotionsUpgrade() {
        int rand1 = rand.nextInt(0 + 4), rand2 = rand.nextInt(0 + 4), rand3 = rand.nextInt(0 + 4);    //this if for the upgrade of the potion it will upgrade each stat for a random number of 0-3 as seen bellow
        uCost = uCost * uGrade;
        potionsUpgrade = (int) uCost;     //in this method we are making sure that the price of the potion upgrade goes up (by 1.2%) every time you buy the upgrade
        if (potionsUpgrade < 3194) {
            potionHealth = potionHealth + 5;
        }
        if (potionAttack >= 20) {
            potionAttack = 20;
        } else {
            potionAttack = potionAttack + rand1;
        }
        if (potionStrength >= 20) {
            potionStrength = 20;
        } else {
            potionStrength = potionStrength + rand2;
        }                                           //here we used 3 random number because i did not want the potion to upgrade evenly i want to upgrades to be random.
        if (potionDefence >= 20) {
            potionDefence = 20;
        } else {
            potionDefence = potionDefence + rand3;
        }                                   //the if statements are there to make sure that the player and get insane amount of stat boost by upgrading
    }

    public static void PotionsDrink() {
        System.out.println(pots);
        if (pots == 0) {
        } else {
            pots = pots - 1;
            if (potsDrinkCount < 2) {
                potsDrinkCount++;
                if (health < healthMax) {               //here we are making sure that the player, if they do drink a potion when they have full health they don't get a health boost.
                    health = health + potionHealth;
                }
                if (health > healthMax) {
                    health = healthMax;
                }              //here we are making sure that even if they had 99 health and they drank a potion so they did not end up more than 100 or their health level(healthMax) healthMax is
                attackMax = attackMax + potionAttack;         //their real health level that is why it only changes when the player levels up
                defenceMax = defenceMax + potionDefence;
                strengthMax = strengthMax + potionStrength;
                potA = potA + potionAttack;
                potD = potD + potionDefence;
                potS = potS + potionStrength;
            } else {
                if (health < healthMax) {               //we added this extra else statement because we did not want to keep giving the player a stats boost, after 3 drinks the player stops getting a stats boost
                    health = health + potionHealth;
                }
                if (health > healthMax) {
                    health = healthMax;
                }              //here we are making sure that even if they had 99 health and they drank a potion so they did not end up more than 100 or their health level(healthMax) healthMax is
            }
        }                                      //we are adding the potion bonus onto the players stats..this gets reset after every fight in the EnemyDeathScreen method
        FightScreen();
    }

    public static void WaitForStore() {  //this is just a delay for the store to tell the player that they own a item, i put it into a method because i did not want to make the Store method any more messy
        try {
            Clear();
            System.out.println("You already own this item");        //this method checks if the player owns the item if he does then it will print this out..
            Thread.sleep(1000);                                 //this method works with the if statement in the store that gow it knows if the player owns the item
            Clear();
            Store();//running a loop of this exact code
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public static void FightScreen() {
        if (health <= 0) {
            YourDead();
        }
        Clear();    //clearing the screen
        if (Potion == true) {    //Okay you might be like "Why did he do this.." well it is to make the game look a bit better. this so it shows that fancy (+1) next to attack when the player has drank a potion
            //NOTICE the code difference in the two print outs. We use the regular attack to display on the screen(does not change..i know.i know) and the attackMax that changes when you drink a
            //potion to work as the actual stats that we use to count the hitDamage, this way when you drink a potion it gets added to the attackMax and not the one on the screen. Again just wank a fancy look
            System.out.println("  " + playerName + "     \tVS   \t" + EnemyIG.Name);       //here we are printing out out fight screen, were we show both the player and enemy stats
            System.out.println("\nHealth:      " + health + "     \t" + EnemyIG.hp + "/" + EnemyIG.hpMax);
            System.out.println("Attack:      " + attack + " (+" + potA + ")" + "     \t" + EnemyIG.attack);
            System.out.println("Defence:     " + defence + " (+" + potD + ")" + "     \t" + EnemyIG.defence);     //we use the potA variable because we cant use the attack/attackMax the numbers are not true. what i mean by this
            System.out.println("Strength:    " + strength + " (+" + potS + ")" + "     \t" + EnemyIG.strength);   //is that if we do use the attack or attack max in here then it will not show the actual pot bonus it will show
            System.out.println("Potions:     " + pots);                                                   //the attack Level. that is why i needed to make another variable. they get set in the PotionsDrink method
            System.out.println("\n\n1: Attack\n2:Drink Potion\n3:Run");
            Attack();//running the Attack method.. all it does is check what the player typed in (1,2,3) and run that code for what they entered
        }
        System.out.println("  " + playerName + "     \tVS   \t" + EnemyIG.Name);       //here we are printing out out fight screen, were we show both the player and enemy stats
        System.out.println("\nHealth:      " + health + "     \t" + EnemyIG.hp + "/" + EnemyIG.hpMax);
        System.out.println("Attack:      " + attack + "         \t" + EnemyIG.attack);
        System.out.println("Defence:     " + defence + "         \t" + EnemyIG.defence);
        System.out.println("Strength:    " + strength + "         \t" + EnemyIG.strength);
        System.out.println("Potions:     " + pots);
        System.out.println("\n\n1: Attack\n2:Drink Potion\n3:Run");
        Attack();//running the Attack method.. all it does is check what the player typed in (1,2,3) and run that code for what they entered


    }

    public static void EnemyDeathScreen() {
        Potion = false;
        Win();
        PlayerScreenSet();
        attackMax = attack;       //here we are setting the player stats back to there levels so that the potions they drank during the fight does not carry over to the next fight
        defenceMax = defence;     //this is the reason we have Max next to some of the variables so that we have a base line that we can reset back too..(this is the opposite for stats) because the other variables change
        strengthMax = strength;  //the only reason it is opposite fot he stats is because i was to lazy to go back and change all the code for it
        EnemyIG.hp = EnemyIG.hpMax;           //same we reset the health so that we don't have that health bonus as well... NOTICE that we reset it to the .hpMax which never changes, ONLY the hp changes.
        System.out.println("\n              Great job you have killed a Level " + EnemyIG.Lvl + " " + EnemyIG.Name);
        if (playerLvl>playerLvlCongrats){       //we use a second int to keep track if the player lvls up. if the lvl is greater than the second int then they have leveled up and the code will run.
            System.out.println("\nCongrats you have Leveled up!! ");    //here we are adding a Congrats if the player lvls up
            playerLvlCongrats=playerLvl;    //making the second int equal the player lvl so it will not show the congrats until the player lvls up again
        }
        System.out.println("\nGold+ " + EnemyIG.gold);
        System.out.println("Exp+ " + EnemyIG.expGain);
        System.out.println("\n1: Next");
        EnemyIG.expGain = EnemyIG.expGainMax; //this is were we reset the exp so each enemy don't have that exp bonus that we added to some of them. NOTE we must put this after the print because it will reset before we
        String dowhat = in.nextLine();        //print out the exp you gained for the fight
        switch (dowhat) {
            case "1":
                MainMenu();
                break;
            default:
                EnemyDeathScreen();
        }
    }

    public static void Clear() {
        for (int i = 0; i < 50; i++)
            System.out.println();   //clear screen method just so we don't have to retype tis every time we want to clear the console
    }

    public static void YourDead() {
        Clear();
        health = healthMax;
        Potion = false;
        attackMax = attack;             //here we are setting the player stats back to there levels so that the potions they drank during the fight does not carry over to the next fight
        defenceMax = defence;           //this is the reason we have Max next to some of the variables so that we have a base line that we can reset back too..(this is the opposite for stats) because the other variables change
        strengthMax = strength;        //the only reason it is opposite fot he stats is because i was to lazy to go back and change all the code for it
        EnemyIG.hp = EnemyIG.hpMax;     //same we reset the health so that we don't have that health bonus as well... NOTICE that we reset it to the .hpMax which never changes, ONLY the hp changes.
        EnemyIG.expGain = EnemyIG.expGainMax; //this is were we reset the exp so each enemy don't have that exp bonus that we added to some of them.
        try {
            Clear();
            System.out.println("O Dear You'r Dead!!");
            Thread.sleep(2000);
            Intro();//running a loop of this exact code
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public static void Attack() {
        if (health <= 0) {
            YourDead();
        } //just in case your dead
        String dowhat = in.nextLine();
        switch (dowhat) {
            //>............................ATTACK FUNCTION
            case "1":
                if (health <= 0) {
                    YourDead();
                } //if your health is 0
                int hitDamage;  //declaring a private int of the name hitDamage which will serve as a place holder for our random hit damage
                randA = rand.nextInt((0 + attackMax) + 1);      //here we get a random number from 1 and the players attack.. we do the same for strength and defence
                randD = rand.nextInt((0 + defenceMax) + 1);     //if you want a random number between 1 and 10 you need to put a +1 after the code.. this is because java counts from 0 to 9 which is still 10 digits..
                randS = rand.nextInt((0 + strengthMax) + 1);    //we use the "Max" version of the stats so we can have that fancy (+1) next to our stats if we drink a potion(More about this in FightScreen Method)
                hitDamage = randA + randD + randD / 3;      //adding the attack/defence/strength random numbers together and then dividing them by 3 do get a random average number which is the amount of damage you deal
                EnemyIG.hp = EnemyIG.hp - hitDamage;    //here we subtract the hit damage from the EnemyIG.hp(Enemy"In Game") NOT the EnemyIG.hpMax DO NOT subtract it from there or you will not have a base hp
                try {                               // to reset it to.
                    System.out.println("You deal " + hitDamage + " damage.");   //just another delay
                    Thread.sleep(300);  //delay of 800 milliseconds
                    if (EnemyIG.hp <= 0) {
                        EnemyDeathScreen();
                    }
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }
                try {
                    int enemyDamage = EnemyIG.attack + EnemyIG.defence + EnemyIG.strength, enemyRand;      //this is the enemy damage to player same as all the other attack is setup
                    enemyDamage = enemyDamage / 3;                                                      //again add all divide all and get a random number between all the stats
                    enemyRand = rand.nextInt(0 + enemyDamage);
                    System.out.println("The " + EnemyIG.Name + " hit you with " + enemyRand + " damage");   //just another delay
                    Thread.sleep(600);  //delay of 800 milliseconds
                    health = health - enemyRand;
                    if (health <= 0) {
                        YourDead();
                    }
                    if (EnemyIG.hp <= 0) {
                        EnemyDeathScreen();
                    }     //just in case you know if enemy dies...
                    FightScreen();
                } catch (InterruptedException e) {
                    System.out.println("got interrupted!");
                }
                break;
                //....................POTION DRINK FUNCTION
            case "2":
                if (pots <= 0) {
                    try {
                        System.out.println("You don't have any potions");   //just another delay
                        Thread.sleep(800);  //delay of 800 milliseconds
                        FightScreen();
                    } catch (InterruptedException e) {
                        System.out.println("got interrupted!");
                    }
                } else if (potsDrinkCount == 2) {
                    Potion = true;
                    try {
                        System.out.println("You have gained the max number of stats bonus from potions!");   //just another delay
                        Thread.sleep(800);  //delay of 800 milliseconds
                        PotionsDrink();
                        FightScreen();
                    } catch (InterruptedException e) {
                        System.out.println("got interrupted!");
                    }
                } else {
                    Potion = true;
                    PotionsDrink();
                }

                break;
                //.........................RUN FUNCTION
            case "3":       //this is the runaway calculations
                int eRun = EnemyIG.attack + EnemyIG.strength + EnemyIG.defence, pRun = attack + defence + strength, runChance, runDamage;
                eRun = eRun / 3;
                pRun = pRun / 3;
                runChance = rand.nextInt(0 + pRun) + 1;
                runDamage = rand.nextInt(0 + eRun);
                if (runChance == eRun|runChance==eRun+1|runChance==eRun-1|runChance==eRun+3|runChance==eRun-4) { // i did this because i want players to have a bigger change for getting away
                    try {
                        Clear();    //we clear the screen before putting up the following text
                        System.out.println("You have successfully ran away!");   //printing this to screen
                        Thread.sleep(1200);  //delay of 800 milliseconds
                        PlayerScreenSet();                              //we have to do this again because if we don't when the player goes to fight again the stats and health of the enemy will stay from last game
                        attackMax = attack;       //here we are setting the player stats back to there levels so that the potions they drank during the fight does not carry over to the next fight
                        defenceMax = defence;     //this is the reason we have Max next to some of the variables so that we have a base line that we can reset back too..(this is the opposite for stats) because the other variables change
                        strengthMax = strength;  //the only reason it is opposite fot he stats is because i was to lazy to go back and change all the code for it
                        EnemyIG.hp = EnemyIG.hpMax;           //same we reset the health so that we don't have that health bonus as well... NOTICE that we reset it to the .hpMax which never changes, ONLY the hp changes.
                        MainMenu();
                    } catch (InterruptedException e) {
                        System.out.println("got interrupted!");
                    }
                } else {
                    health = health - runDamage;
                    try {
                        System.out.println("You have failed to ran away! You get hit with " + runDamage + " damage");   //printing this to screen
                        if (health <= 0) {
                            YourDead();
                        }
                        Thread.sleep(1200);  //delay of 800 milliseconds
                        FightScreen();
                    } catch (InterruptedException e) {
                        System.out.println("got interrupted!");
                    }
                }
                break;
            default:
                Attack();   //if the player types a incorrect number it will just run this method again.
        }
    }

    public static void Town() {
        town = true;
        PlayerScreenSet();
        System.out.println("\n\t\tYour are in " + Town + " (Lvl " + townLvl + ")" + "\n\t What would you like to do?");
        System.out.println("\n\n\n\n1: Talk to Quartermaster\n2: Go to store\n3: Got to hospital\n4: View Stats\n5: Inventory\n6: Leave Town");
        String doWhat = in.nextLine();
        switch (doWhat) {
            case "1":
                Quartermaster();
                break;
            case "2":
                Store();
                break;
            case "3":
                Hospital();
                break;
            case "4":
                StatsScreen();
                break;
            case "5":
                Inventory();
                break;
            case "6":
                MainMenu();
                break;
            default:
                Town();
        }
    }

    public static void Hospital() {
        PlayerScreenSet();
        System.out.println("\n\nHi Welcome to " + Town + " towns hospital, what can i do for you?");
        System.out.println("\n\n1: Heal me\n2: Leave hospital");
        String doWhat = in.nextLine();
        switch (doWhat) {
            case "1":
                health = healthMax;
                Hospital();
                break;
            case "2":
                Town();
                break;
            default:
                Hospital();
        }
    }

    public static void TravelWaitTime() {
        Clear();        //i made this method just so that there was a little delay in fast travel and so it sad were you are going while you are waiting
        try {
            System.out.println("Traveling to " + Town);   //just another delay
            Thread.sleep(5000);  //delay of 5000 milliseconds or 5 seconds
            Town();
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public static void FastTravel() {
        PlayerScreenSet();
        System.out.println("\t\tWere Would you like to go?");
        System.out.println("\n1: Barkel\t\t\t(Lvl 1)\n2: Fairview\t\t\t(Lvl 5)\n3: Angel Grove \t\t(Lvl 10)\n4: Oakdale \t\t\t(Lvl 20)\n5: Wizards Cove\t\t(Lvl 30)\n6: Echo Valley\t\t(Lvl 40) " +
                "\n7: Nuzim\t\t\t(Lvl 60)\n8: Amara\t\t\t(Lvl 90)\n\n9: Back");

        String doWhat = in.nextLine();
        switch (doWhat) {
            case "1":
                Amara=false;
                Town = "Barkel";
                townLvl = 1;
                TravelWaitTime();
                break;
            case "2":
                Amara=false;
                Town = "Fairview";
                townLvl = 5;
                TravelWaitTime();
                break;
            case "3":
                Amara=false;
                Town = "Angel Grove";
                townLvl = 10;
                TravelWaitTime();
                break;
            case "4":
                Amara=false;
                Town = "Oakdale";
                townLvl = 20;
                TravelWaitTime();
                break;
            case "5":
                Amara=false;
                Town = "Wizards Cove";
                townLvl = 30;
                TravelWaitTime();
                break;
            case "6":
                Amara=false;
                Town = "Echo Valley";
                townLvl = 40;
                TravelWaitTime();
                break;
            case "7":
                Amara=false;
                Town = "Nuzim";
                townLvl = 60;
                TravelWaitTime();
                break;
            case "8":
                Amara=true;
                Town = "Amara";
                townLvl = 90;
                TravelWaitTime();
                break;
            case "9":
                MainMenu();
                break;
            default:
                FastTravel();
        }
    }

}