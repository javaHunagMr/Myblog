package com.myblog.demo.utils;



import com.myblog.demo.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author 33904
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
