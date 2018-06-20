package com.synthful.angst.app.durian;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.synthful.angst.common.AAngsta;
import com.synthful.angst.common.AngstaProperties;
import com.synthful.angst.model.Address;
import com.synthful.angst.model.Branch;
import com.synthful.angst.model.Message;

@Service
public class AppInfo extends AAngsta {

    private Message message;
    private String wName;
    private int wValue;

    @Inject private Branch hampdenBranch;
    @Inject private String greeting;
    @Inject Address hampdenME;

    @Inject
    public void setMessage(Message message) {
        this.message = message;
        logger.info("message={}", message);
    }

    @Inject
    public void setWally(Wally wally) {
        this.wName = wally.getName();
        this.wValue = wally.getValue();
        logger.info("wally={}", wally);
    }

    // logger will print null injection values because
    // injection is possible only after instantiation,
    // which is when constructor completes
    AppInfo() {
        logger.info("message:{} Location={} {}", message, hampdenBranch, hampdenME);
    }
}
