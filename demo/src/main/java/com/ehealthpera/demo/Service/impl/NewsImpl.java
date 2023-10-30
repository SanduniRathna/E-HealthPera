package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.ststicDTO.NewsDTO;
import com.ehealthpera.demo.Entity.staticEntity.News;
import com.ehealthpera.demo.Repository.NewsRepo;
import com.ehealthpera.demo.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class NewsImpl implements NewsService {
    @Autowired
    private NewsRepo newsRepo;

    //create a news
    public News postNews(NewsDTO newsDTO){
        News news1=new News();

        news1.setTitle(newsDTO.getTitle());
        news1.setDescription(newsDTO.getDescription());

        //create current date and time
        news1.setCreateDate(LocalDate.now());
        news1.setCreateTime(LocalDateTime.now());

        newsRepo.save(news1);
        return news1;
    }

    //get news
    public List<News> getNews(){
        return newsRepo.findAllByOrderByCreateDateDesc();
    }
}
