//package com.guocz.custom;
//
//import lombok.extern.log4j.Log4j2;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author guocz
// * @date 2022/8/2 10:40
// *
// * 消息消费者
// */
//@Component
//@Log4j2
//public class Consumer {
//
////    @JmsListener(destination = "sms.queue")
//    //    指定监听器工厂，可作为混合模式
//    @JmsListener(destination = "sms.queue", containerFactory = "queueListenerFactory")
//    public void receiveMsg(String text) {
//        log.info("接受到的消息是：{}", text);
//    }
//
//
////    @JmsListener(destination = "sms.topic")
//    //    指定监听器工厂，可作为混合模式
//    @JmsListener(destination = "sms.topic", containerFactory = "topicListenerFactory")
//    public void receiveTopic1(String text) {
//        log.info("r1接受到的消息是：{}", text);
//    }
//
////    @JmsListener(destination = "sms.topic")
//    //    指定监听器工厂，可作为混合模式
//    @JmsListener(destination = "sms.topic", containerFactory = "topicListenerFactory")
//    public void receiveTopic2(String text) {
//        log.info("r2接受到的消息是：{}", text);
//    }
//}
