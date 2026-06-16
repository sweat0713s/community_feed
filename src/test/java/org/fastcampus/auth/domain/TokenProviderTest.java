package org.fastcampus.auth.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenProviderTest {

    private final String secretKey = "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest";
    private final TokenProvider tokenProvider = new TokenProvider(secretKey);

    @Test
    void givenValidUserAndRole_whenCreateToken_thenReturnValidToken() {
        // given
        Long userId = 1L;
        String role = "ADMIN";

        // when
        String token = tokenProvider.createToken(userId, role);

        // then
        assertNotNull(token);
        assertEquals(userId, tokenProvider.getUserId(token));
        assertEquals(role, tokenProvider.getUserRole(token));
    }

    @Test
    void givenInvalidToken_whenGetGetUserId_thenThrowError() {
        // givin
        String invalidToken = "invalidToken";

        // then
        assertThrows(Exception.class, () -> tokenProvider.getUserId(invalidToken));
    }
}
