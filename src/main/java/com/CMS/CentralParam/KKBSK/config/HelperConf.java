package com.CMS.CentralParam.KKBSK.config;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class HelperConf {
  public static HttpEntity<String> getHeader(UsernamePasswordAuthenticationToken ok) {
    String token = getToken(ok);
    
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.add("Authorization", token);
    HttpEntity<String> entity = new HttpEntity<String>(headers);

    return entity;
  }

  static String getToken(UsernamePasswordAuthenticationToken ok) {
    Object[] strObjects = ok.getAuthorities().toArray();
    StringBuffer sb = new StringBuffer();
    for (int i = 1; i < strObjects.length; i++) {
      sb.append(strObjects[i]);
    }
    String token = sb.toString();
    return token;
  }
}