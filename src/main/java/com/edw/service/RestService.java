package com.edw.service;

import org.springframework.stereotype.Service;

/**
 * <pre>
 *     com.edw.service.RestService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jan 2024 14:12
 */
@Service
public class RestService {

    public String getRestClientOne() {
        randomPause();
        return "hello";
    }

    public String getRestClientTwo() {
        randomPause();
        return "hello";
    }

    public String getRestClientThree() {
        randomPause();
        return "hello";
    }

    private void randomPause() {
        new Sleep().randomPause();
    }
}