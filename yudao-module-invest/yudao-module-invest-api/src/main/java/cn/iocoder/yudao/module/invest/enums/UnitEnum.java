package cn.iocoder.yudao.module.invest.enums;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor

public enum UnitEnum {
    HOUR(1, "小时"),
    DAY(2, "天");

    private final int type;

    private final String title;

    public static UnitEnum getByType(Integer type) {
        return EnumUtil.getBy(UnitEnum.class,
                e -> Objects.equals(type, e.getType()));
    }
}
