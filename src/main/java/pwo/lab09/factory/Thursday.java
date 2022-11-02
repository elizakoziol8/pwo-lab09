package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Czwartek, czwarteczek.";

    }

    @Override

    public String createMainMessage() {

        return "Przedostatni dzien!!!";

    }

    @Override

    public String createClosingMessage() {

        return "Jeszcze tylko jutro i koniec.";

    }
}