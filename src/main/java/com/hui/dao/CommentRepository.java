package com.hui.dao;

import com.hui.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author hui
 * @date 2020/9/3 9:40
 * 概要：
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
