package rw.tutoria.post.entity;

import lombok.*;
import rw.tutoria.post.entity.audit.DynamicAudit;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post extends DynamicAudit {
    private long id;
    private long authorId;
    private long parentId;
    private String title;
    private String metaTitle;
    private boolean published;
    private String content;
}
