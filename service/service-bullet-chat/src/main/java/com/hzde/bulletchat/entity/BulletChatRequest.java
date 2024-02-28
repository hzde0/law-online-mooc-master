package com.hzde.bulletchat.entity;

import lombok.Data;

/**
 * com.example.bulletchat.entity
 *
 * @author hz
 * @since 2023-05-22
 */
@Data
public class BulletChatRequest {
    private Integer timestamp;
    private String content;
}
