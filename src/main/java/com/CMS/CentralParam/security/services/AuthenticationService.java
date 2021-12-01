package com.CMS.CentralParam.security.services;

import com.CMS.CentralParam.KKBSK.model.LDAP.Credentials;
import com.CMS.CentralParam.KKBSK.model.LDAP.CustomerAuthority;
import com.CMS.CentralParam.KKBSK.model.LDAP.Example;
import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;

@Service
public class AuthenticationService implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        /*Please use email:  adamo@cdsw.com.au   password:  test*/
        String UserId = authentication.getName();
        String Password = authentication.getCredentials().toString();
        Credentials creden = new Credentials(UserId,Password);
        Example user = new Example(creden);
        System.out.println(user);
       ResponLoginBE customer = null;
        try {

            // request url
// String url = "http://192.168.29.71:12103/EnterpriseAuthentication/AuthenticateUserV2/";
String url2 = "http://147.139.171.241:443/api/login";
String url = "http://localhost:9098/api/login/LDAP/";
//String url = "http://10.4.198.79:10203/EnterpriseAuthentication/AuthenticateUserV2";

// create an instance of RestTemplate
RestTemplate restTemplate = new RestTemplate();

// create headers
HttpHeaders headers = new HttpHeaders();
headers.setContentType(MediaType.APPLICATION_JSON);
headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

// add basic authentication
// headers.setBasicAuth("bcafapps", "Admin123");
// headers.add("Authorization", "Basic YmNhZmFwcHM6QWRtaW4xMjM=");

//wrap
ObjectMapper objectMapper = new ObjectMapper();
String userString = objectMapper.writeValueAsString(user);
System.out.println("ini");
System.out.println(userString);


// send POST request
HttpEntity<String> entity = new HttpEntity(userString, headers);
ResponseEntity<ResponLoginBE> respon = restTemplate.postForEntity(url, entity,
ResponLoginBE.class);
        //System.out.println(respon.getBody().getResponseHeader().getErrorDescription());
         //NOTE PROSES TAMPIL HASIL OCR

        //  System.out.println(customer);

    //wrap
    // List<UserSHF> userrs = userSHFRepository.findAll();
    // String usershff = objectMapper.writeValueAsString(userrs);
    // System.out.println(userString);
    // System.out.println(usershff);
    //wrap
    System.out.println("TOKEN :" + respon.getBody().getLogin().getToken());
if (respon.getBody().getLogin().getSucceed().equals("Berhasil Login") ) {

    System.out.println("Login Successful");
    try {
        System.out.println("NIP : "+UserId);
    } catch (Exception e) {
        System.out.println("NIP : "+UserId);
    }
 
    
    customer = respon.getBody();
    
} else {
    System.out.println("Login Failed");
    System.out.println("NIP : "+UserId);
    
}
            // HttpHeaders headers = new HttpHeaders();
            // headers.set("Content-Type", "application/json");
            // headers.add("Authorization", "Basic YmNhZmFwcHM6QWRtaW4xMjM=");
            // headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            // headers.setContentType(MediaType.APPLICATION_JSON);
            // HttpEntity request = new HttpEntity(headers);
            // customer = new RestTemplate().postForEntity("http://192.168.29.71:12103/EnterpriseAuthentication/AuthenticateUserV2/",
            // user, CustomerAuthority.class,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Customer customer = new RestTemplate().postForObject("http://admin.parki.com.au/api/customer/authenticate", user, Customer.class);

        try { //for test
            System.out.println("customer logged in " + new ObjectMapper().writeValueAsString(customer));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }// remove it for production ! :)

        if (customer != null) {
            String token = "ok";
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new CustomerGrantAuthority(customer));
            grantedAuthorities.add(new SimpleGrantedAuthority(customer.getLogin().getToken()));
            
            //System.out.println("ININININIII : "+customer.getUserInfo().getUserId());
            return new UsernamePasswordAuthenticationToken(UserId, Password, grantedAuthorities);
        }
        throw new AuthenticationServiceException("Invalid credentials.");

    }

//    public MultiValueMap<String, String> createRequest(String username, String password) {
//        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
//        request.add("username", username);
//        request.add("password", password);
//        return request;
//    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
