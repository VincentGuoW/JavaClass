package JavaNote;
/*
  Fast JavaBean => Right Click => Source Action
                1.Constructors (all select & non select) 
                2. Getters and Setters
 */

/*
      sc.next       no need to use extra sc.nextLine to clear the "\n"
      sc.nextInt    need it 
      sc.nextLine   no need
  sc.nextLine() doesn't need to worry about left over "/n"; 
  if use sc.nextInt() need sc.nextLine() to clear the left over line change symble"/n""
 */

 /*
  while(true){...}
  if I want to shut this loop done, I can name the loop and break it.
  E.g.  sampleLoop1 while(true){...
                                break sampleLoop1;
          .}
        This way the whole sampleLoop1 will stop.
  check June 2024 class 3 for demo
  */

  /*
   print try to match the same size \t for 8 bits
   */

   /*
    StringBuilder => to make a string by adding char
    E.g. 
    StringBuilder letters = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            letters.append(letterList.charAt(rand.nextInt(letterList.length())));
        }
    */

    /*
        while(){
            int sample = xxxx
        }
        while(){
            int sample = xxxx
        }
            this is fine cus it's in different{}block.
        块级作用域（Block Scope）: 变量在定义它的块中有效。块是由大括号 {} 包围的代码段。
        方法级作用域（Method Scope）: 变量在定义它的方法中有效。
        类级作用域（Class Scope）: 静态变量在整个类中有效，实例变量在整个对象的生命周期中有效。
     */

    /*
     String return address or strings
     char[] charArray = {'a','b','c'}
        System.out.println(charArray.toString()); // Output: [C@some_hash_code
        
        String str = new String(charArray);
        System.out.println(str); // Output: Hello
     */

     /*
      Static
        1.shear same value by all 
            a. Student.teacherName = "xxx" (best)
            b. S1.teacherName = "xxx"
            both way will make there rest who ever use Student Javabean get the same teacherName
     */


     /*
      Pack java: name rules ==> com.google.xxxx
                            ==> com.google.teacher
                            ==> com.google.student


     */

     /*
      继承父类的内容：


成员变量    ==    public 能      ==     private 能
构造方法    ==    public 不能    ==     private 不能
成员方式    ==    public 能      ==     private 不能


static 和 private 的区别：
static 表示属于这个类(class)本身 公用的(如学生class 姓名 年龄都不同 但是老师相同 老师加static)
加了static后 如果要操作的话 需要直接调用总class 而不是每次新建的
private 表示私有的 不能直接访问 上锁 需要get set 进行访问

public class Dad extends Object{

    成员变量=>
    public int numberSample1;
    private int numberSample2;
    static int numberSample3;
    //如果父子有相同成员变量 就近原则 所以不推荐 

    构造方法=>
    //构造方式dad不能继承给son，因为不能用（就如同复制代码一样 下面这串复制过去不能用）
    public Dad(){}
    public Dad(int numberSample1, int numberSample2){
        this.numberSample1 = numberSample1;
        this.numberSample2 = numberSample2;
    }

    成员方式=>
    public void displayInfo() {
        System.out.println("number1: " + numberSample1 + ", number2: " + numberSample2);
    }

    private void displayInfo2() {
        System.out.println("number2: " + numberSample2 + ", number3: " + numberSample3);
    }

    public void sample(){
        int a = 0;
        System.out.println("a: " + a);
        System.out.println("a: " + this.a); find this a from class
        System.out.println("a: " + super.a); find super a from inheritance. from DAD not GrandDad

    }
      */


    /*
    Static class can not use non static variable!
    */