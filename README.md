# design_patterns

## 项目介绍
大话设计模式案例demo

## 简单工厂模式 simple_factory

![简单工厂模式类图](https://images.gitee.com/uploads/images/2020/0315/214452_9dfaff30_1031363.png "简单工厂模式.PNG")

## 策略模式 strategy  

概念：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。  
策略模式是一种定义了一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少各种算法类
使用算法类之间的耦合。

 ![策略模式代码结构](https://images.gitee.com/uploads/images/2020/0315/214707_74cf66c2_1031363.png "策略模式代码结构.PNG")

 ![策略模式类图](https://images.gitee.com/uploads/images/2020/0315/214824_b59e861a_1031363.png "策略模式结构图.PNG")

## 单一职责原则

问题：如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力，这种耦合会导致脆弱的设计，
当发生变化时，设计会遭受意向不到的破坏。
概念：就一个类而言，应该仅有一个引起它变化的原因。

## 开放-封闭原则

概念：软件实体（类、模块、函数等等）应该可以扩展，但是不可修改。

## 依赖倒转原则  

（1）高层模块不应该依赖底层模块，两个都应该依赖抽象；  
（2）抽象不应该依赖细节。细节应该依赖抽象。  

## 里氏代换原则  

子类必须能够替换掉它们的父类型。

## 装饰者模式 decorator  

动态地给一个对象添加一些额外的职责，就增加功能来说，装饰着模式比生成子类更为灵活。  
![装饰模式类图](https://images.gitee.com/uploads/images/2020/0315/215107_bf6a3426_1031363.png "装饰模式.PNG")

## 代理模式 proxy

### 静态代理

静态代理采用的方式就是我们手动的将这些行为换进去，然后让编译器帮我们编译，同时也就将字节码在原有类的基础上加入一些其他的东西或者替换原有的东西，产生一个新的与原有类接口相同却行为不同的类型。

**从静态代理的使用上来看，我们一般是的做法是：**

  **1，代理类一般要持有一个被代理的对象的引用。**

  **2，对于我们不关心的方法，全部委托给被代理的对象处理。**

  **3，自己处理我们关心的方法。**

**缺点：**

这种代理是死的，不会在运行时动态创建，因为我们相当于在编译期，也就是你按下CTRL+S的那一刻，就给被代理的对象生成了一个不可动态改变的代理类。

静态代理对于这种，被代理的对象很固定，我们只需要去代理一个类或者若干固定的类，数量不是太多的时候，可以使用，而且其实效果比动态代理更好，因为动态代理就是在运行期间动态生成代理类，所以需要消耗的时间会更久一点。就像上述的情况，其实就比较适合使用静态代理。

### 动态代理

动态代理就是在运行期间动态生成代理类。

#### JDK自带方式

首先是java.lang.reflect包里的InvocationHandler接口：

```
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;
}
```

我们对于被代理的类的操作都会由该接口中的invoke方法实现，其中的参数的含义分别是：

- proxy：被代理的类的实例
- method：调用被代理的类的方法
- args：该方法需要的参数

使用方法首先是需要实现该接口，并且我们可以在invoke方法中调用被代理类的方法并获得返回值，自然也可以在调用该方法的前后去做一些额外的事情，从而实现动态代理，下面的例子会详细写到。

另外一个很重要的静态方法是java.lang.reflect包中的Proxy类的newProxyInstance方法：

```
public static Object newProxyInstance(ClassLoader loader,
                                      Class<?>[] interfaces,
                                      InvocationHandler h)
    throws IllegalArgumentException
```

其中的参数含义如下：

- loader：被代理的类的类加载器
- interfaces：被代理类的接口数组
- invocationHandler：就是刚刚介绍的调用处理器类的对象实例

该方法会返回一个被修改过的类的实例，从而可以自由的调用该实例的方法

#### CGLIB库的方式

CGLIB（Code Generator Library）是一个强大的、高性能的代码生成库。其被广泛应用于AOP框架（Spring、dynaop）中，用以提供方法拦截操作。