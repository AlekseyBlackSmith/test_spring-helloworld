import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 = applicationContext.getBean((Cat.class));
        Cat bean4 = applicationContext.getBean(Cat.class);


        System.out.println("bean1: " + bean1.getMessage() + ", bean2: " + bean2.getMessage());
        System.out.println(bean1 == bean2);

        System.out.println("cat1: " + bean3.getName() + ", cat2: " + bean4.getName());
        System.out.println(bean3 == bean4);
    }
}