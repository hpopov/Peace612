package ua.com.kl.cmathtutor.itcapp.service.simple;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import ua.com.kl.cmathtutor.itcapp.model.UserProfile;
import ua.com.kl.cmathtutor.itcapp.service.UserProfileService;

@Service
public class SimpleUserProfileService implements UserProfileService {

//    private Map<String, UserProfile> userProfiles;

//    @Autowired
//    private UserService userService;

    @PostConstruct
    private void init() {
//	List<User> users = userService.getAllUsers();
//	userProfiles = new HashMap<>();
//	Iterator<User> usersIt = users.iterator();
//	User user1 = usersIt.next();
	Map<String, String> skills = new HashMap<>();
	skills.put("Paint", "Perfect");
	// TODO
    }

    @Override
    public UserProfile getUserProfileByLogin(String login) {
	return null;
    }

    @Override
    public javafx.concurrent.Service<UserProfile> getUserProfileByLoginService(String login) {
	return null;
    }
}
