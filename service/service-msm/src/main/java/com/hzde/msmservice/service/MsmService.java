package com.hzde.msmservice.service;

import java.util.Map;

public interface MsmService {
    boolean send(String code, String phone) throws Exception;
    //发送短信的方法

}
