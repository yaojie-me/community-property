package link.lyhp.common.wechat;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * 微信接口工具类
 *
 * @author yaojie
 */
public class WechatUtil {

    private static final String APP_ID = "wxf7e1d476d576d115";

    private static final String APP_SECRET = "c800a4be8f971c4eef3d35d8778911d6";

    private static final String SESSION_URL_FORMAT = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";

    private static final String ACCESS_TOKEN_URL_FORMAT = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

    public Mono<SessionObject> getSessionByJsCode(String jsCode) {
        String url = String.format(SESSION_URL_FORMAT, APP_ID, APP_SECRET, jsCode);
        return WebClient.create(url).get().retrieve().bodyToMono(SessionObject.class);
    }

    private Mono<AccessTokenObject> getAccessToken(String jsCode) {
        String url = String.format(ACCESS_TOKEN_URL_FORMAT, APP_ID, APP_SECRET);
        return WebClient.create(url).get().retrieve().bodyToMono(AccessTokenObject.class);
    }
}
