package tda.darkarmy.onlinecrimereportingportal.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tda.darkarmy.onlinecrimereportingportal.model.User;
import tda.darkarmy.onlinecrimereportingportal.repository.UserRepository;


@Service
public class UserPrincipalDetailsService implements UserDetailsService{

    private UserRepository userRepository;


    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(userName);
        return new UserPrincipal(user);
    }
    
}
