package cn.rrl.mvc1.Dao;

import java.io.Serializable;
import java.util.List;

public class DAOAdapter<T> implements   IDAO<T> {
    @Override
    public int selectCount(String kw) throws Exception {
        return 0;
    }

    @Override
    public List<T> selectsplitAll(String kw, int Start, int ls) throws Exception {
        return null;
    }

    @Override
    public T selectById(Serializable id) throws Exception {
        return null;
    }

    @Override
    public int delectById(Serializable id) throws Exception {
        return 0;
    }

    @Override
    public int updateById(T t) throws Exception {
        return 0;
    }

    @Override
    public int insert(T t) throws Exception {
        return 0;
    }
}
