package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.ststicDTO.NewsDTO;
import com.ehealthpera.demo.Entity.staticEntity.News;

import java.util.List;

public interface NewsService {
    News postNews(NewsDTO newsDTO);

    List<News> getNews();
}
