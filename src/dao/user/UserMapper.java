package dao.user;

import java.util.List;

import entity.User;

/**
 * 操作数据库表的操作
 * @author 黄龙
 * @创建时间 2020年3月27日下午4:12:05
 */
public interface UserMapper {
      List<User> getAll();
}
