package designpatterns.demo.runner;

import designpatterns.demo.mementopattern.History;
import designpatterns.demo.mementopattern.TextEditor;
import designpatterns.demo.mementopattern.TextEditorMemento;

public class MementoDesignPatternRunner {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor("Initial Content");
		
		History history = new History();
		
		history.addMemento(editor.createMemento());
		editor.writeText("\n Added Additional TEXT");
		
		history.addMemento(editor.createMemento());
		
		editor.writeText("\n Next Line");
		history.addMemento(editor.createMemento());
		
		//Performing UNDO twice
		history.getMemento();
		TextEditorMemento lastSavedMemento = history.getMemento();
		
		if(lastSavedMemento != null) {
			editor.restoreFromMemento(lastSavedMemento);
		}
		
		System.out.println(editor.getContent());
	}

}
