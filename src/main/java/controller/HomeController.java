package controller;

import upgrad_package.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import upgrad_package.service.PostService;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model)
    {
        ArrayList<Posts> postList = postService.getAllPost();
        System.out.println("Foudd......."+postList);
        model.addAttribute("postList", postList);

        Posts spost = new Posts();
        spost.setBody("Single Body");

        model.addAttribute("spost", spost);

        return "index";
    }
}
