package top.chengyunlai.mybatis.configuration.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import top.chengyunlai.mybatis.entity.User;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ExtendsObjectFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
        T t = super.create(type);
        // 判断是否为User类型，如果是，则预初始化值
        if (User.class.equals(type)) {
            User user = (User) t;
            user.setAge(0);
        }
        return t;
    }
}
