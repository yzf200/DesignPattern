
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

## 2. 依赖倒置原则
- 依赖倒转原则是开闭原则的基础，针对接口进行编程
- **需要进行依赖的时候，依赖于抽象，而不是具体的实现，以便于可以使用一系列满足这个抽象的类，而不是一个具体类**
- 可以减少类之间的耦合行，提高系统稳定性，提高代码可读性和可维护性
- 降低修改程序所造成的风险

## 3. 单一职责原则
- 一个类，接口，方法，只负责一项职责
- 降低程序的复杂度，提高程序可维护性，降低了变更所带来的风险
- **一个类或模块中，只负责一个职责，只会有一个引起变化的原因**

## 4. 接口隔离原则
- 用多个接口，而不是使用单一的接口尽量细化接口，接口中的方法尽量少
- 符合低合的设计思想，提高了可扩展性和可维护性
- **保证了一个类可以只实现他需要的接口。拒绝搭卖情况的发生**

## 5. 迪米特原则
- 一个对象应该对其他对象保持最少的了解，又被成为最少知道原则为了降低类与类之间的耦合关系 
- 强调只和朋友交流，不和陌生人说话 
- 朋友指的是成员变量或方法中输入或输出的参数
- **避免使用上帝视角**，一个成员属性（_这个成员属性的内部我不知道，因为我不是上帝，所以我只能调用这个成员属性暴露在外的方法，而不是拿到这个成员属性的内部细节来进行调用_），同样的，方法的传参或者同一个类中的其他方法都一样，我只能进行相关的调用，他的内部我不清楚，我不能够拿出来自己使用，一个收银员在执行结账业务的时候，不能够对顾客这个传参的钱包进行操作，因为他不是上帝，他只能调用顾客所暴露的支付方法进行支付，至于顾客的钱包有没有钱，有没有被偷，或者使用微信支付，不是收银员应该关心的

## 6. 里氏替换原则
- 里氏替换原则是继承复用的基石，对开闭原则的补充
- 子类可以扩展父类的功能，但是不能修改父类原有的功能
- 子类可以实现父类的抽象方法，但是不能覆盖原有父类的方法
- 子类中可以增加自己特有的方法 
- 对子类的继承关系进行约束，开闭原则的补充
- 可以增加程序的健壮性
- **子类继承于父类，那么父类能做的子类必须都能做**。父类输入的参数子类可以进行放大（确保参数在子类都可以进行处理），输出的参数可以进行缩小（确保子类的输出都能被处理），这里的放大缩小指的是继承关系的往上和往下，输入可以是父类输入的父类，输出可以是父类输出的子类。
- **当一个子类继承于父类，在使用过程中不能完全满足父类的需求时，这个继承违反里氏替换**。手枪，冲锋枪，狙击枪等子类都可以满足父类 枪 的击毙敌人的要求，但是水枪无法满足父类的需求，最父类的击毙做出了修改，会影响作战人员在使用枪的时候出现问题，所以水枪不能继承于枪。

## 7. 合成复用原则
- 尽量使用对象组合，聚合的方式，而不是使用继承关系达到软件复用的目的
- 可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响

# 三、设计模式的类型
除GOF23种外的设计模式
- 简单工厂模式 
  - 由一个工厂决定创建哪一种产品类型的实例，只给外界一个获得产品的接口，不对外开放制造产品的细节。
  - **但是违反了开放封闭原则，新增产品的时候需要修改工厂代码**

