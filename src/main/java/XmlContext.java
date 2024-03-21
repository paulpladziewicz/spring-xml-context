import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContext {

    public static void main(String[] args) throws BeansException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

        Account account = (Account) ctx.getBean("account");
        System.out.printf("The account balance is $%.2f.", account.getModifiedBalance());
    }
}
