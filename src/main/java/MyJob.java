import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

/**
 * @Author: huangbin
 * @Description:
 * @Date: Created in 
 * @Modified By:
 */
public class MyJob {
    public void run(){
        System.out.println("任务执行。。。。");
    }
}
