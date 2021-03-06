package test;
/*
    第92集、93集结束
    方法在执行过程当中，在JVM中的内存是如何分配的，内存是如何变化的

        1、方法只定义，不调用，是不会执行的，并且也不会给给方法分配“运行所属”的内存空间

        2、在JVM内存划分上有这样三块主要的内存空间
            *方法区内存：存储的时代吗片段
            *堆内存
            *栈内存：在代码片段执行的时候，会在栈内存分配内存，先进后出，后进先出原则

        3、关于栈数据结构：
            *栈：stack，是一种数据结构
            *数据结构反应的是数据的存储形态
            *数据结构是独立的学科，不属于任何编程语言的范畴
            *作为程序员需要提前精通：数据结构+算法
            *常见的数据结构
                -数组
                -队列
                -栈
                -链表
                -二叉树
                -哈希表/散列表等等

         4、栈永远指向栈顶元素
            栈顶元素处于活跃状态，其他元素静止
            术语
                压栈、入栈、push：给方法分配内存
                弹栈、出栈、pop：释放方法的内存空间
            栈数据结构存储数据的特点是
                先进后出
                后进先出

         5、方法执行的时候代码片段存在哪里？方法执行的时候过程的内存在哪里分配？
            1、方法代码片段属于.class字节码文件的一部分，字节码文件在类加载的时候
                将其放到了方法去当中，所以JVM中的三块主要的内存空间中，方法区内存最
                先有数据，存放了代码片段。
            2、代码片段虽然在方法区内存当中只有一份，但是可以被重复调用。
                每一次调用这个方法的时候，需要给该方法分配独立的活动场所，在栈内存中分配
            *【栈内存中分配方法运行的说书内存空间】

         6、局部变量在“方法体”中声明，局部变量在运行阶段内存早栈中分配


*/
public class Java15_Method01 {
    public static void main(String[] args){
        System.out.println("测试训练冲突合并代码----");
    }
}
