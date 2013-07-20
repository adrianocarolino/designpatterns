package designpatterns.composite;

import java.util.List;

public class HEAD extends Composite {
	
	private List<String> acceptedElements;
	
	public void addChild(ElementHTML child) {
		if (acceptedElements.contains(child.getClass().getCanonicalName())) {
			throw new RuntimeException(); 
		}
		super.addChild(child);
	}
	
	public void validar() {
		
	}
	
	public void desenhar() {
		
	}

}
