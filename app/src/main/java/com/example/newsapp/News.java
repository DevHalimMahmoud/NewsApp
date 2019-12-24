package com.example.newsapp;

public class News {


    private String webTitle;


    private String webPublicationDate;

    private String sectionName;



    private String webUrl;



    public News(String webTitle, String webPublicationDate, String sectionName ,String webUrl) {
        this.webTitle = webTitle;
        this.webPublicationDate = webPublicationDate;
        this.sectionName =sectionName;
        this.webUrl = webUrl;
    }


    public String getWebTitle() {
        return webTitle;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebUrl() {
        return webUrl;
    }
}