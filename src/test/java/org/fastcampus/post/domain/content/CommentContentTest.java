package org.fastcampus.post.domain.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CommentContentTest {

    @Test
    void givenContentLengthIsOk_whenCreateCommentContent_thenReturnTextContext() {
        // given
        String contentText = "this is a text content";

        // when
        CommentContent commentContent = new CommentContent(contentText);

        // then
        assertEquals(contentText, commentContent.getContentText());
    }

    @Test
    void givenContentLengthIsOver_whenCreateCommentContent_thenThrowError() {
        // givin
        String content = "a".repeat(101);

        // when, then
        assertThrows(IllegalArgumentException.class, () -> new CommentContent(content));
    }

    @ParameterizedTest
    @ValueSource(strings = {"뷁, 닭, 굵"})
    void givenContentLengthIsOverAndKorean_whenCreateCommentContent_thenThrowError(String koreanContent) {
        // given
        String content = koreanContent.repeat(101);

        // when, then
        assertThrows(IllegalArgumentException.class, () -> new CommentContent(content));
    }
}