package com.zyj.website.manage.service;

import com.zyj.website.dao.ArticleMapper;
import com.zyj.website.model.Article;
import com.zyj.website.model.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章管理
 * @author ZhangYJ
 */
@Service
public class ArticaleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> getArticales(){

        ArticleExample example = new ArticleExample();
        return articleMapper.selectByExample(example);
    }

    public Article getArticale(Integer id){
        if(id != null) {
            return articleMapper.selectByPrimaryKey(id);
        }
        return new Article();
    }

    public void save(Article article) {
        articleMapper.insertSelective(article);
    }
}
