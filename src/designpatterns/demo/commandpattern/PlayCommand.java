package designpatterns.demo.commandpattern;

public class PlayCommand implements Command{

	@Override
	public void execute(Player player) {
		player.play();
	}

}
