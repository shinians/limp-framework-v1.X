package com.limp.framework.boss.listener;



import com.limp.framework.boss.filter.PageLogUtils;
import com.limp.framework.core.bean.Version;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Formatter;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 监听环境信息
 * @author:shinian
 * @description:
 * @date:Created in 13:58 2017/10/20
 * @modified By:
 */
public class EnvironmentContenxtListener implements ServletContextListener {

    private static Logger log = Logger.getLogger(EnvironmentContenxtListener.class);

    /**
     *   AtomicBoolean是java.util.concurrent.atomic包下的原子变量，这个包里面提供了一组原子类。
     *
     *   其基本的特性就是在多线程环境下，当有多个线程同时执行这些类的实例包含的方法时，具有排他性，
     *
     *   即当某个线程进入方法，执行其中的指令时，不会被其他线程打断，而别的线程就像自旋锁一样，
     *
     *   一直等到该方法执行完成，才由JVM从等待队列中选择一个另一个线程进入，这只是一种逻辑上的理解。
     *
     *   实际上是借助硬件的相关指令来实现的，不会阻塞线程(或者说只是在硬件级别上阻塞了)。
     */
    private static AtomicBoolean INITIALIZED = new AtomicBoolean(false);

    /**
     * 构造方法
     */
    public EnvironmentContenxtListener() {
        super();
        log.debug("[{}] initialized..."+EnvironmentContenxtListener.class.getSimpleName());
    }
   @PostConstruct
    public  void logEnvInfo(){
       log.info("I'm  init  method  using  @PostConstrut....");
        if(!INITIALIZED.get()){
            log.info(getEnvironmentInfo());
            INITIALIZED.set(true);
        }
    }

    private String getEnvironmentInfo(){
        final Properties properties=System.getProperties();
        final Formatter formatter=new Formatter();
        formatter.format("\n******************** Welcome use limp-framework(中软)  ********************\n");

        formatter.format("LIMP Version: %s\n", Version.getVersion());
        //java jdk安装目录
        formatter.format("Java Home: %s\n", properties.get("java.home"));

        //java 供应商
        formatter.format("Java Vendor: %s\n", properties.get("java.vendor"));
        //java 版本信息
        formatter.format("Java Version: %s\n", properties.get("java.version"));
        formatter.format("OS Architecture: %s\n", properties.get("os.arch"));
        //软件运行环境（操作系统）
        formatter.format("OS Name: %s\n", properties.get("os.name"));
        //操作系统版本
        formatter.format("OS Version: %s\n", properties.get("os.version"));

        formatter.format("Code Source: %s\n", "https://gitee.com/limp-framework/v1.x");

        formatter.format("Bug RECORDS: %s\n", "https://gitee.com/limp-framework/v1.x/issues");

        formatter.format("*******************************************************\n");
        return  formatter.toString();
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("[{}] has loaded the LIMP application context"+
                servletContextEvent.getServletContext().getServerInfo());

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(getEnvironmentInfo());
        return buffer.toString();
    }
}
