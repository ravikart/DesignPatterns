package designpatterns.demo.commandpattern;

public class AddNewSongCommand implements Command{
	
	private String newSong;
	
	public AddNewSongCommand(String newSong){
		this.newSong = newSong;
	}

	@Override
	public void execute(Player player) {
		player.addSong(this.newSong);
	}

}
