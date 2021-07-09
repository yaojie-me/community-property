package link.lyhp.common.wechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 获取 access_token 接口的返回格式
 *
 * @author yaojie
 */
@Data
public class AccessTokenObject {


    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private int expiresIn;

    private int errcode;

    private String errmsg;
}
