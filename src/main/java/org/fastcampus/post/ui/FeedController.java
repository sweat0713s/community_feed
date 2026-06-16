package org.fastcampus.post.ui;

import lombok.RequiredArgsConstructor;
import org.fastcampus.common.principal.AuthPrincipal;
import org.fastcampus.common.principal.UserPrincipal;
import org.fastcampus.common.ui.Response;
import org.fastcampus.post.repository.post_queue.UserPostQueueQueryRepository;
import org.fastcampus.post.ui.dto.GetPostContentResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {

    private final UserPostQueueQueryRepository queueQueryRepository;

    @GetMapping("")
    public Response<List<GetPostContentResponseDto>> getPostFeed(@AuthPrincipal UserPrincipal userPrincipal, Long lastPostId) {
        List<GetPostContentResponseDto> result =  queueQueryRepository.getContentResponse(userPrincipal.getUserId(), lastPostId);
        return Response.ok(result);
    }
}
