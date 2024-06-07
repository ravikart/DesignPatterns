package designpatterns.demo.mementopattern;

public class TextEditorMemento {
	
	private String textContent;
	
	public TextEditorMemento(String textContent) {
		this.textContent = textContent;
	}
	
	public String getSavedContent() {
		return this.textContent;
	}

}
