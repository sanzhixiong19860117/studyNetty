# Javassist 提升反射效率

为什么要使用反射加javassist技术

反射会使代码的速度变慢，同样使用硬编码和反射技术对20W条数据进行对象赋值，前者会比后者更快，但是后者会对扩展性更好，使用反射技术的比如mybatis等技术拥有更多的扩展性，然后使用反射加Javassist技术自动生成的字节码技术，可以更好的让性能和扩展达到一个平衡。

code里面就是一个三个版本的技术分别