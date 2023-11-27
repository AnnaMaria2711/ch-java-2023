package vererbung;

public class Headset extends ElectronicDevice implements CanBeHiFi {

    public boolean isHifi() {
        return hifi;
    }

    @Override
    public boolean getHifi() {
        return false;
    }

    @Override
    public void setHifi(boolean hifi) {
        this.hifi = hifi;
    }

    private boolean hifi;

}
