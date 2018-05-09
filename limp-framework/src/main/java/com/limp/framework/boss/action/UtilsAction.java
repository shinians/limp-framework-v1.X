package com.limp.framework.boss.action;

import com.limp.framework.boss.service.MenuService;
import com.limp.framework.boss.service.PermissionService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * 工具类action
 * @author:zzh
 * Date: 17-6-27
 * Time: 上午9:14
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/system/util")
public class UtilsAction extends AbstractAction {
    @Autowired
    private PermissionService permissionService;

    @Autowired
    private MenuService menuService;


    @Access(login = false,privilege = false,operationLog = OPERATION.INSERT,operationIntro = "用户下载文件")
    @RequestMapping(value ="down",produces = "text/plain;charset=UTF-8")
    public @ResponseBody void getTreeById(String fileName,HttpServletRequest request,HttpServletResponse response) {
        if(StrUtils.isBlank(fileName)){
            fileName="temp.txt";
        }
        //目的文件路径
        String descPath= StoreControl.getDirPath("FILE.HOME")+ File.separator+fileName;
        try {
            request.getLocales();
            request.getLocalName();
            //清空response
            response.reset();
            //Excel导出
            if (fileName.endsWith(Constant.FILE_POS_XLSX)) {
                response.setContentType("application/vnd.ms-excel");
            } else if (fileName.endsWith(Constant.FILE_POS_JPG)) {
                response.setContentType("application/Image-JPG");
            } else if (fileName.endsWith(Constant.FILE_POS_DOCX)) {
                response.setContentType("application/msword");
            }
             // 2、response.setHeader("Content-disposition", "attachment;filename="+fileName);//弹窗关键代码

            // 解决下载的文件名为中文时的乱码问题
             response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("gbk"),"ISO-8859-1"));
            /** 1、 response.setHeader("Content-Disposition", "attachment; filename="  + URLEncoder.encode(fileName, "UTF-8"));**/
            File file=new File(descPath);
            if(file.exists()){
                //输入流
                InputStream fis = new BufferedInputStream(new FileInputStream(file));
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                fis.close();
                OutputStream out = new BufferedOutputStream(response.getOutputStream());
                out.write(buffer);
                out.flush();
                out.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*************************页面跳转*begin************************************/

    /*************************页面跳转*end************************************/


}
