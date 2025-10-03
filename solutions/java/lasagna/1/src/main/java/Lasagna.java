public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        int minutesInOven = 40;
        return minutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven)
    {
        return 40 - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers)
    {
        int minutesSpent = numberOfLayers * 2;
        return minutesSpent;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven)
    {
        int totalTime = (numberOfLayers * 2) + actualMinutesInOven;
        return totalTime;
    }
}

