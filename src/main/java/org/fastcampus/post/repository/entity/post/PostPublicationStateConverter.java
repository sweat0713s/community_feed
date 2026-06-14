package org.fastcampus.post.repository.entity.post;

import jakarta.persistence.AttributeConverter;
import org.fastcampus.post.domain.content.PostPublicationState;

public class PostPublicationStateConverter implements AttributeConverter<PostPublicationState, String> {
    @Override
    public String convertToDatabaseColumn(PostPublicationState attribute) {
        return attribute.name();
    }

    @Override
    public PostPublicationState convertToEntityAttribute(String s) {
        return PostPublicationState.valueOf(s);
    }
}
