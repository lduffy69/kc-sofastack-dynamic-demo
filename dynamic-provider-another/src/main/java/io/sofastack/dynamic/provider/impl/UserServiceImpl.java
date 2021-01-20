package io.sofastack.dynamic.provider.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import io.sofastack.dynamic.facade.UserService;
import org.springframework.stereotype.Service;

/**
 * @author LDUFFY
 * @Description: TODO
 * @date 2021/1/20 下午5:04
 */
@Service
@SofaService
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "LDuffy";
    }
}
