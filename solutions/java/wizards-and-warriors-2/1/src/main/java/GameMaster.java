public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character c)
    {
        return "You're a level "+c.getLevel()+" "+c.getCharacterClass()+" with "+c.getHitPoints()+" hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination d){
        return "You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod t)
    {
        if(t == TravelMethod.HORSEBACK)
        {
            return "You're traveling to your destination on horseback.";
        }
        else
        {
            return "You're traveling to your destination by walking.";
        }
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character c,Destination d,TravelMethod t){
        return describe(c)+" "+describe(t) + " "+describe(d);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character c, Destination d)
    {
        return describe(c)+" You're traveling to your destination by walking. "+describe(d);
    }
}
