//package com.nextsquad.house.service;
//
//import com.nextsquad.house.domain.Article;
//import org.springframework.cache.Cache;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CachingArticlesService implements ArticlesService {
//
//    public CachingArticlesService(ArticlesRepository articlesRepository, CacheManager cacheManager) {
//        this.articlesRepository = articlesRepository;
//        this.cacheManager = cacheManager;
//    }
//
//    private final ArticlesRepository articlesRepository;
//    private final CacheManager cacheManager;
//
//    @Override
//    @Cacheable(value = "articles", key = "#articleId")
//    public Article getArticle(Long articleId) {
//        return articlesRepository.get(articleId);
//    }
//
//    @Override
//    @CacheEvict(value = "articles", key = "#articleId")
//    public void removeArticle(Long articleId) {
//        articlesRepository.remove(articleId);
//    }
//
//    @Override
//    public void saveArticle(Article article) {
//        articlesRepository.save(article);
//    }
//
//    @Override
//    @CachePut(value = "articles", key = "#articleId")
//    public Article updateLikes(Long articleId, int likes) {
//        return articlesRepository.updateLikes(articleId, likes);
//    }
//}
