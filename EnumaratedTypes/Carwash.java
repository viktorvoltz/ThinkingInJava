import java.util.EnumSet;

public class Carwash {
    public enum Cycle { 
        UNDERBODY { 
        void action() { System.out.print("Spraying the underbody"); } 
        }, 
        WHEELWASH { 
        void action() { System.out.print("Washing the wheels"); } 
        }, 
        PREWASH { 
        void action() { System.out.print("Loosening the dirt"); } 
        }, 
        BASIC { 
        void action() { System.out.print("The basic wash"); } 
        }, 
        HOTWAX { 
        void action() { System.out.print("Applying hot wax"); } 
        }, 
        RINSE { 
        void action() { System.out.print("Rinsing"); } 
        }, 
        BLOWDRY { 
        void action() { System.out.print("Blowing dry"); } 
        }; 
        abstract void action(); 
        } 
        EnumSet<Cycle> cycles = 
        EnumSet.of(Cycle.BASIC, Cycle.RINSE); 
        public void add(Cycle cycle) { cycles.add(cycle); } 
        public void washCar() { 
        for(Cycle c : cycles) 
        c.action(); 
        } 
        public String toString() { return cycles.toString(); } 
        public static void main(String[] args) { 
        Carwash wash = new Carwash(); 
        System.out.print(wash); 
        wash.washCar(); 
        // Order of addition is unimportant: 
        wash.add(Cycle.BLOWDRY); 
        wash.add(Cycle.BLOWDRY); // Duplicates ignored 
        wash.add(Cycle.RINSE); 
        wash.add(Cycle.HOTWAX); 
        System.out.print(wash); 
        wash.washCar(); 
        }
}
