class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter
    {
        @Override
        boolean isVulnerable()
        {
            return false;
        }
        @Override
        public String toString()
        {
            return "Fighter is a Warrior";
        }
        @Override
        int getDamagePoints(Fighter wizard)
        {
            return wizard.isVulnerable() ? 10 : 6;
        }
    }

// TODO: define the Wizard class
class Wizard extends Fighter
{
    boolean c = false;
    @Override
    public String toString()
    {
        return "Fighter is a Wizard";
    }
    void prepareSpell()
    {
       c = true;
    }
    @Override
    boolean isVulnerable()
    {
        return c ? false : true;
    }
    @Override
    int getDamagePoints(Fighter warrior)
    {
        return c ? 12 : 3;
    }
    
}
