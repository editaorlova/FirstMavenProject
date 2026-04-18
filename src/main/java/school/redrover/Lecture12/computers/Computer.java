package school.redrover.Lecture12.computers;

public class Computer {

    private boolean powerOn;
    private final Specs specs;
    private final PowerButton powerButton;

    public Computer(Specs specs) {
        this.specs = specs;
        powerButton = new PowerButton();
    }

    private void start() {
        powerOn = true;
    }

    private void stop() {
        powerOn = false;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public PowerButton getPowerButton() {
        return powerButton;
    }

    // Static inner class
    // Nested class
    static class Specs { // static class не имеет доступа к инстанс variables – к полям экземпляра каждого компьютера
        private final int ramGB;
        private final int cores;

        public Specs(int ramGB, int cores) {
            this.ramGB = ramGB;
            this.cores = cores;
        }

        public int getCores() {
            return cores;
        }

        public int getRamGB() {
            return ramGB;
        }

    }

    //inner class
    class PowerButton {
        public void press() {
            if (powerOn) {
                stop();
            } else {
                start();
            }
        }
    }
}

class Printer {

}
