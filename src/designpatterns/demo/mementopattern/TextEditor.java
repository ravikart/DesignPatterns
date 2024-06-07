package designpatterns.demo.mementopattern;

public class TextEditor {
	
	private String textContent;
	
	public TextEditor(String textContent) {
		this.textContent = textContent;
	}
	
	public TextEditorMemento createMemento() {
		return new TextEditorMemento(this.textContent);
	}

	public String writeText(String textContent) {
		this.textContent = this.textContent + textContent;
		return this.textContent;
	}
	
	public void restoreFromMemento(TextEditorMemento textEditorMemento) {
		this.textContent = textEditorMemento.getSavedContent();
	}
	
	public String getContent() {
		return this.textContent;
	}
	

}
