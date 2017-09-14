1.switch语句后的控制表达式只能是short、char、int、long整数类型和枚举类型，不能是float，double和boolean类型。String类型是java7开始支持。
2.jsp写法
  (1)<%...%>：可以插入一些语句。JSP脚本(Scriptlet)
 (2)<%! ...  %>：只能放置全局变量、全局常量、类、函数。
 (3)<%= ... %>：只能放置一个变量、常量。 JSP表达式(expression)
 2.自动数据类型转换
自动转换按从低到高的顺序转换。不同类型数据间的优先关系如下： 
    低 ---------------------------------------------> 高 
    byte,short,char-> int -> long -> float -> double
 3.oolean修饰的变量为包装类型，初始化值为false,进行赋值时会调用Boolean.valueOf(boolean b)方法自动拆箱为基本数据类型，
 因此赋值后flag值为true，输出文本true。 如果使用==比较,则输出文本false。if的语句比较，除boolean外的其他类型都不能使用赋值语句，否则会提示无法转成布尔值。
4.-n=~n+1