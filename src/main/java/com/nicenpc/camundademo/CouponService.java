package com.nicenpc.camundademo;

import org.springframework.stereotype.Service;

@Service
public class CouponService {
    public void issueCoupon(String userId) {
        // 真實邏輯：建立券、寫入資料庫、推送通知...
        System.out.println("發送優惠券給：" + userId);
    }
}
