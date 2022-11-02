package pwo.lab09.factory;

public class Wednesday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Środa. Środek tygodnia.";

    }

    @Override

    public String createMainMessage() {

        return "Sroda minie, tydzien zginie";

    }

    @Override

    public String createClosingMessage() {

        return "Jeszcze tylko 2 dni.";

    }
}