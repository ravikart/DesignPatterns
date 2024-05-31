package designpatterns.demo.commandpattern;

public interface Player {
	
	public void play();
	
	public void pause();
	
	public void playNext();
	
	public void playPrevious();
	
	public void addSong(String newSong);

}
