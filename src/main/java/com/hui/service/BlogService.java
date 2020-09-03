package com.hui.service;

import com.hui.po.Blog;
import com.hui.vo.BlogQuery;
import javafx.beans.binding.LongExpression;
import org.omg.CORBA.INTERNAL;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author hui
 * @date 2020/9/2 11:22
 * 概要：
 */
public interface BlogService {

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(String query, Pageable pageable);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId, Pageable pageable);


    List<Blog> listRecommendBlogTop(Integer size);

    Map<String, List<Blog>> archiveBlog();

    Long countBlog();


}
