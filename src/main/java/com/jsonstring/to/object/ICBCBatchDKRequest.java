package com.jsonstring.to.object;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author li_hhui
 * @date:2019年6月16日
 * @version:
 */
public class ICBCBatchDKRequest {

	private ICBCBatchDKHeader HEADER;
	private ICBCBatchDKBody BODY;
	@JSONField(name="HEADER")
	public ICBCBatchDKHeader getHEADER() {
		return HEADER;
	}
	public void setHEADER(ICBCBatchDKHeader hEADER) {
		HEADER = hEADER;
	}
	@JSONField(name="BODY")
	public ICBCBatchDKBody getBODY() {
		return BODY;
	}
	public void setBODY(ICBCBatchDKBody bODY) {
		BODY = bODY;
	}
	
	
}
