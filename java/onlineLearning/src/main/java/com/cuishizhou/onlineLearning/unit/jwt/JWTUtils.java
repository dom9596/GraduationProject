package com.cuishizhou.onlineLearning.unit.jwt;

import com.google.gson.Gson;
import io.jsonwebtoken.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    /**
     * 后期可用随机生成加密的唯一的KEy
     */
    private static final String KEY = "gsg/ger2345ygdfgszf2=r34#gdg^dgfg";

    /**
     * 前三个参数为自己用户token的一些信息比如id，权限，名称等。不要将隐私信息放入（大家都可以获取到）
     *
     * @param map
     * @return
     */
    public static String createJWT(Map<String, Object> map) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                .setPayload(new Gson().toJson(map))
                .signWith(signatureAlgorithm, JWTUtils.KEY.getBytes()); //估计是第三段密钥
        //生成JWT
        return builder.compact();
    }

    /**
     * 解密
     *
     * @param jsonWebToken
     * @return
     */
    public static Claims parseJWT(String jsonWebToken) {
        try {
            Claims claims = Jwts.parser().setSigningKey(JWTUtils.KEY.getBytes()).parseClaimsJws(jsonWebToken).getBody();
            return claims;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Token合法性校验
     *
     * @param token
     * @return
     */
    public static JWTResult checkToken(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey(JWTUtils.KEY.getBytes()).parseClaimsJws(token).getBody();
            String userCode = claims.get("userCode", String.class);
            return new JWTResult(true, userCode, "合法请求", ResponseCodeConstant.SUCCESS_CODE);
        } catch (ExpiredJwtException e) {
            // 在解析JWT字符串时，如果‘过期时间字段’已经早于当前时间，将会抛出ExpiredJwtException异常，说明本次请求已经失效
            return new JWTResult(false, null, "token已过期", ResponseCodeConstant.TOKEN_TIMEOUT_CODE);
        } catch (SignatureException e) {
            // 在解析JWT字符串时，如果密钥不正确，将会解析失败，抛出SignatureException异常，说明该JWT字符串是伪造的
            return new JWTResult(false, null, "非法请求", ResponseCodeConstant.NO_AUTH_CODE);
        } catch (Exception e) {
            return new JWTResult(false, null, "非法请求", ResponseCodeConstant.NO_AUTH_CODE);
        }
    }

    @Test
//    public void test() {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("province", "898765");
        map.put("city", "中国");
        // map.put("timestamp", new Date().getTime());
        //密钥
        String token = JWTUtils.createJWT(map);
        System.out.println("JWT加密的结果：" + token);
        System.out.println("JWT解密的结果：" + parseJWT(token));
        Claims a = parseJWT(token);
        String astring = a.get("city", String.class);
        System.out.println(astring);
        JWTResult jwtResult = JWTUtils.checkToken(token);
        System.out.println(jwtResult.toString());
    }

}
