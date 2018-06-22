package com.synthful.angst.mvc.durian;

import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.synthful.angst.common.AAngsta;
import com.synthful.angst.model.Address;

@Controller
@RequestMapping("/duriangrove")
public class DurianGroveMVController extends AAngsta {

    @Inject
    private String season; // Inject static field into instance field
    @Resource(name = "zipMap")
    private Map<Integer, Address> zipMap;

    /**
     * Response to Hello.jsp
     * 
     * @param model
     * @return
     * @throws Exception
     * 
     *             Browser url: http://{hostname}:{port}/{context}/duriangrove/h2g2j
     *             e.g.,
     *             http://localhost:8080/durian/v/duriangrove/h2g2j?who=Annie&what=Waker&when=now
     */
    @RequestMapping(value = "/h2g2j", method = { RequestMethod.GET, RequestMethod.POST })
    public String anotherHandleRequest(ModelMap model,
            @RequestParam("who") String who,
            @RequestParam("street") String street,
            @RequestParam("zip") int zip)
        throws Exception {

        Address addr = zipMap.get(zip);
        String city = addr != null ? addr.city : "Walla Walla";
        String state = addr != null ? addr.state.name() : "ZZ";
        String where = String.format("%s, %s, %s %05d", street, city, state, zip);

        model.addAttribute("who", who);
        model.addAttribute("where", where);
        model.addAttribute("what", season);

        logger.info("anotherHandleRequest: {},{},{} ", who, where, season);
        return "Cello";
    }
}
