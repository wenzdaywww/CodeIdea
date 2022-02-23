# 简单工厂模式(simple)
## 实现方式
### 1、创建公共接口类，如Sender.class
### 2、实现公共接口类，如MailSender.class、SmsSender.class
### 3、创建工厂类，如SimpleFactory.class，提供方法根据参数不同获取不同实例对象
#### public Sender getSender(String type){
####     if(StringUtils.equals(type,"sms")){
####         return new SmsSender();
####     }else {
####         return new MailSender();
####     }
#### }
