package com.synthful.angst.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface AAngsta {
    default Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }

}
