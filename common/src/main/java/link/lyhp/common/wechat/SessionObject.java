package link.lyhp.common.wechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 获取用户 session 接口的返回格式
 *
 * @author yaojie
 */
@Data
public class SessionObject {

    private String openid;

    @JsonProperty("session_key")
    private String sessionKey;

    @JsonProperty("unionid")
    private String unionId;

    private int errcode;

    private String errmsg;
}
