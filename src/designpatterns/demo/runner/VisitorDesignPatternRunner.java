package designpatterns.demo.runner;

import java.util.Arrays;

import designpatterns.demo.visitorpattern.Animal;
import designpatterns.demo.visitorpattern.FeedVisitor;
import designpatterns.demo.visitorpattern.Lion;
import designpatterns.demo.visitorpattern.SoundVisitor;
import designpatterns.demo.visitorpattern.Tiger;

public class VisitorDesignPatternRunner {
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[]{new Lion("CHICKEN", "ROAR"),
				new Lion("CHICKEN", "ROAR"), new Tiger("MUTTON", "GROWL"),
				new Tiger("MUTTON", "CHUFF")};

		printOutput(animals);
	}

	private static void printOutput(Animal[] animals) {
		SoundVisitor soundVisitor = new SoundVisitor();
		
		FeedVisitor feedVisitor = new FeedVisitor();
		
		Arrays.asList(animals).stream().forEach((value) -> {
			
			System.out.println(value.accept(soundVisitor));
			
			System.out.println(value.accept(feedVisitor));
		});
	}

}
