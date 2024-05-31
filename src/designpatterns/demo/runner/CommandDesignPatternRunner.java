package designpatterns.demo.runner;

import designpatterns.demo.commandpattern.AddNewSongCommand;
import designpatterns.demo.commandpattern.MusicPlayerInvoker;
import designpatterns.demo.commandpattern.NextTrackCommand;
import designpatterns.demo.commandpattern.PauseCommand;
import designpatterns.demo.commandpattern.PlayCommand;
import designpatterns.demo.commandpattern.PreviousTrackCommand;

public class CommandDesignPatternRunner {
	
//	In a music player application, users can 
//	perform several actions, such as playing a 
//	song, pausing the playback, and skipping to the next track.
	
	public static void main(String[] args) {
		
		MusicPlayerInvoker invoker = new MusicPlayerInvoker();
		
		invoker.setCommand(new AddNewSongCommand("Song One"));
		invoker.executeCommand();
		
		invoker.setCommand(new AddNewSongCommand("Song Two"));
		invoker.executeCommand();
		
		invoker.setCommand(new PlayCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new PauseCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new PlayCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new NextTrackCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new NextTrackCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new PreviousTrackCommand());
		invoker.executeCommand();
		
		invoker.setCommand(new PauseCommand());
		invoker.executeCommand();
		
	}
}
