package com.edw.service;

import net.bull.javamelody.Stopwatch;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 * <pre>
 *     com.edw.service.Sleep
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Jan 2024 14:52
 */
public class Sleep {

    public void randomPause() {
        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-one-todo")) {
            // do some lengthy process
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                        .GET().build();
                System.out.println(HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-users")) {
            // do some lengthy process
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jsonplaceholder.typicode.com/users"))
                        .GET().build();
                System.out.println(HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        try (Stopwatch stopwatch = new Stopwatch("stopwatch-for-posts")) {
            // do some lengthy process
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
