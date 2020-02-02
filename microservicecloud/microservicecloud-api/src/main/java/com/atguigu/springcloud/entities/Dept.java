package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
/*Idea中lombok使用的坑: 1. 引入lombok依赖，即在pom.xml中添加依赖
                     2. 在setting中的plugin中下载lombok插件
                     3. 进入Settings–>Build,Excecution*–>Compiler–>Annotation Processors，勾选Enabled annotation processing
* */

/*
*  alt+7显示类的结构Outline
* */

@AllArgsConstructor //全参构造函数
@NoArgsConstructor //无参构造函数
@Data //每个属性都设置成get和set
@Accessors(chain = true) //链式风格
public class Dept implements Serializable {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public static void main(String[] args){
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("Dept01").setDb_source("DB01");
    }
}
