package rw.tutoria.post.client;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UrlConstant {
    public static final String API = "/api";
    public static final String PING = "/ping";
    public static final String POST = "/post";
    public static final String API_POST = API + POST;
    public static final String SAVE = "/save";
}

