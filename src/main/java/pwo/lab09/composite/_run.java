package pwo.lab09.composite;

public class _run {

    public static void main(String[] args) {

        WaterSystem waterSystem = new WaterSystem();

        waterSystem.addComponent(new Tank());

        waterSystem.addComponent(new Tap());
        
        waterSystem.addComponent(new Pokrywa());

        System.out.println("Napełnienie:");

        waterSystem.fill();

        waterSystem.afterFill();
        
        waterSystem.checkIfEnough();

        System.out.println("\nOpróżnienie:");

        waterSystem.drain();

        waterSystem.afterDrain();

    }
}