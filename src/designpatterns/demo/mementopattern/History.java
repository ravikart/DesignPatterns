package designpatterns.demo.mementopattern;

import java.util.Stack;

public class History {
	
	private Stack<TextEditorMemento> textEditorMemento;
	
	public History() {
		this.textEditorMemento =  new Stack<TextEditorMemento>();
	}
	
	public void addMemento(TextEditorMemento memento) {
		this.textEditorMemento.add(memento);
	}
	
	public TextEditorMemento getMemento() {
		if(this.textEditorMemento.size() > 0) {			
			return this.textEditorMemento.pop();
		}
		
		return new TextEditor("").createMemento();
	}

}
