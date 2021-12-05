package com.CMS.CentralParam.KKBSK.config;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;

public class HelperConf {
  public static HttpEntity<String> getHeader() {
    String token = getToken();
    
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.add("Authorization", token);
    HttpEntity<String> entity = new HttpEntity<String>(headers);

    return entity;
  }

  public static HttpEntity<String> getHeader(String body) {
    String token = getToken();
    
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.add("Authorization", token);
    HttpEntity<String> entity = new HttpEntity<String>(body,headers);

    return entity;
  }

  public static String getAction(boolean isInput,String action) {
    if(isInput){
      System.out.println(action);
      if(action == "submit") {
        return "inputAndSubmit";
      } else {
        return "input";
      }
    } else {
      if(action == "submit") {
        return "editAndSubmit";
      } else {
        return "edit";
      }
    }
  }

  static String getToken() {

    Object[] strObjects = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray();
    StringBuffer sb = new StringBuffer();
    for (int i = 1; i < strObjects.length; i++) {
      sb.append(strObjects[i]);
    }
    String token = sb.toString();
    return token;
  }
}