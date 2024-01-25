package com.ton.estudo.authapi.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
