package com.atguigu.springcloud.alibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444,"自定义限流处理类 global handlerException---------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444,"自定义限流处理类 global handlerException2--------2");
    }

}
