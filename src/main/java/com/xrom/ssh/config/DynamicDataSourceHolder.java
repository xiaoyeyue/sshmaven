package com.xrom.ssh.config;

/**
 * Description:
 * Date: 2019年01月26日10:26
 * Author: XiaoYeYue
 * Version: 1.0
 */
public class DynamicDataSourceHolder {

    // 线程本地环境
    private static final ThreadLocal contextHolder = new ThreadLocal();

    // 设置数据源类型
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    // 获取数据源类型
    public static String getDataSourceType() {
        return (String) contextHolder.get();
    }

    // 清除数据源类型
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

}
