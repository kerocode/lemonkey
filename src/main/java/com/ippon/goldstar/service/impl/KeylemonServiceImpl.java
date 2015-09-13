package com.ippon.goldstar.service.impl;

import com.ippon.goldstar.service.KeylemonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KeylemonServiceImpl implements KeylemonService {

    private final Logger log = LoggerFactory.getLogger(KeylemonServiceImpl.class);

}
