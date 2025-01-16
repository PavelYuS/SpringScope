import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanTwo));

        Cat beanThree =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanThree.getName());

        Cat beanFour =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanThree.equals(beanFour));
    }
}