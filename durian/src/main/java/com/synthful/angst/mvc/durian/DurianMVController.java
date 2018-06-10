package com.synthful.angst.mvc.durian;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.synthful.angst.app.durian.Wally;
import com.synthful.angst.common.AAngsta;

@Controller
public class DurianMVController
extends AAngsta{

	private Wally wally;

	@Inject
	public void setWally(Wally wally){
		this.wally = wally;
		logger.info("mvc wally={}", wally);		
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * Browser url:
	 *  http://{hostname}:{port}/{context}/v/h1
	 * e.g.,
	 *  http://localhost:8080/durian/v/h1
	 */
    @RequestMapping(value = "/h1", method = RequestMethod.GET)
	public String handleRequestJoyfully()			
	throws Exception {
		
		logger.info("handleRequestJoyfully");
		return "Hello";
	}
}
