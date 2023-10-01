public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bicycle()};

        RaceSimulator raceSimulator = new RaceSimulator();
        raceSimulator.simulateRace(vehicles);
    }
}
