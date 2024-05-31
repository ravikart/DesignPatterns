package designpatterns.demo.commandpattern;

public class PreviousTrackCommand implements Command {

	@Override
	public void execute(Player player) {
		player.playPrevious();
	}

}
