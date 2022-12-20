package com.reggie.common;

/**
 * Author:WJ
 * Date:2022/11/12 17:46
 * Description:<>
 */
public class BaseContext {
    private  static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置用户id到线程中
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 从线程中读取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
