package thread.tortoise;

import thread.rabbit.Rabbit;

public class Tortoise extends Thread {
    public static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise(Thread tortoise) {
        this.tortoise = new Thread(this,"Torotise");
    }

    public Thread getTortoise() {
        return tortoise;
    }
}
