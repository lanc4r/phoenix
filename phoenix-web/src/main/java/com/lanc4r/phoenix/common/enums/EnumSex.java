package com.lanc4r.phoenix.common.enums;

public enum EnumSex {

    UNKONW(0, "未知"), MALE(1, "小哥哥"), FEMALE(2, "小姐姐");

    private Integer code;
    private String name;

    private EnumSex(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static EnumSex getEnum(Integer code) {
        for (EnumSex e : EnumSex.values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}
