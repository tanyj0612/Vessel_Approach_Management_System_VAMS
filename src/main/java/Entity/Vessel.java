package Entity;

public class Vessel {

    private int vesselID;
    private String vesselName;
    private String vesselAddress;
    private String vesselPhone;
    public Vessel() {

    }

    public int getVesselID() {
        return vesselID;
    }

    public void setVesselID(int vesselID) {
        this.vesselID = vesselID;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getVesselAddress() {
        return vesselAddress;
    }

    public void setVesselAddress(String vesselAddress) {
        this.vesselAddress = vesselAddress;
    }

    public String getVesselPhone() {
        return vesselPhone;
    }

    public void setVesselPhone(String vesselPhone) {
        this.vesselPhone = vesselPhone;
    }
}
