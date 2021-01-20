package io.sofastack.dynamic.provider.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import io.sofastack.dynamic.facade.StrategyService;
import io.sofastack.dynamic.facade.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/6/12 7:49 PM
 * @since:
 **/
@Service
@SofaService
public class StrategyServiceImpl implements StrategyService {

    @SofaReference
    private UserService userService;

    @Override
    public String strategy() {
        System.out.println(userService.getUser());
        return "order";
    }
}
