package com.chen4du.chap13;

//体育馆
public class TiYuGuan implements Jianzhu{

	private String name;
	private String shape;
	private String yundong;
	
	public TiYuGuan(String yundong) {
		this.setYundong(yundong);
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public String getShape() {
		return shape;
	}



	public String getYundong() {
		return yundong;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public void setYundong(String yundong) {
		this.yundong = yundong;
	}



	@Override
	public void use() {
		System.out.println("该体育馆用来举办"+yundong+"运动"+"形状为："+shape+"名称为"+name);
	}
	
	

}
