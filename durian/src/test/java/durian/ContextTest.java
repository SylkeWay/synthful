package durian;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synthful.angst.common.AAngsta;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/app-context.xml"})
public class ContextTest implements AAngsta{

    @Inject
    private String greeting;
    @Test
    public void showEnv() {
        getLogger().info("greeting:{}", greeting);
    }

}
