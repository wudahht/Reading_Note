###java 安全性和可移植性
>关键在于Java编译器的输出并不是可执行的代码，而是字节码（bytecode）
jvm就是字节码解释器
字节码是一套高度优化的字符集
每个Java程序的运行都在java虚拟机的控制之下，Java虚拟机可以包含这个
程序并能阻止它在系统之外产生副作用。

>第一个字节码编译器JIT（Just in time），它是JVM的一部分，
它根据需要，一部分一部分地将字节码实时编译为可执行代码。
java要执行各种检查，这些检查只有在运行时才执行，因为JIT只编译
它运行时需要的代码


- 简单
- 安全
- 可移植
- 面对对象
- 健壮robust
- 多线程
- 体系结构中立
- 解释执行
- 高性能
- 分布式
- 动态


java是一种严格的语言，不但在编译时检查代码，而且在运行时也检查代码

**程序失败的两个主要原因：内存管理错误和误操作引起的异常状况
Java通过面对对象的异常处理机制来解决**

结构中立：只要写一次程序，在任何地方、任何时间该程序都能永远运行

javac将源文件编译为字节码，即class文件  
java 运行class文件  

***
关键字static允许调用main()而不必先实现该类的一个特殊实例
注意：Java是区分大小写的
在main()中，只有一个参数，String args[] ，它声明了一个叫做
args的参数，该参数是String类的一个实例数组
***

|header1|header2|
-------|-------
|row1 col1|row1 col2|
|row2 col1|row2 col2|
***

因为Java的可移植性要求，不论基于什么平台，整形int总是32位的  
byte 8位 -128～127  
short 16位 -32768～32767 极少使用  
int 32位 -2147483648～2147483647  
long 64位  

java中的char是16位，因为它使用Unicode码代表字符，为了全球的可移植性
不同于C/C++中的8位
没有负数的char
范围是0～65536
ASCII码范围是0～127

***
substring方法可以从一个较大的字符串中提取一个字串  

    String s = "Hello";
    String s1 = s.substring(0,3);
    // 字串的长度为3-0=3，字串为Hel
***
String类没有提供用于修改字符串的方法，只能提取想要的字符，然后再拼接需要替换的字符串  
也正是如此，再Java中String类对象成为不可变字符串，这种有一个优势：编译器可以让字符串共享  
在Java中，字符串并不是字符型数组，而是类似与char*的指针  
equals方法可以检测两个字符串是否相等，注意不能使用==来检测字符串是否相等，这个只能检测在内存中的位置是否相等  

    //要检查一个字符串既不是null也不是空串
    if(str!=null && str.length()!=0)
    
    s = s.substring(0,3)+"p!"
    // 输出Help！
    

###位运算
2的补码表示负数：通过将与其对应的正数的二进制代码取反（1变为0，0变为1），然后对其结果加1
要对一个负数解码，首先对其所有的位取反，然后加1

位运算每次左移都会使原来的操作翻倍，可以进行快速的2的乘法
但要注意，最高位是否超出了位数，当1移进了高位(int的31位)和
(long的63位)，那么该值变为负值

位运算每次右移，相当于将该值除以2并舍弃了余数，可以将一个整数进行快速的2的除法，
但要确保不能将该数原有的任何一位移出去。

-1的正确表示应该是1111 1111

>如果运用||或&&形式，而不是|或&，那么第一个运算数就能决定表达式的值，
>java不会对第二个表达式求值，即Java的短路版本。    
短路版本很有用，比如可以用来防止被0除的错误

`if(a!=0 && num/a>0)`

例外：
`if(c==1 & d++<100) m=10;`
此处&保证了不论c是否等于1，d都会自增

三元运算符取代if else then
`item1 ？item2：item3`

##选择语句：
    if(condition) {statement1};
    else {statement2;} //此处最好加上大括号

    if(condition1) statement1;
    elif(condition2) statement2;
    elif(condition3) statement3;
    else statement4;

***
    switch(expression){ //expression必须是byte，short，int或char类型
    case value1:
    statement1;
    break;

    case value2:
    statement2;
    break;

    case valueN;
    statementN;
    break; //break可选

    default:
    default statement; //default语句可选
    }

switch与if不同的是：switch语句仅能测试相等的情况，而if可以计算任何类型的布尔表达式；  
switch语句通常比一系列嵌套if语句更有效

##循环语句：
for
while
do-while

do-while有什么用？
需要在开始时候条件表达式即使是假的情况下，while循环至少也要执行一次的情况，
因为它的题条件表达式在循环的末尾
```
    do{body of loop}
    while(condition);
```
do-while循环总是先执行循环体，然后再计算条件表达式，如果条件表达式为真，则循环继续，否则结束。

---
##跳转语句
break
continue
return
除了跳转语句，还有一种可以改变程序执行流程的方法  
即通过**异常处理**
异常处理提供一种结构化的方法，可以使程序捕获并处理运行时刻的错误  
五个关键字来控制：  
+ try
+ catch
+ throw
+ throws
+ finally  
异常处理机制允许你的程序完成一个非局部的分支跳转  

在一系列嵌套中使用break语句时，它将仅仅终止最里面的那层循环  
switch语句中的break仅仅影响该switch语句，而不会影响其中的任何循环  
Java中没有goto语句，因为goto语句提供了一种改变程序运行流程的非结构化方式  
break带来的是goto的好处，舍弃的是goto的麻烦  
*带标签的break语句*

    break label：//跳过定义为标签label的代码块 
    continue label 
    
