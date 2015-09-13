package com.ippon.goldstar.service.impl;

import com.ippon.goldstar.service.KeylemonService;
import com.keylemon.api.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KeylemonServiceImpl implements KeylemonService {

    private final Logger log = LoggerFactory.getLogger(KeylemonServiceImpl.class);

    @Override
    public String sendImage() {

        Client api = new Client("keroles", "icCIO7qH6gd6IJHytanquRB6sE0IQCxD1QsC2S6CgkyxpG70YS4ZL3", "klws.keylemon.com", "https", "443");

        System.out.println("Usage:  " + api.getUsage());

        return null;
    }
}
