package durian;

import java.util.List;

import org.junit.Test;

import com.synthful.angst.common.AAngsta;

public class Trivial implements AAngsta{

    @Test (expected=NullPointerException.class)
    public void nullIterator() {
        getLogger().info("Start");
        for (String s : (List<String>) null ) {
            getLogger().info("String: {}", s);
        }
        getLogger().info("End");
    }
}
