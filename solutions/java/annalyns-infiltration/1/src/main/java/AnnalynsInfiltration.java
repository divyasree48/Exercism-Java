class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) 
    {
         if (knightIsAwake) 
         return false;
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake)
    {
         if (knightIsAwake)
             return true;
        if (archerIsAwake)
            return true;
        if (prisonerIsAwake)
            return true;
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) 
    {
        if (archerIsAwake) 
        {
            return false;
        }
        if (!prisonerIsAwake) return false;   
        return true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) 
    {
        if (petDogIsPresent)
        {
            if (!archerIsAwake)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (prisonerIsAwake)
            {
                if (!knightIsAwake)
                {
                    if(!archerIsAwake) return true;
                    else return false;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
    }
}
