package com.chen4du.chap12;

//具体处理者，总经理
public class GeneralManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if(fee<10000) {
			if("zs".equals(user)) {
				str = "总经理同意了 "+user+" 的聚餐申请 "+fee+" 美元";				
			}else {
				str="boss拒绝了你的聚餐申请";
			}
		}else {
			str = "总经理觉得你花太多不让你去聚餐";
		}
		return str;
	}
	

}
