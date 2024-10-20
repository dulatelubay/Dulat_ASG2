package Assignment4.state;

public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Starting playback from the beginning.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Can't pause. The player is stopped.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Player is already stopped.");
    }
}
