package designpatterns.demo.commandpattern;

public class PauseCommand implements Command{

	@Override
	public void execute(Player player) {
		player.pause();
	}

}
