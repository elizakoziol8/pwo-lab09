package pwo.lab09.composite;


public class Pokrywa extends WaterSystem {
        public void fill() {
        super.fill();
    }

    public void afterFill() {
        super.afterFill();
    }

    public void drain() {
        super.drain();
    }

    public void afterDrain() {

        super.afterDrain();
    }

    @Override
    public void checkIfEnough() {
       System.out.println("Wody jest juz wystarczajaco!");
       super.checkIfEnough();
    }
    
    
}