```
一：项目引入依赖

二：分页、自定义系统异常、枚举类、Swagger2

三：项目编译(打jar包)，服务器部署

四：测试接口

五：Aop日志

六：Jmeter(服务器/镜像)

七：Jmeter 压测接口

八：项目权限

九：添加Redis

十：再次Jmeter接口压测
```



元数据 vs 增量数据：
mongo作为nosql，其扩展性明显好于mysql。所以在大数据量或者增量数据的存储下，可以考虑使用mongo来进行存储。可以简单地把数据分为元数据和增量数据。举个例子，比如创建一份问卷，那么问卷相关的数据比如说 创建用户id、问卷名称、题目等信息都是相对固定的，这些数据可以划分为元数据；而问卷的作答数据会随着用户作答不断增长，可以划分为增量数据。一般情况下，<u>**元数据倾向于存储在mysql，增量数据倾向于存储在mongo。**</u>



![image-20221210223918126](/Users/echo/Library/Application Support/typora-user-images/image-20221210223918126.png)

![image-20221210223949110](/Users/echo/Library/Application Support/typora-user-images/image-20221210223949110.png)

![image-20221210224212797](/Users/echo/Library/Application Support/typora-user-images/image-20221210224212797.png)