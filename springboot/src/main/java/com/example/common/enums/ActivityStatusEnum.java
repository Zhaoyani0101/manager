package com.example.common.enums;

/**
 * ClassName: ActivityStatusEnum
 * Package:com.example.common.enums
 * Description:
 *
 * @Author ZYN
 * @Create 2024-03-24 13:43
 */
public enum ActivityStatusEnum {
    NOT_START("未开始"),
    IS_END("已结束"),
    NOT_SIGN("未报名"),
    IS_SIGN("已报名");

    private String value;

    public String getValue() {
        return value;
    }

    ActivityStatusEnum(String value) {
        this.value = value;
    }
}
