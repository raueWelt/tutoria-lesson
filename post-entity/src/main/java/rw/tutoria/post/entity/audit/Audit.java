package rw.tutoria.post.entity.audit;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Audit {
    private long createdBy;
    private Timestamp createdAt;
}
