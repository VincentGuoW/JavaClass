package A2408Aug2024.Class11;

public class PingPongPlayer extends PlayerDemo implements EnglishSpeaking{

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("Ping Pong player learn how to Ping Pong");
    }

    @Override
    public void English() {
        System.out.println("Ping Pong player speak English");
    }
    
}
