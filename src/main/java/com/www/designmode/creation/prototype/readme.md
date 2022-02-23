# 原型模式(prototype):
## 深拷贝与浅拷贝:
### Object类的clone方法只会拷贝对象中的基本的数据类型（8种基本数据类型byte,char,short,int,long,float,double，boolean），
### 对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝
## 实现方式:
### 1、实现Cloneable接口
### 2、重写Object类中的clone方法