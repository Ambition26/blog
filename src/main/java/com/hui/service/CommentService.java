package com.hui.service;

import com.hui.po.Comment;

import java.util.List;

/**
 * @author hui
 * @date 2020/9/3 9:38
 * 概要：
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);

}
