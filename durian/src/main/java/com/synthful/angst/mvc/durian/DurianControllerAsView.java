package com.synthful.angst.mvc.durian;

import java.util.Properties;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.synthful.angst.common.AAngsta;

@Controller
@RequestMapping("/durianview")
public class DurianControllerAsView extends AAngsta {

    private String plantFruitName;
    
    @Value(value = "${plant.fruit.name}")
    private void setPlantFruitName(String plantFruitName) {
        this.plantFruitName = plantFruitName;
        logger.info("plantFruitName 1:{}", plantFruitName);
    }
    
    @Value(value = "${plant.fruit.type}")
    private String plantFruitType;

    
    @Inject private String view1Html;
    
    /**
     * 
     * @param model
     * @return
     * @throws Exception
     * 
     *             Browser url: http://{hostname}:{port}/{context}/v/durianview/v1 e.g.,
     *             http://localhost:8080/durian/v/durianview/v1
     */
    @RequestMapping(value = "/v1", method = RequestMethod.GET)
    @ResponseBody
    public String requestHandler (ModelMap model) throws Exception {

        logger.info("plantFruitName 2:{}", plantFruitName);
        logger.info("plantFruitType:{}", plantFruitType);
        return view1Html;
    }
    
    

}
