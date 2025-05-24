package com.nicenpc.camundademo.delegate;

import com.nicenpc.camundademo.CouponService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class IssueCouponDelegate implements JavaDelegate {

    private final CouponService couponService;

    public IssueCouponDelegate(CouponService couponService) {
        this.couponService = couponService;
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        couponService.issueCoupon("ID5566");
        System.out.println("發送優惠券給使用者：" + "ID5566");
    }
}
