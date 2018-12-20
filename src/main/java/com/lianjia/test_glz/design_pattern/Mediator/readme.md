# 中介者模式
## Intent
### 集中相关对象之间复杂的沟通和控制方式
## Class Diagram
+ Mediator：中介者，定义一个接口用于与各同事（Colleague）对象通信。
+ Colleague：同事，相关对象
## Implementation
+ Alarm(闹钟)、CoffePot(咖啡壶)、Calendar(日历)、Sprinkler(喷头)是一组相关的对象，在某个对象的事件产生时需要去操作其他对象，形成了下面这种依赖结构
+ 使用中介者模式可以将复杂的依赖结构变成星形结构：
