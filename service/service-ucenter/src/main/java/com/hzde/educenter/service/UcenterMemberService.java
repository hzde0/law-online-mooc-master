package com.hzde.educenter.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hzde.educenter.entity.UcenterMember;
import com.hzde.educenter.entity.vo.RegisterVo;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-03-09
 */
public interface UcenterMemberService extends IService<UcenterMember> {

    //登录的方法
    String login(UcenterMember member);

    //注册的方法
    void register(RegisterVo registerVo);

    UcenterMember getOpenIdMember(String openid);

    Integer countRegisterDay(String day);

    boolean send(String code, String phone);
}
