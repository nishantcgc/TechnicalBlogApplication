package upgrad_package.service;

import upgrad_package.model.Posts;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

        public PostService()
        {
                System.out.println("PostService class initialized");
        }

    public ArrayList<Posts> getAllPost()
    {

            ArrayList<Posts> postList = new ArrayList<>();

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

            postList.add(post1);
            postList.add(post2);
            postList.add(post3);

            return postList;

    }

        public ArrayList<Posts> getOnePost() {
                ArrayList<Posts> posts = new ArrayList<>();

                Posts post1 = new Posts();
                post1.setTitle("This is your Post");
                post1.setBody("This is your Post. It has some valid content");
                post1.setDate(new Date());
                posts.add(post1);

                return posts;

        }
}
