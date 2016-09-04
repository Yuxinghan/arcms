package com.suniusoft.security.biz.domain.defined.permission;

import com.suniusoft.security.biz.domain.generation.permission.SecurityUser;
import lombok.Data;

/**
 *   
 *  @ProjectName: arcms 
 *  @Description: <p>
 * </p>
 *  @author yuyuchi  yuyc@suniusoft.com
 *  @date 2015/11/2  
 */

@Data
public class UserDO extends SecurityUser {

    private Long roleId;

    private String roleName;

    private String vipLevel;

    private String recommendName;

}
