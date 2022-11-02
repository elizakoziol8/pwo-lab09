package pwo.lab09.factory;

public class Friday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Piątek, piątunio, piąteczek.";

    }

    @Override

    public String createMainMessage() {

        return "Chce sie zyc!";

    }

    @Override

    public String createClosingMessage() {

        return "Piątek łikendu początek.";

    }
}