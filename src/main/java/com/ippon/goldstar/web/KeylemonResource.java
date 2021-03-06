package com.ippon.goldstar.web;

import com.codahale.metrics.annotation.Timed;
import com.google.gson.JsonElement;
import com.ippon.goldstar.domain.Person;
import com.ippon.goldstar.domain.User;
import com.ippon.goldstar.repository.UserRepository;
import com.ippon.goldstar.repository.search.UserSearchRepository;
import com.ippon.goldstar.service.KeylemonService;
import com.keylemon.api.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.xml.ws.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import com.google.gson.JsonArray;

import com.keylemon.api.*;
import org.springframework.web.multipart.MultipartFile;

import static org.elasticsearch.index.query.QueryBuilders.queryString;

/**
 * REST controller for managing users.
 */
@RestController
@RequestMapping("/api/keylemon")
public class KeylemonResource {

    private final Logger log = LoggerFactory.getLogger(KeylemonResource.class);

    //@Inject
    //private KeylemonService keylemonService;

    /**
     * GET  /users -> get all users.
     */
    @RequestMapping(value = "/image",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAll(@RequestBody MultipartFile file) {

        log.debug("Got file named : {}", file);


        Client api = new Client("canatalio", "Ulwl57xMMdCUbildhOFahy79J166xDt3H6lRmCo53Kl0clR5QQ7hZf", "klws.keylemon.com", "https", "443");

        // Images can be given as public URLs.
        String image_url = "http://i.imgur.com/lxfF23x.jpg";
        byte[] data = new byte[0];
        try {
            data = file.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer();

// Detect face and ask for gender and age estimation (last bool parameter)
        com.keylemon.api.Response res = api.detectFace(new String[]{image_url}, new byte[][]{data}, true);
        JsonArray faceResult = null;
        List<Person> people = new ArrayList<>();
        if(res.success){
            faceResult = res.json.getAsJsonObject().getAsJsonArray("faces");

            for (int i = 0; i < faceResult.size(); i++) {

            }
        }

        return res.success ? res.json.getAsJsonObject().toString() : null;
    }




}
