package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "WEEEEKEND!!!";

    }

    @Override

    public String createMainMessage() {

        return "Music i sprzatanko";

    }

    @Override

    public String createClosingMessage() {

        return "Moze imprezka?";

    }
}