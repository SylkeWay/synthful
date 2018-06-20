package com.synthful.angst.mvc.durian;

import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.synthful.angst.app.durian.Wally;
import com.synthful.angst.common.AAngsta;
import com.synthful.angst.model.Address;

@Controller
public class DurianMVController extends AAngsta {

    final static public String SEASON = "Spring";

    private Wally wally;

    @Resource(name = "zipMap")
    private Map<Integer, Address> zipMap;

    @Inject
    public void setWally(Wally wally) {
        this.wally = wally;
        logger.info("mvc wally={}", wally);
    }

    /**
     * 
     * @param model
     * @return
     * @throws Exception
     * 
     *             Browser url: http://{hostname}:{port}/{context}/v/h1 e.g.,
     *             http://localhost:8080/durian/v/h1
     */
    @RequestMapping(value = "/h1", method = RequestMethod.GET)
    public String handleRequestJoyfully(ModelMap model) throws Exception {

        StringBuilder selectOpts = generateSelectOptions(zipMap);
        model.addAttribute("zippers", selectOpts.toString());

        logger.info("handleRequestJoyfully");
        return "Hello";
    }

    static private StringBuilder generateSelectOptions(Map<Integer, Address> zipMap) {
        StringBuilder sbuf = new StringBuilder();
        zipMap.keySet().forEach((key) -> {
            String opt = String.format("<option value=\"%d\">%05d</option>\n", key, key);
            sbuf.append(opt);
        });
        return sbuf;
    }
}
