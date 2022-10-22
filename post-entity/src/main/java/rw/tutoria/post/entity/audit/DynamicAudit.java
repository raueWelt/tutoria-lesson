package rw.tutoria.post.entity.audit;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DynamicAudit extends Audit {
    private long updatedBy;
    private Timestamp updatedAt;
}
