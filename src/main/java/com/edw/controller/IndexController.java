package com.edw.controller;

import com.edw.service.RestService;
import net.bull.javamelody.MonitoredWithSpring;
import net.bull.javamelody.Stopwatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jan 2024 14:08
 */
@RestController
public class IndexController {

    @Autowired
    private RestService restService;

    @GetMapping(path = "/hello")
    public String hello() {
        restService.getRestClientOne();
        restService.getRestClientTwo();
        restService.getRestClientThree();

        return "good";
    }
}
