package tp3Cucumber;

public class Apartment {

    String keysLocation;
    Boolean hasKeys;

    Boolean closeDoor;
    public void lookForKey(String location) {
        this.keysLocation = location;
        this.hasKeys = true;
    }

    public void leave() {
        this.closeDoor = true;
    }
}
