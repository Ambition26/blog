package com.hui.web;

import com.hui.po.Comment;
import com.hui.po.User;
import com.hui.service.BlogService;
import com.hui.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @author hui
 * @date 2020/9/3 9:34
 * 概要：
 */
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private BlogService blogService;

    @Value("${comment.avatar}")
    private String avatar;

    @GetMapping("/comments/{blogId}")
    public String commens(@PathVariable Long blogId, Model model) {
        model.addAttribute("comments", commentService.listCommentByBlogId(blogId));
        return "blog :: commentList";
    }

    @PostMapping("/comments")
    public String post(Comment comment, HttpSession session) {

        User user = (User) session.getAttribute("user");

        Long blogId = comment.getBlog().getId();
        comment.setBlog(blogService.getBlog(blogId));

        if (user != null) {
            comment.setAvatar(user.getAvatar());
            comment.setAdminComment(true);
//            comment.setNickname(user.getNickname());
        } else {
            comment.setAvatar(avatar);
        }

        commentService.saveComment(comment);
        return "redirect:/comments/" + blogId;
    }

}
