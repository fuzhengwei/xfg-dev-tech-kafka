package cn.bugstack.xfg.dev.tech.domain.repository;

import cn.bugstack.xfg.dev.tech.domain.model.entity.UserEntity;

public interface IUserRepository {

    void doSaveUser(UserEntity userEntity);

}
