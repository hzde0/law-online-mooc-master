package com.hzde.eduservice.entity.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherQuery {

    @ApiModelProperty(value = "教师名称,模糊查询")
    private String name;

    @ApiModelProperty(value = "头衔 1高级讲师 2首席讲师")
    private Integer level;

    @ApiModelProperty(value = "查询开始时间", example = "2023-01-01 10:10:10")
    @TableField(fill = FieldFill.INSERT)
    private String begin;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换

    @TableField(fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "查询结束时间", example = "2023-12-01 10:10:10")
    private String end;
}
