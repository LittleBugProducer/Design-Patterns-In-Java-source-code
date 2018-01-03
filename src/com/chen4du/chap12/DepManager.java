package com.chen4du.chap12;

//具体处理者，部门经理
public class DepManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if(fee<1000) {
			if("zs".equals(user)) {
				str = "部门大大同意了 "+user+" 的聚餐申请 "+fee+" 美元";				
			}else {
				str="部门大大拒绝了你的聚餐申请";
			}
		}else {
			if(getSuccessor()!=null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}
	

}
