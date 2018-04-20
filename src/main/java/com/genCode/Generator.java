package com.genCode;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * created by zhoufei 20180307
 * 生成Controller
 */
public class Generator {

    //代码生成的路径
    private static String genFilePath = "W:\\111\\";
    // 实体类名数组
    private static String[] domainName1 = {"Role","DataRole"};
    //实体类描述
    private static String[] domainNameDesc1 = {"角色", "数据角色"};

    private static int len = domainName1.length;
    // 包名
    private static String packageName = "com.anso.auth.server.web";
    //
    static String templateDir = "\\src\\main\\resources\\vm\\";
    // 完整模板路径
    static String sourcePath = System.getProperty("user.dir")+templateDir;

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String []args) throws Exception {
            for(int i = 0; i < len; i++ ){
                generateSingle(domainName1[i],domainNameDesc1[i]);
            }
        System.out.println("生成成功");

    }

    private static String firstCharToLowCase(String s) {
        return s.substring(0,1).toLowerCase()+ s.substring(1,s.length());
    }

    public static void generateSingle(String domainName, String domainNameDesc) throws IOException {
        Map<String,String> map = new HashMap();
        map.put("controller.vm","controller/" + domainName + "Controller.java");
        map.put("service.vm","service/" + domainName + "Service.java");
        map.put("serviceImpl.vm","service/impl/" + domainName + "ServiceImpl.java");
        map.put("form.vm","form/" + domainName + "Form.java");
        for(Map.Entry<String,String>  entry : map.entrySet()) {
            String  templateFile =  entry.getKey();
            String  targetFile  = genFilePath+entry.getValue();

            Properties pro = new Properties();
            pro.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
            pro.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
            pro.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, sourcePath);
            VelocityEngine ve = new VelocityEngine(pro);

            VelocityContext context = new VelocityContext();
            context.put("domainName", domainName);
            context.put("packageName", packageName);
            context.put("domain", firstCharToLowCase(domainName));
            context.put("domainNameDesc",domainNameDesc);

            Template t = ve.getTemplate(templateFile, "UTF-8");

            File file = new File(targetFile);
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            if (!file.exists())
                file.createNewFile();

            FileOutputStream outStream = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(outStream,
                    "UTF-8");
            BufferedWriter sw = new BufferedWriter(writer);
            t.merge(context, sw);
            sw.flush();
            sw.close();
            outStream.close();
        }
    }


}