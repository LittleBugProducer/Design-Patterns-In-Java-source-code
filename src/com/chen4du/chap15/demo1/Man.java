package com.chen4du.chap15.demo1;

//Product
public class Man {

	private String head;
	private String body;
	private String foot;
	public String getHead() {
		return head;
	}
	public String getBody() {
		return body;
	}
	public String getFoot() {
		return foot;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
	@Override
	public String toString() {
		return "Man [head=" + head + ", body=" + body + ", foot=" + foot + "]";
	}
	
	
}
