package simple_factory_model;

public class Person {
    //静态工厂方法
    public static NVwa getPerson(String arg){
       NVwa person = null;
        //对person进行初始化
        if (arg.equalsIgnoreCase("M")){
            person = new Man();
            System.out.println("初始化创建男人");
        }
        else if(arg.equalsIgnoreCase("W")) {
            person = new Woman();
            System.out.println("初始化创建一个女人");
        }
        else if(arg.equalsIgnoreCase("R")) {
            person = new Robot();
            System.out.println("初始化创建一个机器人");
        }
        else {
            System.out.println("您输入的数据有误，请输入（W），（R）或（M）");
            System.exit(0);
        }
        return person;
    }
}
