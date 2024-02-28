package com.hzde.educenter.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzde.educenter.entity.UcenterMember;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-03-09
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    Integer countRegisterDay(String day);
}
