// package com.bcaf.bootcamp.security;

// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.Arrays;

// import javax.jws.soap.SOAPBinding.Use;
// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.apache.catalina.core.ApplicationContext;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.core.authority.AuthorityUtils;
// import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.google.gson.Gson;
// import com.google.gson.internal.LinkedTreeMap;
// import com.bcaf.bootcamp.model.userlogin.User;
// import com.bcaf.bootcamp.repository.UserRepository;
// import com.bcaf.bootcamp.security.model.AccountCredentials;
// import com.bcaf.bootcamp.security.services.AuthenticationService;



// public class LoginFilter extends AbstractAuthenticationProcessingFilter {
//     private UserRepository repository;
//     public LoginFilter(final String url, final AuthenticationManager authManager, org.springframework.context.ApplicationContext context) {
    
//     super(new AntPathRequestMatcher(url));
//     setAuthenticationManager(authManager);
//     logger.info("onLoginFilter");
//     this.repository = context.getBean(UserRepository.class);
//     }

//     @Override
//     public Authentication attemptAuthentication(final HttpServletRequest req, final HttpServletResponse res)
//             throws IOException, ServletException {
//         final AccountCredentials creds = new ObjectMapper().readValue(req.getInputStream(), AccountCredentials.class);
//         logger.info("attemptAuthentication");

//         Authentication authentication = null;
//         try {
//             authentication = getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(
//                     creds.getUsername(), creds.getPassword(), Collections.emptyList()));
//         } catch (final AuthenticationException e) {
//             logger.info("User not found");
//             // if user not found then send message succeed :false
//             Map map = new HashMap();
//             map.put("succeed", "Gagal Login");

//             String authString = new Gson().toJson(map);

//             PrintWriter out = res.getWriter();
//             res.setContentType("application/json");
//             res.setCharacterEncoding("UTF-8");
//             out.print(authString);
//             out.flush();
//         }
//         return authentication;

//     }

//     @Override
//     protected void successfulAuthentication(final HttpServletRequest req, final HttpServletResponse res, final FilterChain chain,
//             final Authentication auth) throws IOException, ServletException {
//         logger.info("successfulAuthentication");
//         logger.info(auth);
//         Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
//                 String hasil=roles.toString().replace("[","").replace("]", "");
//         // AuthenticationService.addToken(res, auth.getName());
//         // add these information below, when user found        
//         Map map = new HashMap(); 
//         //map.put("profile", auth);
        
//         String email = auth.getName();
//         User user = repository.findByEmail(email);

//         map.put("id", user.getId());
//         map.put("firstName", user.getFirstName());
//         map.put("lastName", user.getLastName());
//         map.put("username", auth.getName());
//         map.put("role", hasil);
//         map.put("token", AuthenticationService.addToken(auth.getName()));
//         map.put("succeed", "Berhasil Login");
        
//         String authString = new Gson().toJson(map);
  
        
//         PrintWriter out = res.getWriter();
//         res.setContentType("application/json");
//         res.setCharacterEncoding("UTF-8");
//         out.print(authString);
//         out.flush(); 

//     }
// }