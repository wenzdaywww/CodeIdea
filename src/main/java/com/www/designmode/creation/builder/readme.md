# 建造者模式(Builder):将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的对象。
## 1、定义一个父模型类，如人类Person.clss
## 2、定义子模型类，如男人Man.class、女人Woman.class
## 3、定义模型各部件抽象方法的建造者接口类，如人类建造者接口PersonBuilder.class
## 4、实现子模型的建造者接口实现类，如男人建造者实现类ManBuilder.class、女人建造者实现类WomanBuilder.class
## 5、构造一个使用Builder接口的对象，指导构建过程，如人类创造类NuwaMadePerson.class
## 注：如果子模型只有一种，则可以不需要NuwaMadePerson.class这一层，将具体构建过程再Builder实现类中完成，如外星人建造这实现类AlienBuilder.class