- 创建型模式
  - 隐藏了创建对象的过程,通过逻辑方法进行创建对象,而不是通过new关键字进行创建
    - 工厂方法模式
      - 定义一个接口或一个抽象的工厂类,让它实现类(工厂)来决定创建哪一个实例对象
      - 根据每个工厂不同的方法,来产生不同的所需要的对象
      - 工厂方法模式生产的都是相同系列的对象,比如Java课程,Python课程
      - 在简单工厂模式的基础上，根据单一职责原则对这个工厂进行解耦，统一由一个抽象的工厂类定义制作行为，各自的类型工厂实现自己的制作细节，在后续添加新的产品的时候，不会影响旧的工厂，符合开放封闭原则
    - 抽象工厂模式
      - 抽象工厂模式提供了创建一系列相关或互相依赖对象的接口
      - 类似公司下的产品,生产,生产汽车,将汽车分为各个零部件进行生产,车架,车门,底盘
      - 工厂方法模式是为了管理一个产品而出现的工厂，抽象工厂模式是为了进一步管理一套产品系列而出现的工厂。
    - 建造者模式
      - 将复杂的对象的构建和表示分离，使得同样的构建过程可以创建不同的表示。
      - 建造的过程和细节我们不需要知道,只需要通过构建者去进行操作即可
      - **建造者模式的本质是为了把一个对象的各个组件的生产 和 各个组件的混合表示（组装或其他操作） 进行分离。生产交各个厂商Builder完成，表示是一个共有的逻辑，由Engineer进行完成**
    - 原型模式
      - 用于创建重复的对象,能够保证创建对象的性能.
      - 原型设计模式是创建对象的最佳方式
      - 实现cloneable接口，重写clone方法，注意深拷贝和浅拷贝问题
    - 单例模式
      - 保持只有一个实例对象的,就是单例设计模式
      - 减少内存开销
      - 懒汉式
        - 在需要使用对象的时候，才进行创建
        - 通过private构造方法，确保外部不能new出对象，通过一个静态方法进行对象获取。
        - 需要注意的是懒汉式是在第一次需要的时候才构造，并发情况下有线程安全问题，需要进行同步处理
      - 双重检查
        - 通过两个if判断,加上同步锁进行实现
        - 相较于懒汉式在方法上加锁，双重检查的锁粒度下降，性能更好
        - **还需要对成员变量进行volatile，synchronized锁住了临界区，保证了临界区的原子性，基于JMM的lock和unlock机制，可以保证被锁元素的可见性，但是双重检测锁锁的是class对象，不是instance，无法保证可见性，锁的有序性也是基于happens before原则，但是现在锁住的是class对象，只能保证对于class对象的有序性**
      - 静态内部类
        - 在单例类中,通过私有的静态内部类,创建单例对象
        - 静态内部类只有在被调用的时候才会被加载，实现了懒加载。
        - 类的加载过程是线程安全的，还保证了并发安全。
        - 所以静态内部类比双重检查更优，实现手段简单，不需要额外的同步操作
      - 饿汉式
        - 在类加载的时候就进行对象的创建
      - 枚举
        - 枚举的方式实现单例模式,是**最佳的实现方式**
        - 它可以有效防止对单例模式的破坏
          - 序列化和反序列化会破坏单例模式。**枚举对象的序列化是把name放入了文件内，反序列化的时候是根据name去找到对象。普通的对象进行反序列化是通过反射使用构造方式完成创建，即便构造函数是private的，也会被强制调研**
          - 枚举有特殊限制，构造方法是私有的，无法通过反射强制开启 

- 结构型模式
  - 主要关注类和对象的组合关系
  - 继承的概念被用来组合接口和定义组合对象,获得新的功能方式
    - 外观模式
      - 提供了一个统一的接口,用来访问子系统中的一群接口
      - 定义了一个高层接口,让子系统使用更加容易 
      - 隐藏了系统中的复杂性，向客户端提供了一个简化的接口，使得客户端与系统的交互更加方便。
    - 适配器模式
    - 桥接模式
    - 组合模式
    - 装饰模式
    - 享元模式
    - 代理模式

- 行为型模式
  - 主要关注对象之间的通信
    - 责任链模式
    - 炒令模式 
    - 解释器模式
    - 迭代器模式
    - 中介者模式 
    - 备忘录模式 
    - 观察者模式
    - 状态模式
    - 策略模式 
    - 模板方法模式 
    - 访问者模式

  