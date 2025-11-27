import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
       int r = this.random.nextInt(10);
        return PLANET_CLASSES[r];
    }

    String randomShipRegistryNumber() {
        int r = this.random.nextInt(9000) + 1000;
        return "NCC-"+r;
    }

    double randomStardate() {
        double r = 41000.0 + 1000.0 * this.random.nextDouble();
        return r;
    }
}
