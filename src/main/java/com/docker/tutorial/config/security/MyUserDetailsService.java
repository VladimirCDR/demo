package com.docker.tutorial.config.security;

import com.docker.tutorial.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Class that handles authentication.
 * It is used by Spring Security in order to fetch the credentials from DB using JPA
 */
@Service
@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return user.map(MyUserDetails::new).get();
    }
}
