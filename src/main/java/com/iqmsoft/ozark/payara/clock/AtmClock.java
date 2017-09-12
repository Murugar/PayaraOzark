package com.iqmsoft.ozark.payara.clock;

import java.time.LocalTime;
import javax.ejb.Stateless;


@Stateless
public class AtmClock {

    public String currentTime() {
        return LocalTime.now().toString();
    }

}
