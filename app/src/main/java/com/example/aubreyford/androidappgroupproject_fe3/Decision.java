package com.example.aubreyford.androidappgroupproject_fe3;

/**
 * Created by HomeMariaHome on 3/17/16.
 */

/**
 * Created by HomeMariaHome on 3/17/16.
 */
public class Decision {
    private int id;
    private int user_id;
    private String title;
    private String category;
    private String picA;
    private String picB;


    public Decision(int id, int user_id, String title, String category, String photoURLA, String photoURLB) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.category = category;
        this.picA = picA;
        this.picB = picB;
    }


//    private Photo photos[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicA() {
        return picA;
    }

    public void setPicA(String picA) {
        this.title = picA;
    }

    public String getPicB() {
        return picB;
    }

    public void setPicB(String picB) {
        this.category = picB;
    }

}