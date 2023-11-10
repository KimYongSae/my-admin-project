package com.example.myadminproject.log;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
public class LoggingTest {

    @Test
    public void testLogging(){
        log.info("infotest");
        log.trace("tracetest");
    }
}
