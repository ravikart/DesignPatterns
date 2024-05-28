package designpatterns.demo.runner;

import designpatterns.demo.decoratorpattern.AudioDecorator;
import designpatterns.demo.decoratorpattern.BasicVideo;
import designpatterns.demo.decoratorpattern.SubtitleVideoDecorator;
import designpatterns.demo.decoratorpattern.VideoContent;

public class DecoratorDesignPatternRunner {
	
//	Consider a video streaming platform where users can watch movies 
//	and TV shows. Each video content may have additional features 
//	or options available, such as subtitles, 
//	language preferences, video quality options, and audio enhancements.

	public static void main(String[] args) {
		
		VideoContent basicVideo = new BasicVideo();
		
		VideoContent videoWithSubtitle =  new SubtitleVideoDecorator(basicVideo, "English");
		
		VideoContent videoWithDifferentAudio = new AudioDecorator(videoWithSubtitle, "Tamil");
		
		videoWithDifferentAudio.play();
		
	}

}
