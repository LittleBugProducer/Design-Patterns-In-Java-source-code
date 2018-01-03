package com.chen4du.chap12;

//具体处理者，项目经理
public class ProjectManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String string = "";
		if(fee<500) {
			if("zs".equals(user)) {
				string="成功:项目经理已经批准 "+user+" 的聚餐费用，额度为 "+fee+" 美元";
			}else {
				string = "失败，项目经理要求你先干活";
			}
		}else {
			if(getSuccessor()!=null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return string;
	}
	

}
