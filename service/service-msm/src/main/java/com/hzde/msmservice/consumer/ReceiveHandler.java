package com.hzde.msmservice.consumer;


import com.hzde.commonutils.ordervo.MsmVo;
import com.hzde.msmservice.config.RabbitmqConfig;
import com.hzde.msmservice.service.MsmService;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ReceiveHandler {
    @Autowired
    MsmService msmService;
   //监听sms队列
    @RabbitListener(queues = {RabbitmqConfig.QUEUE_INFORM_SMS})
    public void receive_sms(MsmVo msmVo, Message message, Channel channel) throws Exception {
        System.out.println(msmVo);
        System.out.println(msmVo.getCode());
        msmService.send(msmVo.getCode(),msmVo.getPhone());
    }
}
