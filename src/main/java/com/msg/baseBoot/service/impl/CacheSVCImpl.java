package com.msg.baseBoot.service.impl;

import com.msg.baseBoot.dao.ConfigRepository;
import com.msg.baseBoot.service.CacheSVC;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CacheSVCImpl implements CacheSVC {

    Logger log = LogManager.getLogger(this.getClass());

    @Autowired
    protected ConfigRepository configRepository;

    @Override
    public Map<String, String> getConfigParams() {
        //List<Config> configValues = configRepository.findAll();
        //Map<String, String> configMap = configValues.stream().collect(Collectors.toMap(config -> config.getConfigKey(), Config::getDescription));
        //log.info("Loading Config Values...{}", configMap.size());
        return null;
    }
}
