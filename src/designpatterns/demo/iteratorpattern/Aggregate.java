package designpatterns.demo.iteratorpattern;

public interface Aggregate<T> {
	
	public Iterator<T> createIterator();

}
