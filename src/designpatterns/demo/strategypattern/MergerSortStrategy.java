package designpatterns.demo.strategypattern;

public class MergerSortStrategy implements SortingStrategy{

	@Override
	public void sort(int[] inputArray) {
		System.out.println("Merge Sorting");
	}

}
