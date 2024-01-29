
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
      - 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁,将一个类的接口转换成客户希望的另外一个接口
      - 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
      - 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能
    - 桥接模式
      - 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
      - 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
      - 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
      - **抽象的抽象。蓝牙耳机连接不同的手机，这是第一层抽象，所以蓝牙耳机抽象类有连接动作，具体的耳机类中都有连接，但是手机本身也是抽象的，所以连接动作不能对一个具体的实例手机起作用，要对手机这个抽象动作起作用，最后根据具体的传入实例手机进行连接**
    - 组合模式
      - 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
      - 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
      - 这种类型的设计模式属于结构型模式，它创建了对象组的树形结构
      - 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
    - 代理模式
      - 为对象提供一种代理，以控制这个对象的访问操作
      - 代理对象和目标对象之间起到中介的作用
      - 保护目标对象和增强目标对象
      - 代理模式能将代理对象与真实被调用的目标对象分离
      - 一定程度上降低了系统的耦合度，扩展性好
    - 装饰模式
      - 在原有对象不做改变的基础上，将对象的功能附加上
      - 提供了比继承更有弹性的替代方案(扩展原有对象功能)
      - 扩展一个类的功能或给一个类添加附加职责(业务逻辑)
      - 动态的给一个对象添加功能，这些功能可以再动态的撤销
      - 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
      - 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
      - **通过继承和聚合一起使用，继承于一个抽象类，所以有一样的方法，聚合了被装饰对象，所以可以调用被装饰对象的方法，实现了扩展**
    - 享元模式
      - 提供了减少对象数量从而改善应用所需的对象结构的方式
      - 运用共享技术有效地支持大量细粒度的对象
      - 总结：减少创建对象的数量，从而减少内存的占用，提升性能

- 行为型模式
  - 主要关注对象之间的通信
    - 模板方法模式
      - 定义了一个算法的架构，并允许子类为一个或多个步骤的实现
      - 模板方法在子类不改变算法结构的情况下，重新定义算法的某些步骤
      - 实现一个算法的不变的部分，并将可变的空间留给子类来完成
      - 子类中公共的行为抽取出来并封装到一个公共父类中，避免代码重复 
    - 迭代器模式
      - 提供方法，顺序访问集合对象中的各个元素，而又不暴露对象的内部表示
      - 为遍历不同的集合结构提供统一的接口,分离了集合对象的遍历行为
      - **将遍历逻辑封装在集合对象的内部，但是遍历的使用逻辑在外部抽象规范，根据简单的使用逻辑，使用获取到的迭代器就可以完成遍历**
    - 策略模式
      - 定义了算法，分别封装起来，它们之间可以相互替换，让算法的变化不会影响到使用算法的用户
      - 如果有大量的if...else...else if...可以通过策略模式进行替换
      - 避免使用多重条件转语句，if...else if...else
      - 提高算法的保密性和安全性
      - 使用一个一个的策略类来解耦算法的复杂变化，具体执行的时候选择一个策略类进行使用
    - 解释器模式
      - 通过给定的语言，定义它的语法和行为，并定义解释器，这个解释器使用来解释语言中的句子
      - 为了解释一种语言，而为语言创建的解释器
        - 个类型问题触发频次足够高,比如处理日志和不同日志格式
    - 观察者模式
      - 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）
      - 比如，当一个对象被修改时，则会自动通知依赖它的对象。
      - 让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者(观察者)都会收到通知并更新
    - 备忘录模式
      - 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
      - 所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
      - 很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
      - 发起者可以自己创建备忘录，或者读取备忘录，备忘录可以放入容器取出容器，备忘录本身不允许更改。
    - 命令模式
      - 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。解决了应用程序中对象的职责以及它们之间的通信方式
      - 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
      - 请求调用者和行为实现者需要解耦，使得调用者和行为实现者不直接交互
      - **发送者和执行者的解耦，发送方只需要调用统一的execute方法，提高了程序的灵活性和扩展性**
    - 中介者模式 
      - 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
      - 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
      - 对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
    - 责任链模式
      - 为请求创建了一个接收者对象的链。对请求的发送者和接收者进行解耦。
      - 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
      - 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
      - 职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
    - 状态模式
    - 访问者模式