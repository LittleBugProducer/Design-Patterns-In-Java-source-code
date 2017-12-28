package com.chen4du.chap5.demo1;

import java.util.ArrayList;
import java.util.List;

//树枝
public class Composite extends Component{
	private List<Component>childComponents = new ArrayList<Component>();
	private String name;
	public Composite(String name) {
		this.name=name;		
	}
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr+"+"+this.name);
		if(this.childComponents!=null) {
			preStr+=" ";
			for(Component c:childComponents) {
				c.printStruct(preStr);
			}
		}
	}
	@Override
	public void addChild(Component child) {
		childComponents.add(child);
	}
	@Override
	public void removeChild(int index) {
		childComponents.remove(index);
	}
	@Override
	public List<Component>getChild(){
		return childComponents;
	}

}
