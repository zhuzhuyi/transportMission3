package com.liuyi.transport;

public class Aircraft  {
    //飞艇，构造方法

    public  Aircraft(){
        System.out.println("本交通工具是飞艇");
    }

    //飞艇的具体驾驶方法
    public void DriveMethod(){
        System.out.println("需要飞艇驾驶员在紧急情况下人工驾驶，" +
                            "其余都是按照提前预设好的情况飞行");
    }


}
