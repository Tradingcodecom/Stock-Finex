package cn.iocoder.yudao.module.invest.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * Goods 错误码枚举类
 * <p>
 * 产品中心 系统，使用 2-001-000-000 段
 */
public interface ErrorCodeConstants {

    // ========== 股票产品相关  2-001-000-000 ============
    ErrorCode PRODUCTS_CATEGORY_NOT_EXISTS = new ErrorCode(2_002_000_001, "error.2_002_000_001");
    ErrorCode PRODUCTS_NOT_EXISTS = new ErrorCode(2_002_000_002, "error.2_002_000_002");

    // ========== 质押订单 2_002_001_000 ==========
    ErrorCode PLEDGE_ORDER_NOT_EXISTS = new ErrorCode(2_002_001_000, "error.2_002_001_000");

    // ========== 收益记录 2_002_002_000 ==========
    ErrorCode INCOME_RECORD_NOT_EXISTS = new ErrorCode(2_002_002_000, "error.2_002_002_000");
    ErrorCode PRODUCT_HAS_NO_INCOME = new ErrorCode(2_002_002_001, "error.2_002_002_001");
    ErrorCode PRODUCT_ORDER_TOO_MIN = new ErrorCode(2_002_002_002, "error.2_002_002_002");
    ErrorCode PRODUCT_ORDER_TOO_MAX = new ErrorCode(2_002_002_003, "error.2_002_002_003");
    ErrorCode PRODUCTS_CATEGORY_I18N_NOT_EXISTS = new ErrorCode(2_002_002_004, "error.2_002_002_004");
    ErrorCode PRODUCTS_I18N_NOT_EXISTS = new ErrorCode(2_002_002_005, "error.2_002_002_005");
}
