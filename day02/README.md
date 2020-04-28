# 第二天游戏开发入门

## 消息协议基础

消息的设计

![](E:\studyNetty\studyNetty\day02\image\msg.png)

1.首先前两个字节是消息的长度

2.后面两个字节是消息的编号，比如1是登录，2是返回登录，后面就是消息体



*为什么会有消息长度这个字段*

是因为会出现粘包的存在，这个是因为socket编程他是一个tcp的编程，而每一次发送的消息不一定是一次性发完整的消息，所以可能出现多个消息才能组成一个消息的这种形式，所以需要一个长度，根据长度判断我这个消息是否已经读取完毕。

粘包的的示意图

![](E:\studyNetty\studyNetty\day02\image\msg1.png)



## Protobuf 协议文档

准备工作：

1.下载windows下面编辑工具

[Protobufwindos转换工具](https://github.com/protocolbuffers/protobuf/releases)

下载自己对应的windows版本的工具，我是64位的就下载64位的操作

2.下载完成解压以后把盘符：photobuf/bin/protoc.exe加入到path里面，然后cmd在dos环境下打印protoc 看是否有说明文档如果有就证明已经安装完成。

3.关键命令 protoc.exe --java_out=${目标目录} .\对应的proto文件

4.文件的编写规则请参考https://www.cnblogs.com/talenth/p/5820040.html

5.打包使用刚才的命令：

