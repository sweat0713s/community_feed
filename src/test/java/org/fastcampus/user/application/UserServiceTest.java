package org.fastcampus.user.application;

import org.fastcampus.fake.FakeObjectFactory;
import org.fastcampus.user.application.interfaces.UserRepository;
import org.fastcampus.user.application.interfaces.dto.CreateUserRequestDto;
import org.fastcampus.user.domain.User;
import org.fastcampus.user.domain.UserInfo;
import org.fastcampus.user.repository.FakeUserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    private final UserService userService = FakeObjectFactory.getUserService();

    @Test
    void givenUserInfoDto_whenCreateUser_thenCanFindUser() {
        // givin
        CreateUserRequestDto dto = new CreateUserRequestDto("test", "");

        // when
        User savedUser = userService.createUser(dto);

        // then
        User foundUser = userService.getUser(savedUser.getId());
        UserInfo userInfo = foundUser.getInfo();
        assertEquals(foundUser.getId(), savedUser.getId());
        assertEquals("test", userInfo.getName());
    }
}