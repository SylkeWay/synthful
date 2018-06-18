package com.synthful.angst.mvc.durian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.synthful.angst.common.AAngsta;

@Controller
@RequestMapping("/duriangrove")
public class DurianGroveMVController
extends AAngsta{

	/**
	 * Response to Hello.jsp
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * Browser url:
	 *  http://{hostname}:{port}/{context}/duriangrove/h2g2j
	 * e.g.,
	 *  http://localhost:8080/durian/v/duriangrove/h2g2j?who=Annie&what=Waker&when=now
	 */
    @RequestMapping(value = "/h2g2j", method = {RequestMethod.GET,RequestMethod.POST})
	public String anotherHandleRequest(ModelMap model,
			@RequestParam("who") String who,
			@RequestParam("what") String what,
			@RequestParam("when") String when)			
	throws Exception {
		model.addAttribute("who", who);
		model.addAttribute("why", "does the sea rush to shore?");
		
		logger.info("anotherHandleRequest: {},{},{} ", who, what, when);
		return "Cello";
	}
}
