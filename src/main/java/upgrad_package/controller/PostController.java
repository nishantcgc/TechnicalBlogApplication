package upgrad_package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import upgrad_package.model.Posts;
import upgrad_package.service.PostService;


import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model) {
        ArrayList<Posts> posts = postService.getOnePost();
        model.addAttribute("posts", posts);
        return "posts";
    }

}
