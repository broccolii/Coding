package com.broccoliii;

public class Constructor {
    String name = "name";

    public Constructor() {
        System.out.println("调用了初始化方法");
    }

    public Constructor(String name) {
        this.name = name;
        System.out.println("入参是" + name);
    }
}

class SubCon extends Constructor {
    public SubCon() {
        super("1234");
    }
}

class TestDemo {
    public static void main(String[] args) {
        SubCon subCon = new SubCon();
    }
}
