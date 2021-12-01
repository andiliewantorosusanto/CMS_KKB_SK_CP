// package com.CMS.CentralParam.security.services;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.authority.AuthorityUtils;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;


// @Service
// public class UserDetailServiceImpl implements UserDetailsService {
//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//         User currentUser = userRepository.findByEmail(email);
//         System.out.println("current user : " + currentUser);
//         /* UserDetails user = new org.springframework.security.core.userdetails.User(email, currentUser.getPassword(),
//                 true, true, true, true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
//         System.out.println("user : " + user);
//         return user; */

//         return new org.springframework.security.core.userdetails.User(currentUser.getEmail(), currentUser.getPassword(),
//                 mapRolesToAuthorities(currentUser.getRoles()));
//     }

//     private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//         return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//     }

// }