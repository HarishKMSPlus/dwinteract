package splusDwInteract.controller;

import java.util.List;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/social")
public class FbSocialIntegration {
	
	private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public FbSocialIntegration(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

   
    
    @RequestMapping(value="/fb",method=RequestMethod.GET)
    public String helloFacebook(Model model) {
    	
    	
    	
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        List<Post> feed = facebook.feedOperations().getFeed();
      System.out.println("====================MPD===============");  
      for(Post post: feed){
    	System.out.println("------------>"+post.getDescription());
    }
//        List<User> friends=facebook.friendOperations().getFriendProfiles();
//        
//        for(User friend: friends){
//        	System.out.println("------------>"+friend.getFirstName());
//        }
//        
        model.addAttribute("feed", feed);
        return "hello";
    }


}
