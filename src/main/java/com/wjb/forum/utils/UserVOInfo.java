package com.wjb.forum.utils;

import com.wjb.forum.vo.UserVO;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;

/**
 * userVo info class, get login message
 */
public class UserVOInfo {
    /**
     * remember user operate time to check that need login again
     */
    private static long operateTime;

    public static String getUserName(){
        return getUSerVO().getUsername();
    }

    public static UserVO getUSerVO(){
        return (UserVO) SecurityUtils.getSubject().getPrincipal();
    }

    public static String getSex(){
        if (getUSerVO()==null|| "".equals(getUSerVO().getAvator()))
            return "unKnow";
        else
            return getUSerVO().getAvator().equals(0)?"girl":"boy";

    }

    public static long getOperateTime(){
        return operateTime;
    }

    public static void setOperateTime(long operateTime){
        UserVOInfo.operateTime = operateTime;
    }

    public static int getRoleId(){
        return getUSerVO().getRoleid();
    }

    public static int getUserId(){
        return getUSerVO().getId();
    }

    public static String getRoleTip(){
        return getUSerVO().getRoleTip();
    }

}
