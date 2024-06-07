package designpatterns.demo.strategypattern;

public class QuickSortStrategy implements SortingStrategy{

	@Override
	public void sort(int[] inputArray) {
		System.out.println("Quick Sorting");
	}

}
