package cn.iocoder.yudao.module.invest.api.pledgeorder;

public interface PledgeOrderApi {
    /**
     *
     * @param userId 会员用户id
     * @return 所有质押金额
     */
    Double getTotalPledgeAmount(Long userId);
}
