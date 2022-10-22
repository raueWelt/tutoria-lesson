package rw.tutoria.post.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjectUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    public static boolean isNull(Object o) {
        return o == null;
    }

    public static <R> boolean nullOrEmpty(Collection<R> value) {
        return isNull(value) || value.isEmpty();
    }

    public static boolean nullOrEmpty(String value) {
        return isNull(value) || value.isEmpty();
    }

    public static String toJsonString(Object o) throws JsonProcessingException {
        return MAPPER.writeValueAsString(o);
    }
}
