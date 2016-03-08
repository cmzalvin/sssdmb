package com.zyj.website.manage.service;

import com.zyj.website.dao.CategoryMapper;
import com.zyj.website.model.Category;
import com.zyj.website.model.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 栏目管理
 * @author ZhangYJ
 */
@Service
public class CategoryService {

    @Autowired CategoryMapper categoryMapper;

    public List<Category> getCategorys(){

        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    public Category getCategoryById(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    public void save(Category category) {
        category.setCreatedDate(new Date());
        category.setShowType("normal");
        categoryMapper.insertSelective(category);
    }
}
