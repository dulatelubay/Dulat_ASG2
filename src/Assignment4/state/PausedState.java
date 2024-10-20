package Assignment4.state;

public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Player is already paused.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping the player.");
        player.setState(new StoppedState());
    }
}
