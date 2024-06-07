package designpatterns.demo.strategypattern;

public class BubbleSortStrategy implements SortingStrategy{

	@Override
	public void sort(int[] inputArray) {
		System.out.println("Bubble Sorting");
	}

}
