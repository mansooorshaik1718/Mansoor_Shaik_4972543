package Exercise3;

// File: BuilderPatternExample.java
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern

        // Basic Computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming Computer configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setCoolingSystem("Liquid Cooling")
                .build();

        // Workstation configuration
        Computer workstation = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA Quadro RTX 5000")
                .setMotherboard("ASUS Pro WS X570-ACE")
                .setPowerSupply("750W")
                .setCoolingSystem("Air Cooling")
                .build();

        // Print configurations
        System.out.println("Basic Computer Configuration: ");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println();

        System.out.println("Gaming Computer Configuration: ");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("GPU: " + gamingComputer.getGPU());
        System.out.println("Cooling System: " + gamingComputer.getCoolingSystem());
        System.out.println();

        System.out.println("Workstation Configuration: ");
        System.out.println("CPU: " + workstation.getCPU());
        System.out.println("RAM: " + workstation.getRAM());
        System.out.println("Storage: " + workstation.getStorage());
        System.out.println("GPU: " + workstation.getGPU());
        System.out.println("Motherboard: " + workstation.getMotherboard());
        System.out.println("Power Supply: " + workstation.getPowerSupply());
        System.out.println("Cooling System: " + workstation.getCoolingSystem());
    }
}
