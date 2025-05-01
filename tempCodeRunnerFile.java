public class Vehiclemain7 {
    
        public static void main(String[] args) {
            Vehicle myCar = new Car7(50.5);
            Vehicle myMotorcycle = new Motorcycle7(15.0);
    
            myCar.start();
            System.out.println("Car Fuel Level: " + myCar.getFuelLevel() + " liters");
            myCar.stop();
    
            System.out.println();
    
            myMotorcycle.start();
            System.out.println("Motorcycle Fuel Level: " + myMotorcycle.getFuelLevel() + " liters");
            myMotorcycle.stop();
        }
    }
    

