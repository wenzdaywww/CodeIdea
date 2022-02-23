# 简单工厂模式(simple)
## 1、创建公共接口类Sender.class
## 2、实现公共接口类，如MailSender.class、SmsSender.class
## 3、创建工厂类SimpleFactory.class，提供不同方法获取不同实例对象，可以是实例方法或静态方法
### public static Sender getSmsSender(){
###     return new SmsSender();
### }
### public static Sender getMailSender(){
### return new MailSender();
### }