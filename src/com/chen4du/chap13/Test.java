package com.chen4du.chap13;

//测试类
public class Test {

	public static void main(String[] args) {
		String yundong = "足球";
		String bas = "篮球";
		for(int i = 0;i<5;i++) {
			TiYuGuan tyg = JianZhuFactory.getTyg(yundong);
			tyg.setName("china");
			tyg.setShape("round");
			tyg.use();
			TiYuGuan t2 = JianZhuFactory.getTyg(bas);
			t2.setName("cobe");
			t2.setShape("line");
			t2.use();
			System.out.println("factory中对象数量为:"+JianZhuFactory.getSize());
		}
	}
}
