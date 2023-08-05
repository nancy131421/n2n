package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.pojo.Order;
import org.example.pojo.Product;

import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            //读取核心配置文件
            reader = Resources.getResourceAsReader(resources);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        Order order = session.selectOne("find",1);
        System.out.println(order);
        System.out.println("git3");
        System.out.println("git5");
        System.out.println("git4");
        System.out.println("hot-fix test");
    }
}