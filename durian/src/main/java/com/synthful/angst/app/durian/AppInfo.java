package com.synthful.angst.app.durian;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.synthful.angst.common.AAngsta;
import com.synthful.angst.common.AngstaProperties;

@Service
public class AppInfo
extends AAngsta{
    
	private Message message;
	private AngstaProperties aProperties;
	private String wName;
	private int wValue;
	
	@Inject
	private String greeting;
	
	@Inject
	public void setMessage (Message message) {
		this.message = message;
		logger.info("message={}", message);
	}
	
	@Inject
	public void setAProperties(AngstaProperties aProperties) {
		this.aProperties = aProperties;
		logger.info("aProperties={}", aProperties);
	}
	
	@Inject
	public void setWally(Wally wally){
		this.wName = wally.getName();
		this.wValue = wally.getValue();
		logger.info("wally={}", wally);		
	}
	
	@Inject Address hampdenME;
	
	AppInfo(){
	}
}
