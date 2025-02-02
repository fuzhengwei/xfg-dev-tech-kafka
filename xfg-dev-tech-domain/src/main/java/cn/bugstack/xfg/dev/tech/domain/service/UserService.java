package cn.bugstack.xfg.dev.tech.domain.service;

import cn.bugstack.xfg.dev.tech.domain.event.UserMessageEvent;
import cn.bugstack.xfg.dev.tech.domain.model.entity.UserEntity;
import cn.bugstack.xfg.dev.tech.domain.repository.IUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

    @Resource
    private IUserRepository userRepository;

    @Override
    public void register(UserEntity userEntity) {

        // 省略业务逻辑

        userRepository.doSaveUser(userEntity);
    }

}
