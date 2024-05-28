package designpatterns.demo.decoratorpattern;

public class AudioDecorator extends VideoDecorator{
	
	private String audioFile;

	public AudioDecorator(VideoContent videoContent,String audioFile) {
		super(videoContent);
		this.audioFile = audioFile;
	}
	
	@Override
	public void play() {
		super.play();
		System.out.println("Adding Audio file to the player: " + audioFile);
	}

}
