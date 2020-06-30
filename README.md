# springClound-alibaba
基于springClound-alibaba搭建的微服务项目架构
## 项目目录结构
 springClound-alibaba  <br/> 
 │  
 ├─api-gateway 【网关】 <br/>
 │  
 ├─business-center 【业务类微服务】 <br/> 
 │  │─account-center 【account模块】 <br/> 
 │  │─actordb-center 【actordb模块】 <br/> 
 │  │─actorlogdb-center 【actorlogdb模块】 <br/> 
 │  │─game-center 【game模块】 <br/> 
 │  └─user-center 【user模块】<br/> 
 │    
 ├─doc【文档】 <br/> 
 │ <br/> 
 ├─inner-intergration 【分布式基础组件】 <br/> 
 │  │  
 │  └─redis-spring-boot-starter 【redis工具】<br/> 
 │     
 │─oauth-center 【oauth2 认证中心】 <br/>
 │ <br/>
 │─register-center 【nacos 注册中心】 <br/>
 │ <br/>
 │─test-untitled 【测试用例】 <br/>
 │<br/>
 │─web-api 【对外统一提供内部服务接口工程】 <br/>
 │<br/>
 │─web-portal 【后台web工程】 <br/>
 │     
 └─web-vue 【后台web工程-vue版】 <br/> 
        
## 项目模块
![Image text](doc/img/framework.png)