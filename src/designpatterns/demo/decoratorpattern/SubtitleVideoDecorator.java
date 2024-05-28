package designpatterns.demo.decoratorpattern;

public class SubtitleVideoDecorator extends VideoDecorator{
	
	private String langugage;

	public SubtitleVideoDecorator(VideoContent videoContent,String langugage) {
		super(videoContent);
		this.langugage = langugage;
	}
	
	@Override
	public void play() {
		super.play();
		System.out.println("Adding Subtitle to the player: " + langugage);
	}

}
