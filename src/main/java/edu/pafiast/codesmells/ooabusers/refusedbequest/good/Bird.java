package edu.pafiast.codesmells.ooabusers.refusedbequest.good;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird implements Flyable {
    @Override
    public void fly() {
        log.info("Flying");
    }
}