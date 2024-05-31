package designpatterns.demo.commandpattern;

import java.util.LinkedList;
import java.util.List;

/*Music Player will act as a Receiver*/

public class MusicPlayer implements Player{
	
	private List<String> songList = new LinkedList<String>();
	private static int currentSongIndex = 0;
	
	@Override
	public void addSong(String nextSong) {
		songList.add(nextSong);
	}
	
	@Override
	public void play() {
		if(songList.size() > currentSongIndex) {
			System.out.println("Playing below song: ");
			System.out.println(songList.get(currentSongIndex));
		}else if(songList.size() > 0){
			System.out.println("Playing below song: ");
			currentSongIndex = 0;
			System.out.println(songList.get(0));			
		}else {
			System.out.println("PlayList is Empty");
		}
	}
	
	@Override
	public void playNext() {
		if(songList.size() > currentSongIndex + 1) {
			System.out.println("Playing Next song: ");
			System.out.println(songList.get(currentSongIndex + 1));
			currentSongIndex++;
		}else if(songList.size() > 0){
			System.out.println("Playing from beginning song: ");
			System.out.println(songList.get(0));
			currentSongIndex = 0;
		}
	}
	
	@Override
	public void pause() {
		System.out.println("Music Player is Paused");
	}
	
	@Override
	public void playPrevious() {
		if(currentSongIndex - 1 >= 0 && songList.size() > currentSongIndex - 1) {
			System.out.println("Playing Previous song: ");
			System.out.println(songList.get(currentSongIndex - 1));
			currentSongIndex--;
		}else if(songList.size() > 0){
			System.out.println("Playing from beginning song: ");
			System.out.println(songList.get(0));
			currentSongIndex = 0;
		}
	}

}
