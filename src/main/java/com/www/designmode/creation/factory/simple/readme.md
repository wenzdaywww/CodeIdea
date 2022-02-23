# 简单工厂模式(simple)
## 1、创建公共接口类Sender.class
## 2、实现公共接口类，如MailSender.class、SmsSender.class
## 3、创建工厂类SimpleFactory.class，提供方法根据参数不同获取不同实例对象
### public Sender getSender(String type){
###     if(StringUtils.equals(type,"sms")){
###         return new SmsSender();
###     }else {
###         return new MailSender();
###     }
### }
