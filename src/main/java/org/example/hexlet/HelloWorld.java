package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/users/{id}/post/{postId}", ctx -> {
            var postId = ctx.pathParam("postId");
            var id = ctx.pathParam("id");
            ctx.result("Id = " + id + " and Post Id = " + postId);
        });

        app.start(7070);
    }
}
