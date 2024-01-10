package com.edw.service;

import net.bull.javamelody.Stopwatch;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * <pre>
 *     com.edw.service.RestService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jan 2024 14:12
 */
public class RestService {
    public void callRestAPIOne() {
        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-one-todo")) {
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                        .GET().build();
                System.out.println(HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void callRestAPITwo() {
        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-users")) {
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/users"))
                        .GET().build();
                System.out.println(HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void callRestAPIThree() {
        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-posts")) {
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                        .GET().build();
                System.out.println(HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}