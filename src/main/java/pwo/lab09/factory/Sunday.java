package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Trzeba leniuchowac";

    }

    @Override

    public String createMainMessage() {

        return "Pyszny obiadek";

    }

    @Override

    public String createClosingMessage() {

        return "JUtro poniedzialek :(((";

    }
}