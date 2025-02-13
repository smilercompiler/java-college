    abstract class Vehicle {
        protected String make;
        protected String model;
    
        public Vehicle(String make, String model) {
            this.make = make;
            this.model = model;
        }
    
        public abstract void startEngine();
        public abstract void stopEngine();
    
        public void serviceInfo() {
            System.out.println("Servicing for " + make + " " + model + " should be done every 5000 km.");
        }
    }
    
    class Car extends Vehicle {
        public Car(String make, String model) {
            super(make, model);
        }
    
        @Override
        public void startEngine() {
            System.out.println(make + " " + model + "'s engine is starting...");
        }
    
        @Override
        public void stopEngine() {
            System.out.println(make + " " + model + "'s engine is stopping...");
        }
    }
    
     
    

