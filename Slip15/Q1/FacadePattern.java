class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play(String movie) {
        System.out.println("Playing DVD: " + movie);
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

class TheaterLights {
    public void dim() {
        System.out.println("Theater Lights are dimmed");
    }

    public void bright() {
        System.out.println("Theater Lights are brightened");
    }
}

class Screen {
    public void up() {
        System.out.println("Screen is UP");
    }

    public void down() {
        System.out.println("Screen is DOWN");
    }
}

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer,Projector projector, TheaterLights theaterLights,Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        dvdPlayer.on();
        projector.on();
        theaterLights.dim();
        screen.down();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        amplifier.off();
        dvdPlayer.off();
        projector.off();
        theaterLights.bright();
        screen.up();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, theaterLights, screen);

        homeTheaterFacade.watchMovie("Inception");

        System.out.println("\n--- Movie ends ---\n");

        homeTheaterFacade.endMovie();
    }
}
