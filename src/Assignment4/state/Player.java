package Assignment4.state;

public class Player {
    private PlayerState state;

    public Player() {
        state = new StoppedState(); // Start in the stopped state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
