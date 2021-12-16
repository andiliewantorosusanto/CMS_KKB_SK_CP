package com.CMS.CentralParam.KKBSK.controller;

import java.util.Arrays;

import com.CMS.CentralParam.KKBSK.model.RESPON.ResponCekToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.client.RestTemplate;


public class Helper {
    
    @Autowired
    static RestTemplate restTemplate;

    public static void myMethod(UsernamePasswordAuthenticationToken ok) {
        // NOTE CEK TOKEN
        Object[] strObjects = ok.getAuthorities().toArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < strObjects.length; i++) {
            sb.append(strObjects[i]);
        }
        String token = sb.toString();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", token);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<ResponCekToken> respon = restTemplate
                .exchange(
				"http://localhost:9098/api/helper/cekToken", HttpMethod.POST, entity,
				ResponCekToken.class);
		System.out.println("hasil respon : " + respon.getBody().getCode());
		//NOTE END CEK TOKEN
		String code = respon.getBody().getCode();
		if(code == "0") {
            System.out.println("MASUK METHOD"); 
			System.out.println("Token Expired  ");
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		else {
            System.out.println("MASUK METHOD"); 
			System.out.println("Token NOT Expired ! ");
		}
	
	  }
}