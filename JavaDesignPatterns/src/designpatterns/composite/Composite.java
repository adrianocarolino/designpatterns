package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends ElementHTML {
	
	private List<ElementHTML> children = new ArrayList<ElementHTML>();
	
	public void addChild(ElementHTML e) {
		children.add(e);
	}
	
	public void validar() {
		for (ElementHTML filHtml : children) {
			filHtml.validar();
		}
		super.validar();
	}
	
	public void desenhar() {
		for (ElementHTML filHtml : children) {
			filHtml.desenhar();
		}
		super.desenhar();
	}

}
