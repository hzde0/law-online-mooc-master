package com.hzde.eduorder.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hzde.eduorder.entity.Order;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author hz
 * @since 2023-5-18
 */
public interface OrderService extends IService<Order> {
    String createOrders(String courseId, String memberIdByJwtToken);

}
