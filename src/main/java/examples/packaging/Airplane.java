package examples.packaging;

import examples.packaging.options.DVDPlayer;

public class Airplane {
    private DVDPlayer dvd = new DVDPlayer();
    public void startInFlightEntertainment() {
        dvd.insert(" Airplane II");
        dvd.play();
    }

}
