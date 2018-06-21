package com.synthful.angst.mvc.durian;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.synthful.angst.common.AAngsta;

@Controller
@RequestMapping("/durianview")
public class DurianControllerAsView extends AAngsta {

    @Inject private String view1Html;
    /**
     * 
     * @param model
     * @return
     * @throws Exception
     * 
     *             Browser url: http://{hostname}:{port}/{context}/durianview/v1 e.g.,
     *             http://localhost:8080/durian/durianview/v1
     */
    @RequestMapping(value = "/v1", method = RequestMethod.GET)
    @ResponseBody
    public String requestHandler (ModelMap model) throws Exception {


        logger.info("handleRequestJoyfully");
        return view1Html;
    }
    
    

}
