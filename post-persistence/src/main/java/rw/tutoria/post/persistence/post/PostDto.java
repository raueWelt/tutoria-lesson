package rw.tutoria.post.persistence.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = PostDto.Attr.TABLE_NAME)
public class PostDto {
    @Id
    private long id;
    private long authorId;
    private Long parentId;
    private String title;
    private String metaTitle;
    private boolean published;
    private String content;

    public static class Attr {
        public static final String TABLE_NAME = "posts";
    }
}
