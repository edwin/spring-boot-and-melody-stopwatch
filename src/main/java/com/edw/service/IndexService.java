package com.edw.service;

import org.springframework.stereotype.Service;

/**
 * <pre>
 *     com.edw.service.IndexService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jan 2024 16:19
 */
@Service
public class IndexService {

    private RestService restService = new RestService();

    public void getRestClientOne() {
        restService.callRestAPIOne();
    }

    public void getRestClientTwo() {
        restService.callRestAPITwo();
    }

    public void getRestClientThree() {
        restService.callRestAPIThree();
    }
}
