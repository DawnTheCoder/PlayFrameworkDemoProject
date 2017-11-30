[<img src="https://img.shields.io/travis/playframework/play-java-starter-example.svg"/>](https://travis-ci.org/playframework/play-java-starter-example)
# 前言
## 为什么我要用Play框架
Play框架好处都有啥？
- 内建HTTP服务器：调试无需下载Tomcat
- 良好构建Restful风格项目：路径定义简单
- 轻量级：周边的架子都帮你搭好了，专注业务即可
- 并发支持：良好的高并发性能

但是这玩意我也有想吐槽的：
``编译逻辑奇怪！就算我只是写了一个注释，或者加了一个空格，对不起，重新编译...``

不过因为Play框架真的很轻便，所以我依然喜欢这个框架。

# 运用play-java-starter-example构建Play运用

```
   搭建了Play框架的环境并且成功运行，在这里只做一个自带Readme的翻译工作。具体的项目构建运行以我后面的为准。
```

这是一个告诉你Play框架怎么用的初学者项目。请到https://www.playframework.com/documentation/latest/Home 这个链接查看更多信息。

## Running（运行）

使用sbt构建工具(http://www.scala-sbt.org/)来运行这个项目。如果你是在http://www.playframework.com/download 这个网址下载的Play初学者项目，那么这里面会自带一个预先打包好的sbt。

```
sbt run
```

  【注意】这里的命令给的只是在命令行下的操作，使用IDE的启动会有所不同。在后面我会专门贴出来运行说明。

然后用浏览器打开http://localhost:9000 这个链接来启动该应用。

## Controllers（视图控制器）

如下有几个案例文件提供给大家演示。

- HomeController.java:

  演示如何处理简单的HTTP请求。

- AsyncController.java:

  演示请求如何异步调用程序。

- CountController.java:

  演示如何使用组件完成计数器操作。
  
- TimeController.java:

  这个例子是我自己写的，不是官网的。很简单，显示一个当前时间的时间戳。

## Components（组件）

- Module.java:

  演示如何利用Guice框架去实现反转控制。

- Counter.java:

  一个包含状态的组件，是计数器(Count)的简单实现。

- ApplicationTimer.java:

  一个随应用启动的程序，并和应用一起停止工作。

## Filters（过滤器）

- ExampleFilter.java

  一个简单的过滤器，只是在每个响应中添加了一个header。 
