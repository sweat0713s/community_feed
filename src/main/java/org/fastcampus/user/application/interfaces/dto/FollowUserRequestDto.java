package org.fastcampus.user.application.interfaces.dto;

public record FollowUserRequestDto(Long userId, Long targetUserId) {
}
