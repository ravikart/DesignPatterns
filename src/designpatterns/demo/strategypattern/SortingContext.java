package designpatterns.demo.strategypattern;

public class SortingContext {
	
	private SortingStrategy sortStrategy;
	
	public void setStrategy(SortingStrategy sortStrategy){
		this.sortStrategy = sortStrategy;
	}
	
	public void performSortin(int[] inputArray) {
		this.sortStrategy.sort(inputArray);
	}

}
