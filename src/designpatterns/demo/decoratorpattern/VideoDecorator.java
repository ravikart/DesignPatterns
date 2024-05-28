package designpatterns.demo.decoratorpattern;

public abstract class VideoDecorator implements VideoContent{
	
	protected VideoContent videoContent;
	
	public VideoDecorator(VideoContent videoContent) {
		this.videoContent = videoContent;
	}
	
	@Override
	public void play() {
		videoContent.play();
	}

}
