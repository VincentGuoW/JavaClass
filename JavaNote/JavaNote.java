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