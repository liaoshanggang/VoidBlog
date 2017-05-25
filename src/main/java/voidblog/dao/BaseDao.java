package voidblog.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lingdeqin on 17-5-25.
 */

public interface BaseDao<T> {
    T findById(@Param("id") Long id);

    List<T> findAll();
}
