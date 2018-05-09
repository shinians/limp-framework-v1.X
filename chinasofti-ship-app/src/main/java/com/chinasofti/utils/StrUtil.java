package com.chinasofti.utils;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtil {


    public static String getFileType(String name) {
        int pos = name.lastIndexOf(".");
        String tail = name.substring(pos + 1);
        tail = tail.toLowerCase();
        return tail;
    }


    //取两位小数
    public static String parserNum(double value) {
        String valueStr = String.valueOf(value);
        if (valueStr.length() - valueStr.indexOf(".") > 3) {
            valueStr = valueStr.substring(0, valueStr.indexOf(".") + 3);
        }
        return valueStr;

    }



    /**
     * 生成 文档 主键
     * 三位前缀 + 后续字符串
     */

    public static String getUUID(String prefix) {
        String s = UUID.randomUUID().toString();
        return prefix + s.substring(3, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }

    /**
     * 取字符串中的年
     *
     * @param str
     * @return
     */
    public static String getStrYear(String str) {
        String reg = "(19|20)[0-9]{2}";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {// matcher.matchers() {
            String yearStr = matcher.group();
            return yearStr;
        }
        return null;
    }
    public  static int getStrLength(String str){
        String reg="\\s{2,}||\\n{2,}";
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find()){
            str=str.replaceAll(reg,"");
        }
        return str.length();
    }
    /**
     * 初始化标准摘要【根据*****找到相应位置】
     * 有*的截取星之前的为摘要，没有*的content长度并且大于500的就截取前170个字符作为
     * */

    public static String getDocAbst(String content){
        //用文本编辑器换行符号都是<br /> ，所以都替换成<br />
        String reg="(<br>\\s*){2,}";
        if(content.indexOf("**********")>-1){
            return   content.substring(0, content.indexOf("**********")).replaceAll(reg,"<br />");
        }
        if(content.length()>1200){
            return content.substring(0,1100).replaceAll(reg,"<br />");
        }
        return content.replaceAll(reg,"<br />");
    }
    public static String formatAbstIndex(String abst){
        String reg="(<br />)|(\r\n)|(\\n)";  //<br>不要过掉，在页面显示用
        return abst.replaceAll(reg,"");
    }
    public static String getDocIntro(String content){
        String reg="(<br>)|<br/>|(\\s{2,})";
        if(content.length()>300){
            //简介部分截取290个字符，然后编辑，去掉\n <br>最后显示170个字符
            String str= content.substring(0,290);
            return str.replaceAll(reg,"");
        }
        return content.replaceAll(reg,"");
    }
    //在前台显示用，相当于搜索出来的片区
    public static String showDocIntro(String intro){
        String reg="(<br>)|(\\s{2,})"; //不要过滤掉<br/>,规章制度的前台显示用
        String str=intro.replaceAll(reg,"");
        if(str.length()>170){
            //最后显示170个字符  ,再次过滤掉中文状态下的空格
            return  str= intro.substring(0,160).replaceAll(String.valueOf(((char)12288)),"");
        }
        return str.replaceAll(String.valueOf(((char)12288)),"");
    }
    public static String formatDate(String date){
        String reg="\\s" ;
        String strDate=date.replaceAll(reg,"");
        if(strDate.length()>4){
            return strDate.substring(0,4);
        }
        return strDate;
    }
    public static String OADate(String date){
        String reg="\\s" ;
        String strDate=date.replaceAll(reg,"");
        if(strDate.length()>24){
            return strDate.substring(0,23);
        }
        return strDate;
    }

    /**
     * 是否word文档
     *
     * @param fileName
     * @return
     */
    public static boolean isWord(String fileName) {
        String postFix = fileName.substring(fileName.lastIndexOf(".") + 1);
        postFix = postFix.toLowerCase();
        if ("doc".equals(postFix) || "docx".equals(postFix)) {
            return true;
        }
        return false;
    }

    /**
     * 清除后缀
     *
     * @param fileName
     * @return
     */
    public static String clearSurrfix(String fileName) {
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        if (name == null || "".equals(name)) {
            return fileName;
        }
        return name;
    }

    /**
     * 过滤solr的字符串
     *
     * @return
     */
    public static String filterSolrQueryStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // These characters are part of the query syntax and must be escaped
            if (c == '\\' || c == '+' || c == '-' || c == '!' || c == '(' || c == ')' || c == ':'
                    || c == '^' || c == '[' || c == ']' || c == '{' || c == '}' || c == '~'
                    || c == '*' || c == '?' || c == '|' || c == '&' || c == ';' || c == '/'
                    || Character.isWhitespace(c)) {
                sb.append('\\');
            }
            sb.append(c);
        }
        // System.out.println(sb.toString());
        return sb.toString();
    }


    public static void main(String[] args) {

    }


}
