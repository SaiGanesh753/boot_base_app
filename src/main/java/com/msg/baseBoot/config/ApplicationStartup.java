package com.msg.baseBoot.config;

import com.msg.baseBoot.service.CacheSVC;
import com.msg.baseBoot.utils.BaseUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value = "applicationStartup")
public class ApplicationStartup {

    @Autowired
    CacheSVC cacheSVC;

    private Logger log = LogManager.getLogger(this.getClass().getName());

    /*private @Value("${spring.datasource.driver-class-name}")
    String driverClassName;
    private @Value("${spring.datasource.url}")
    String url;
    private @Value("${spring.datasource.username}")
    String userName;
    private @Value("${spring.datasource.password}")
    String password;
    private @Value("${spring.jpa.database-platform}")
    String dbDialect;*/

    @PostConstruct
    public void afterApplicationStartUp() {
        log.debug("Application startup done, and loading config params.");
        loadConfigParams();
    }

    private void loadConfigParams() {
        BaseUtils.getConfigParams(cacheSVC.getConfigParams());
    }

}
