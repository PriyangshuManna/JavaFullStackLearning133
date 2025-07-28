package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        String tmp = "mysql",str = "overload";
        logger.info("the {} database has {} problem", tmp,str);

    }
}