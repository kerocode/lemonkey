package com.ippon.goldstar.service;

import com.keylemon.api.*;
import org.springframework.stereotype.Service;

/**
 * Created by canatalio on 9/13/15.
 */

@Service
public class KeylemonServiceImpl implements KeylemonService {

    @Override
    public String sendImage() {

        Client api = new Client("keroles", "icCIO7qH6gd6IJHytanquRB6sE0IQCxD1QsC2S6CgkyxpG70YS4ZL3", "klws.keylemon.com", "https", "443");

        System.out.println("Usage:  " + api.getUsage());

        return null;
    }
}
