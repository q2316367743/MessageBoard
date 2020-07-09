# 留言板项目

本项目启发自哔哩哔哩视频[完成一个项目为什么需要这么多技术点，项目是怎么一步步变复杂的，练手项目和真实项目区别为什么这么大](https://www.bilibili.com/video/BV1dC4y187i8)

## 软件计划

普通留言板

需要登录的留言板

可以评论的留言板

可以相互评论的留言板

可以搜索标题的留言板

## 软件安装

## 开发步骤

1. - [x] 纯静态项目
2. - [x] 视觉优化，引入layui，jquery
3. - [x] 显示其他人的留言，thymeleaf
4. - [x] 前端引入vue.js实现前后端分离
5. - [x] 后端引入Swagger实现接口文档
6. - [ ] 前端引入axios实现网络请求
7. ~~前端引入wabpack进行打包和构建~~
8. ~~前端引入node.js~~
9. - [x] 了解一些设计模式
10. ~~使用python进行自动化测试~~
11. ~~考虑到SEO，前端~~
    1. ~~引入Nuxt.js来实现服务端渲染~~
    2. ~~使用Phantom.js拦截爬虫~~
12. ~~使用echart.js实现留言数据可视化~~
13. ~~后端引入easyexcel导出Excel数据~~
14. ~~后端引入PDFBox导出PDF数据~~
15. 给项目引入CI&CD持续集成与持续部署
16. 使用Docker进行部署
17. 使用Sonar检查代码
18. 使用Jenkins来持续集成
19. 使用k8s来完成服务编排
20. 使用uniapp进行小程序端开发
21. 使用Redis来缓存数据，缓解数据库压力
22. 数据库实现分库分表，读写分离
23. 前端使用vuex和localStorage将数据缓存在浏览器中
24. 为了防止用户乱点和爬虫
    1. 前端使用防抖和节流来控制用户操作
    2. 后端通过Redis来限制用户操作频率
    3. 通过nginx限制用户ip访问
25. 为了监测系统和用户操作，使用sentry来搭建前端监控服务
26. 后端加入日志
27. 使用shiro/spring security来规范用户的操作，使用token/jwt来验证用户的真实性
28. 后端引入oauth2/sso实现单点登录
29. 将http切换成https
30. 将项目改成分布式，使用SpringCloud/Dubbo+Zookeeper，使用Nginx负载均衡
31. 项目加入文档搜索和中文分词
32. 引入elasticsearch、kibana来完成搜索项目的构建
33. 使用消息队列将留言存入搜索文档
    1. 使用kafaka、MQ来发布消息
    2. 使用logstash来处理数据并传递给elasticsearch
34. 后台日志由elk完成收集和处理
35. 使用vuepress写详细文档

