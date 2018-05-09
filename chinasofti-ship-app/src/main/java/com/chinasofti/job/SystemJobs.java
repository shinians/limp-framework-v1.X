package com.chinasofti.job;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-4-13
 * Time: 下午9:36
 * To change this template use ser
 * File | Settings | File Templates.
 */
public class SystemJobs {
   /* @Autowired
    private UserService userService;
*/

    private static Logger log = Logger.getLogger(SystemJobs.class.getName());

    //定时任务
    public void run(){
        log.info("*************定时任务执行----DATA-WEB-SITE************");
    }

}
