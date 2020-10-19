package com.synthful.angst.model;

import java.util.Arrays;
import java.util.List;

import com.synthful.angst.common.AAngsta;

public class Address extends AAngsta {
    final static public String NULL = null;
    final public String street;
    final public String city;
    final public State state;
    final public int zip;

    public Address(String street, String city, int zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;

        for (State state : State.values()) {
            if (state.zipcodes.contains(zip)) {
                this.state = state;
                return;
            }
        }

        this.state = null;
    }

    static public enum State {
        MA(Arrays.asList(1001, 1004, 1103)), ME(Arrays.asList(3910, 4091, 4100, 4112, 4444)),
        MO(Arrays.asList(63440, 63572)), OR(Arrays.asList(97101, 97288, 97311, 97425)),
        WA(Arrays.asList(98140, 98300, 98424, 98761, 98576)),;

        List<Integer> zipcodes;

        State(List<Integer> zipcodes) {
            this.zipcodes = zipcodes;
        }
    }
}
