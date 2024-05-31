package designpatterns.demo.commandpattern;

public class NextTrackCommand implements Command{

	@Override
	public void execute(Player player) {
		player.playNext();
	}

}
