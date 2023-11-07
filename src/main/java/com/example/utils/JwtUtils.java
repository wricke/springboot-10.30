package com.example.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//
//import java.util.Date;
//import java.util.Map;
//
///**
// * Author:pric
// * Date:2023/6/10 8:33
// */
//public class JwtUtils {
//    private static String signKey="ithpc1";//密匙
//    private static Long expire = 43200000L;//密匙时间
//
//
//    public  static String setJwt (Map<String,Object> claims){
//        String jwt = Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS256,signKey)
//                .setExpiration(new Date(System.currentTimeMillis()+expire))
//                .compact();
//        System.out.println(jwt);
//        return jwt;
//    }
//
//    //解析
//    public static  Claims parseJwt(String jwt){
//        Claims claims = Jwts.parser()
//                .setSigningKey(signKey)
//                .parseClaimsJws(jwt)
//                .getBody();
//        return claims;
//    }
//}

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtils {

    private static String signKey = "ithpc";//指定签名密匙
    private static Long expire = 43200000L;

    /**
     * 生成JWT令牌
     *
     * @param claims JWT第二部分负载 payload 中存储的内容
     * @return
     */
    public static String generateJwt(Map<String, Object> claims) {
        String token = Jwts.builder()
                .addClaims(claims)
                .setSubject((String) claims.get("username"))
                .signWith(SignatureAlgorithm.HS256, signKey)
                .setExpiration(new Date(System.currentTimeMillis() + expire))
                .compact();
        return token;
    }

    /**
     * 解析JWT令牌
     *
     * @param token JWT令牌
     * @return JWT第二部分负载 payload 中存储的内容
     */
    public static Claims parseJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(token)
                .getBody();
        return claims;
    }
}