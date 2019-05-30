该项目主要是spring boot 整合mybatis，多数据源配置。
注意事项：
    1.每个数据源的dao不能在同一个包下，dao接口需要隔离开。
    2.getResource(url)必须写死，不能用通配符。
