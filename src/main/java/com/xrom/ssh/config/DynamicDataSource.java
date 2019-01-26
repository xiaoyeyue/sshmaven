package com.xrom.ssh.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * Description:
 * Date: 2019年01月26日10:20
 * Author: XiaoYeYue
 * Version: 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSourceType();
    }

}
