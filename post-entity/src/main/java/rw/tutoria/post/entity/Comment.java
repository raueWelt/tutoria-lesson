package rw.tutoria.post.entity;

import lombok.*;
import rw.tutoria.post.entity.audit.DynamicAudit;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends DynamicAudit {
    private long id;
    private long postId;
    private long authorId;
    private Long parentId;
    private boolean published;
    private String content;
}