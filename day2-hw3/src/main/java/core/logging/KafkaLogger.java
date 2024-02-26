package core.logging;

public class KafkaLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println("Logged to kafka: " + data);
    }
}
