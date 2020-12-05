package com.xiaopengwei.sprngboot.shiro.repository;

import com.xiaopengwei.sprngboot.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 *   数据访问层接口
 * </p>
 *
 * @author github.com/xpwi
 * @since 2019-04-21
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    /**
     * 通过 username 查找用户信息
     *
     * @param username
     * @return com.xiaopengwei.sprngboot.shiro.entity.UserInfo
     * @author github.com/xpwi
     */
    UserInfo findByUsername(String username);
}
