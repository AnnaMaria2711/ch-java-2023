package vererbung;

public class Screen extends ElectronicDevice implements CanBeHiFi {
    public int getResolutionx() {
        return resolutionx;
    }

    public void setResolutionx(int resolutionx) {
        this.resolutionx = resolutionx;
    }

    public int getResolutiony() {
        return resolutiony;
    }

    public void setResolutiony(int resolutiony) {
        this.resolutiony = resolutiony;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    private int resolutionx;
    private int resolutiony;
    private int inch;

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
