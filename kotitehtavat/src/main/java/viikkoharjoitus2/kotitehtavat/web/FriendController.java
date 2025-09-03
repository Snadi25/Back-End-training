package viikkoharjoitus2.kotitehtavat.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import viikkoharjoitus2.kotitehtavat.domain.Friend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FriendController {

    private static List<Friend> friends = new ArrayList<>();

    static {
        friends.add(new Friend("Aku", "Ankka"));
        friends.add(new Friend("Iines", "Ankka"));
        friends.add(new Friend("Hannu", "Hanhi"));
    }

    @GetMapping("/friends")
    public String showFriends(Model model) {
        model.addAttribute("friends", friends);
        model.addAttribute("friend", new Friend());
        return "friendsPage";
    }

    @PostMapping("/saveFriend")
    public String saveFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/friends";
    }

}
