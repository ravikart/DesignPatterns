package designpatterns.demo.runner;

import designpatterns.demo.strategypattern.BubbleSortStrategy;
import designpatterns.demo.strategypattern.MergerSortStrategy;
import designpatterns.demo.strategypattern.QuickSortStrategy;
import designpatterns.demo.strategypattern.SortingContext;

public class StrategyDesignPatternRunner {
	
	public static void main(String[] args) {
		
		
		SortingContext  context =  new SortingContext();
		context.setStrategy(new BubbleSortStrategy());
		int[] array3 = {6, 1, 3, 9, 5};
		context.performSortin(array3);
		
		context.setStrategy(new QuickSortStrategy());
		context.performSortin(array3);
		
		context.setStrategy(new MergerSortStrategy());
		context.performSortin(array3);
	}

}
