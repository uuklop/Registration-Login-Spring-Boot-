package com.jamespolk.backendtutorials.auth;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

@Getter
@Setter
@Builder
public class AuthenticateResponse {
    private String token;
}