***
return语句使程序控制返回到调用它的方法  
****
###类
类是对象的模版，对象是类的实例  
在类中，数据和变量成为<b>实例变量</b>  
代码包含在方法内，方法和实例变量统称为类的成员  
类的声明和方法的实现要存储在同一个地方并且不能被单独定义，所有类的定义必须在一个单一的源文件中  

###声明对象
+ 创建一个类就是创建了一个新的数据类型，可以使用这种数据类型来声明这种数据类型的对象  
+ 第一步：声明该类类型的一个变量  
+ 创建一个对象的实际物理拷贝并把该对象的引用赋给刚创建的变量，这就是通过new运算符实现的  

new运算符为对象动态分配内存空间，并返回对它的一个引用  
一个对象引用和内存指针很相似，区别在于你不能像指针那样操作它（安全性）  


###标注
是为编译器或处理Java源文件或类文件的工具提供信息的一种机制。  

###大数值
如果基本的整数和浮点数不能满足，可以使用java.math包中的两个类：BigInteger和BigDecimal  
使用静态的valueOf方法可以将普通的数值转化为大数值

###数组
在声明数组时，需要指出数组类型，后面紧跟[]，以及数组变量的名字

    int[] a
    //但这只是声明了变量a，并没有将a初始化为一个真正的数组，应该用new创建数组
    int[] a = new int[100]
    //可以使用两种方法声明数组
    int[] a //用的最多，表示将整形数组int[]和变量名a分开了
    or 
    int a[]
    
***
创建一个数组数组时，所有的元素都初始化为0；  
boolean数组元素初始化为false；  
对象数组元素初始化为null，表示这些元素还没有存放任何对象；  
如

    String[] names = new String[10];
    //创建一个包含10个字符串的数组，所有字符串初始化都是null  
    
***
for each循环语句的循环变量会遍历数组中的每个元素，而不需要使用下标值。  
可以利用Arrays类的toString方法，快速打印数组中的所有值。  
***
匿名数组：在不创建新变量的情况下重新初始化一个数组。  

    int[] anonymous = {17,19,23,14,34};
    smallPrimes = anonymous;    

***
数组拷贝：可以使用Arrays类的copyOf方法。  
数组排序：Arrays.sort(a),使用了优化的快速排序算法。  

###对象与类
对象的三个主要特性：
+ 对象的行为：可以对对象的操作和方法  
+ 对象的状态：世嘉方法时，对象如何响应
+ 对象标识：如何辨别具有相同行为和相同状态的不同对象
  
 类直接的常见关系：
 + 依赖uses-a：一个类的方法操纵另一个类的对象
 + 聚合has-a：类A的对象包含类B的对象
 + 继承is-a：是一种用于表示特殊与一般关系的，类A扩展类B，类A不但包含从B继承的方法，还有一些额外的功能
 
***
 UML（Unified Modeling Language,统一建模语言）来绘制类图，用来描述类之间的关系
 
***
但并不是所有的类都有面对对象特征，如Math类，但是Math类只封装了方法，它没有也不需要封装数据

    //自定义类
    class Employee
    {
        //instance fields
        private String name;
        private double salary;
        private LocalDate hiredDay;
        
        //constructor
        public Employee(String n, double s, int year, int month, int day)
        {
            name = n;
            salary = s;
            hiredDay = LocalDate.of(year,month,day);
        }
        
        //mothod
        public String getName()
        {
            return name;
        }
            
    }

***
###final实例域
构造对象时必须初始化这种域，必须确保在每一个构造器执行之后，这个域的值被设置，
并且在后面的操作中，不能够再对它进行修改。  
例如将Employee中的name域声明为final，那么在对象构建之后，这个值不能被修改，即没有setName方法。  
final修饰符大都应用于基本类型域，或不可变类的域（如String类：类中每个方法都不会改变其对象）

###静态域和静态方法
####静态域
每个类中只有一个这样的静态域，即将域定义为static，也成类域。  
在Java中，静态修饰符static只能用于类的成员变量与成员方法。  
如果将某个变量定义为static，那么这个类及其所有对象共享同一个值，它在内存中只存在一份，严格来说是在每个JVM中只存在一份。 
比如：

    public class Employee{
        private int id;
        private static int nextId = 1;
    }
    //每个Employee对象都有一个id的拷贝，而且它们的值并不相同。
    //但所有的Employee共享同一个nextId的值，它在JVM中只存在一份。
 ***    
 其实静态变量使用得相对较少，它一般会结合一些设计模式使用（如单例）。但静态常量却使用得非常的多，如Math类中的：
 
     public static final double PI = 3.1415926538979323864;
***
另一个使用得非常多的是System.out，它在System类中被声明：

    public static final PrintStream out = ...
    
***
####静态方法
静态方法是一种不能向对象实施操作的方法，例如Math类的pow方法就是一个静态方法，Math.pow(x,a)。
在运算时，不实用任何Math对象，换句话说，没有隐式的参数。  
可以认为静态方法是没有this参数的方法（在一个非静态的方法中，this参数表示这种方法的隐式参数）。  
静态方法不能访问类中的实例域，因为它不能操作对象，但是静态方法可以访问自身类中的静态域。
main方法就是一个静态方法。main方法不对任何对象进行操作，静态的main方法将在启动程序时执行并创建程序所需要的对象。

***
类名字后面需要圆括号，主要是调用该类的构造函数。  
默认构造函数自动将所有实例变量初始化为0

***
有时候一个对象的方法需要引用调用它的对象，这时候就需要this关键字。
使用this可以直接引用对象，能解决可能在实例变量和局部变量之间发生的任何同名冲突。  
finalize()刚好在垃圾回收(GC)之前被调用。