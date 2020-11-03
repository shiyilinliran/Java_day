package main.java.JavaDay12;

/**
 * @ClassName NeiBuLei
 * @Description TODO
 * @Author admin
 * @Date 2020/11/3
 **/
public class NeiBuLei {
    /**
     * Na为成员内部类
     */
//    public static class Na{

//    }
//     static class Outer {
//        public Outer() {
//            System.out.println("Outer Class.");
//        }
//        static class Inner {
//            public void sayHi() {
//                System.out.println("Hi, Inner.");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Outer.Inner inner = new Outer.Inner();
//        inner.sayHi();
//    }/**
//        static class Outer {
//        private String name = "OuterClass";
//        public void sayHi() {
//            System.out.println("Hi, Outer.");
//        }
//        class Inner {
//            public void sayHi() {
//                // 内部类访问外部类
//                Outer.this.sayHi();
//                System.out.println(Outer.this.name);
//                System.out.println("Hi, Inner.");
//            }
//        }
//    }
//        public static void main(String[] args) {
//            Outer.Inner inner =  new Outer().new Inner();
//            inner.sayHi();
//        }
//    static class Outer {
//        public void sayHi() {
//            System.out.println("Hi, Outer.");
//        }
//        private class Inner {
//            String name = "InnerClass";
//            public void sayHi() {
//                System.out.println("Hi, Inner.");
//            }
//        }
//    }
//    static class InnerTest {
//        public static void main(String[] args) {
//            new Outer().sayHi();
//            new Outer().new Inner().sayHi();
//        }
//    }
//    static class OuterClass {
//        public OuterClass() {
//            System.out.println("OuterClass Init.");
//        }
//        protected static class InnerClass {
//            public void sayHi() {
//                System.out.println("Hi, InnerClass.");
//            }
//        }
//    }
//    static class InnerClassTest {
//        public static void main(String[] args) {
//            OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
//            innerClass.sayHi();
//        }
//    }
//    static class OutClass {
//        public void sayHi() {
//            class InnerClass {
//                InnerClass(String name) {
//                    System.out.println("InnerClass:" + name);
//                }
//            }
//            System.out.println("Hi, OutClass");
//        }
//    }
//    static class OutTest {
//        public static void main(String[] args) {
//            new OutClass().sayHi();
//
//        }
//    }

//    interface AnonymityOuter {
//        void hi();
//    }
//    static class AnonymityTest {
//        public static void main(String[] args) {
//            AnonymityOuter anonymityOuter = new AnonymityOuter() {
//                @Override
//                public void hi() {
//                    System.out.println("Hi, AnonymityOuter.");
//                }
//            };
//            anonymityOuter.hi();
//        }
//    }

    enum ColorEnum {
        /**
         *
         */
        RED,
        BLUE,
        YELLOW,
        GREEN
    }
    static class EnumTest {
        public static void main(String[] args) {
            ColorEnum[] color =ColorEnum.values();
            int i=0;
            switch (color[i]) {
                case RED:
                    i+=1;
                    System.out.println("Red");
                case BLUE:
                    i+=1;
                    System.out.println("Blue");
                    break;
                case YELLOW:
                    i++;
                    System.out.println("Yellow");
                    break;
                case GREEN:
                    i++;
                    System.out.println("Green");
                default:
                    break;
            }
        }
    }
}
