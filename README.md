
# 一、设计模式介绍
- 代表了代码的最佳实践，被有经验的开发人员所使用
- 设计模式是很多被反复使用并知晓的，主要是对代码和经验的总结
- 使用设计模式是为了重用代码，让代码更容易被他人理解，保证代码的可靠性
- 对接口编程而不是对实现编程
- 有限使用对象组合而不是继承

# 二、设计模式七大原则
## 1. 开放封闭原则
- 对扩展开放，对修改关闭 
- 编写软件，比如类，模块，方法使用抽象进行构建，使用实现扩展细节 
  - 面向抽象编程
- 提高软件系统的可复用性和可维护性
- **需要新的功能的时候，进行扩展，不能修改已有代码，不要破坏原有的功能（继承、实现接口、多态等）**