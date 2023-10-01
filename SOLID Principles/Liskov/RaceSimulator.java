public class RaceSimulator {
    public void simulateRace(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.accelerate();
        }
    }
}
