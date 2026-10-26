
/*
Program 20: State Design Pattern

Purpose:
State Pattern changes an object's behavior according to its state.
Here, a media player behaves differently when playing or paused.
*/

// State interface defines the behavior for each player state
interface PlayerState {
    void pressButton(MediaPlayer player);
}

// Behavior when the player is paused
class PausedState implements PlayerState {
    @Override
    public void pressButton(MediaPlayer player) {
        System.out.println("Resuming playback");

        // Change the player's state to playing
        player.setState(new PlayingState());
    }
}

// Behavior when the player is playing
class PlayingState implements PlayerState {
    @Override
    public void pressButton(MediaPlayer player) {
        System.out.println("Pausing playback");

        // Change the player's state to paused
        player.setState(new PausedState());
    }
}

// Context maintains the current state of the player
class MediaPlayer {
    private PlayerState state;

    public MediaPlayer() {
        // Initially, the player is paused
        state = new PausedState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void pressButton() {
        // Delegate behavior to the current state
        state.pressButton(this);
    }
}

public class StatePattern {
    public static void main(String[] args) {
        // Create the media player
        MediaPlayer player = new MediaPlayer();

        // Each button press behaves according to the current state
        player.pressButton();
        player.pressButton();
        player.pressButton();
    }
}
