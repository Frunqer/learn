# 访问者模式（Visitor）
## Intent
### 为一个对象结构（比如组合结构）增加新能力.
## Class Diagram
+ Visitor: 访问者，为每一个ConcreteElement声明一个visit操作
+ ConcreteVisitor: 具体访问者，存储遍历过程中的累计结果
+ ObjectStructure: 对象结构，可以是组合结构，或者是一个集合