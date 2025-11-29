import java.util.*;


class DnDCharacter {
    int strength,dexterity,constitution,intelligence,wisdom,charisma;
    public DnDCharacter()
    {
     strength = ability(rollDice());
    dexterity = ability(rollDice());
     constitution = ability(rollDice());
     intelligence = ability(rollDice());
     wisdom = ability(rollDice());
     charisma = ability(rollDice());
    }
    
    int ability(List<Integer> scores) {
        int mini = 7, s = 0;
        for(int i:scores)
            {
                s += i;
                mini = Math.min(mini,i);
            }
        return s-mini;
    }

    List<Integer> rollDice() {
        Random r = new Random();
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < 4;i++)
            {
                int ele = r.nextInt(6)+1;
                //System.out.println(ele);
                l.add(ele);
            }
        return l;
    }

    int modifier(int input) {
        double m = (input - 10) / 2.0;
        return (int)Math.floor(m);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
