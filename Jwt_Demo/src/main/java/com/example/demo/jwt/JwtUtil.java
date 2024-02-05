package com.example.demo.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	
	private static final String SECRET_KEY = "Maulik";
//	** ---- Token validates here ---- **
	 
	public String extractUsername(String token) {
		System.err.println(token);
		return extractClaim(token, Claims::getSubject);
	}
 
	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}
 
	public <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		Claims claim = extractAllClaims(token);
		return claimResolver.apply(claim);
	}
 
	public Claims extractAllClaims(String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
 
	public boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}
 
	public boolean isTokenValid(String token, UserDetails userDetail) {
		String username = userDetail.getUsername();
		return (username.equals(extractUsername(token)) && !isTokenExpired(token));
	}
//  ** ---- Token generates here ---- **
 
	public String generateToken(String username) {
		Map<String, Object> obj = new HashMap<>();
		return createToken(obj, username);
	}
 
	private String createToken(Map<String, Object> obj, String username) {
		 Date now = new Date();
		    Date expiration = new Date(now.getTime() + 600_000); // Expiration time: 10 minutes from now

		    return Jwts.builder()
		    		.setSubject(username)
		            .setIssuedAt(now)
		            .setExpiration(expiration)
		            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
		            .compact();
	}

	

	
}
