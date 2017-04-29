/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.spring.boot.autoconfigure;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.ISqlInjector;
import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import com.baomidou.mybatisplus.toolkit.StringUtils;

/**
 * <p>
 * Mybatis全局缓存
 * </p>
 *
 * @author Caratacus
 * @since 2017-05-01
 */
public class GlobalConfig {

    // 数据库类型
    private String dbType;
    // 主键类型
    private Integer idType;
    // 表名、字段名、是否使用下划线命名
    private Boolean dbColumnUnderline;
    // SQL注入器
    private String sqlInjector;
    // 元对象字段填充控制器
    private String metaObjectHandler;
    // 字段验证策略
    private Integer fieldStrategy;
    // 是否刷新mapper
    private Boolean isRefresh;
    // 是否自动获取DBType
    private Boolean isAutoSetDbType;
    // 是否大写命名
    private Boolean isCapitalMode;
    // 标识符
    private String identifierQuote;

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public Boolean getDbColumnUnderline() {
        return dbColumnUnderline;
    }

    public void setDbColumnUnderline(Boolean dbColumnUnderline) {
        this.dbColumnUnderline = dbColumnUnderline;
    }

    public String getSqlInjector() {
        return sqlInjector;
    }

    public void setSqlInjector(String sqlInjector) {
        this.sqlInjector = sqlInjector;
    }

    public String getMetaObjectHandler() {
        return metaObjectHandler;
    }

    public void setMetaObjectHandler(String metaObjectHandler) {
        this.metaObjectHandler = metaObjectHandler;
    }

    public Integer getFieldStrategy() {
        return fieldStrategy;
    }

    public void setFieldStrategy(Integer fieldStrategy) {
        this.fieldStrategy = fieldStrategy;
    }

    public Boolean getRefresh() {
        return isRefresh;
    }

    public void setRefresh(Boolean refresh) {
        isRefresh = refresh;
    }

    public Boolean getAutoSetDbType() {
        return isAutoSetDbType;
    }

    public void setAutoSetDbType(Boolean autoSetDbType) {
        isAutoSetDbType = autoSetDbType;
    }

    public Boolean getCapitalMode() {
        return isCapitalMode;
    }

    public void setCapitalMode(Boolean capitalMode) {
        isCapitalMode = capitalMode;
    }

    public String getIdentifierQuote() {
        return identifierQuote;
    }

    public void setIdentifierQuote(String identifierQuote) {
        this.identifierQuote = identifierQuote;
    }


    public GlobalConfiguration convertGlobalConfiguration() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        if (StringUtils.isNotEmpty(this.getDbType())) {
            globalConfiguration.setDbType(this.getDbType());
        }
        if (StringUtils.isNotEmpty(this.getIdentifierQuote())) {
            globalConfiguration.setIdentifierQuote(this.getIdentifierQuote());
        }

        if (StringUtils.isNotEmpty(this.getSqlInjector())) {
            globalConfiguration.setSqlInjector((ISqlInjector) Class.forName(this.getSqlInjector()).newInstance());
        }

        if (StringUtils.isNotEmpty(this.getMetaObjectHandler())) {
            globalConfiguration.setMetaObjectHandler((MetaObjectHandler) Class.forName(this.getMetaObjectHandler()).newInstance());
        }

        if (StringUtils.checkValNotNull(this.getIdType())) {
            globalConfiguration.setIdType(this.getIdType());
        }
        if (StringUtils.checkValNotNull(this.getDbColumnUnderline())) {
            globalConfiguration.setDbColumnUnderline(this.getDbColumnUnderline());
        }
        if (StringUtils.checkValNotNull(this.getFieldStrategy())) {
            globalConfiguration.setFieldStrategy(this.getFieldStrategy());
        }
        if (StringUtils.checkValNotNull(this.getRefresh())) {
            globalConfiguration.setRefresh(this.getRefresh());
        }
        if (StringUtils.checkValNotNull(this.getAutoSetDbType())) {
            globalConfiguration.setAutoSetDbType(this.getAutoSetDbType());
        }
        if (StringUtils.checkValNotNull(this.getCapitalMode())) {
            globalConfiguration.setCapitalMode(this.getCapitalMode());
        }

        return globalConfiguration;


    }


}
