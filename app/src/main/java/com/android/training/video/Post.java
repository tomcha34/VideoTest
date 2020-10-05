package com.android.training.video;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;


    private String title;

    @SerializedName("body")
    private String text;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }


    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
