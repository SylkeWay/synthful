package com.synthful.angst.app.durian;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.synthful.angst.common.AAngsta;
import com.synthful.angst.model.Address;
import com.synthful.angst.model.Branch;
import com.synthful.angst.model.Message;

@Service
public class AppInfo extends AAngsta {

    private Message message;
    private String wName;
    private int wValue;

    @Inject
    private Branch hampdenBranch;
    @Inject
    private String greeting;
    @Inject
    Address hampdenME;

    @Value(value = "${maxUsers}")
    String maxUsers;

    public void setMessage(Message message) {
        this.message = message;
        logger.info("message={}", message);
    }

    @Inject
    public void setWally(Wally wally) {
        this.wName = wally.getName();
        this.wValue = wally.getValue();

        // logger will print injected values
        // since this class is instantiated
        logger.info("After instantiation of: {}", this);
        logger.info("wally={}", wally);
        logger.info("message:{} Location={} {}", message, hampdenBranch, hampdenME);
        logger.info("property maxUsers: {}", maxUsers);
    }

    AppInfo() {
        // logger will print null injection values because
        // injection is possible only after this class is instantiated,
        // which is after constructor completes
        logger.info("During constructor instantiation of: {}", this);
        logger.info("message:{} Location={} {}", message, hampdenBranch, hampdenME);
        logger.info("property maxUsers: {}", maxUsers);
    }
}
