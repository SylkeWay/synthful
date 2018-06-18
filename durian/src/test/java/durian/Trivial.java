package durian;

import java.util.List;

import org.junit.Test;

import com.synthful.angst.common.AAngsta;

public class Trivial extends AAngsta{

    @Test (expected=NullPointerException.class)
    public void nullIterator() {
        logger.info("Start");
        for (String s : (List<String>) null ) {
            logger.info("String: {}", s);            
        }
        logger.info("End");
    }
}
