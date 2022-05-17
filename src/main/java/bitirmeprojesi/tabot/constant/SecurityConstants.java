package bitirmeprojesi.tabot.constant;

public class SecurityConstants {
    public static final String SIGN_UP_URL = "/api/users/save-user";
    public static final String SECRET = "teachingassistantbotsecret";
    public static final long EXPIRATION_TIME = 84600000; // 1 gün
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
