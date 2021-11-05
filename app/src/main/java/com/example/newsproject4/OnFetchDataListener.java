package com.example.newsproject4;

import com.example.newsproject4.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List <NewsHeadlines> list, String messege);
    void onError(String messege);
}
