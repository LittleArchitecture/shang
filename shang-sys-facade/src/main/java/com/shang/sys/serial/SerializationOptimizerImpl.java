package com.shang.sys.serial;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.shang.sys.entity.SysUser;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(SysUser.class);
        return classes;
    }
}
