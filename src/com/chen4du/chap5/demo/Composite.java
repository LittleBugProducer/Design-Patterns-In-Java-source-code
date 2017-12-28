package com.chen4du.chap5.demo;

import java.util.ArrayList;
import java.util.List;


//树枝
public class Composite implements Component{

	private List<Component> childComponents = new ArrayList<Component>();
	
	private String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void addChild(Component child) {
		childComponents.add(child);
		
	}
	
	public void removeChild(int index) {
		childComponents.remove(index);
	}
	
	public List<Component> getChild(){
		return childComponents;
	}
	
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr+"+"+this.name);
		if(this.childComponents!=null) {
			preStr+="  ";
			for(Component c:childComponents) {
				c.printStruct(preStr);
			}
		}
	}
	

}
