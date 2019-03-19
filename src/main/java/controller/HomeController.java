package controller;

import model.Posts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model)
    {
        ArrayList<Posts> posts = new ArrayList<Posts>();

        Posts post1 = new Posts();
        post1.setTitle("Post 1");
        post1.setBody("Body 1");
        post1.setDate(new Date());

        Posts post2 = new Posts();
        post2.setBody("Body 2");
        post2.setTitle("Post 2");
        post2.setDate(new Date());

        Posts post3 = new Posts();
        post3.setDate(new Date());
        post3.setTitle("Post 3");
        post3.setBody("Body 3");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts", posts);

        return "index";
    }
}
