interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        // Lambda expressions for different triggers
        LightAction motionTrigger = () -> System.out.println("Motion detected! Lights ON.");
        LightAction nightTrigger = () -> System.out.println("It's night time! Lights dimmed.");
        LightAction voiceTrigger = () -> System.out.println("Voice command received! Changing color to blue.");

        // Simulate triggers
        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}
