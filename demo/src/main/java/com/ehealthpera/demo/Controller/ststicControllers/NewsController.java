package com.ehealthpera.demo.Controller.ststicControllers;

import com.ehealthpera.demo.Dto.ststicDTO.NewsDTO;
import com.ehealthpera.demo.Entity.staticEntity.News;
import com.ehealthpera.demo.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/news")
@CrossOrigin
public class NewsController {
    @Autowired
    private NewsService newsService;

    //create news
    @PutMapping("/post-news")
    public News postNews(NewsDTO newsDTO){
        return newsService.postNews(newsDTO);
    }

    //view news
    @GetMapping("show-news")
    public List<News> showNews(){
        return newsService.getNews();
    }

}
