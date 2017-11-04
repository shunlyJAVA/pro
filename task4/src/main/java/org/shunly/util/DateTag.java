package org.shunly.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTag extends TagSupport {
    private  String value;

    @Override
    public int doStartTag() throws JspException{
        String vv = "" + value;
        //去除value前后的空白，转换成long
        long time = Long.valueOf(vv.trim());
        //获取指定点时间
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(time);
        //创建一个解析出来的时间模板
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //得到格式化时间的字符串s
        String s = dateFormat.format(time);
        try {
            //写入jsp
            pageContext.getOut().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  super.doStartTag();
    }

    public void setValue(String value){
        this.value = value;
    }
}
