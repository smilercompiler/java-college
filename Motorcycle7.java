
    public class Motorcycle7 implements Vehicle7 {
        public double fuelLevel;
    
        public Motorcycle7(double fuelLevel) {
            this.fuelLevel = fuelLevel;
        }
    
        @Override
        public void start() {
            System.out.println("Motorcycle is starting...");
        }
    
        @Override
        public void stop() {
            System.out.println("Motorcycle is stopping...");
        }
    
        @Override
        public double getFuelLevel() {
            return fuelLevel;
        }
    }

