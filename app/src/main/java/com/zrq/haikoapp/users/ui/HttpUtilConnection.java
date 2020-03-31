package com.zrq.haikoapp.users.ui;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 *此类是http连接connection类型连接方式是post连接
 *使用post键值对的方式传输
 */
public class HttpUtilConnection {

    private static String Url_Post = "http://10.0.2.2:8081/Service/selAllUser";
    //192.168.124.17真机连接ip   模拟器连接ip10.0.2.2

    public static String getConectionByHttp(String Url, Map<String, String> params) {

        StringBuilder sb = new StringBuilder();
        try {

            URL url = new URL(Url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置传输方式post传输
            connection.setRequestMethod("POST");
            //设置允许输出
            connection.setDoOutput(true);
            //设置允许输入
            connection.setDoInput(true);
            //设置连接主机超时（单位：毫秒）
            connection.setConnectTimeout(5000);
            //设置从主机读取数据超时（单位：毫秒）
            connection.setReadTimeout(5000);
            // Post 请求不能使用缓存
            connection.setUseCaches(false);

            if (params != null) {
                //设置输出流用于传输参数到后台
                 OutputStream outputStream = connection.getOutputStream();
                 //设置缓存流
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                writer.write(getStringFromOutput(params));
                //清空缓存
                writer.flush();
                //关闭流释放资源
                writer.close();
                outputStream.close();
            }

            //判断连接成功与否
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));;
                String temp ;
                while ((temp = reader.readLine())!= null){
                    sb.append(temp);
                }
                reader.close();
                Log.i("status","连接成功");
            }else {
                return "connection error:"+connection.getResponseCode();
            }
            //关闭HttpURLConnection连接
            connection.disconnect();
        } catch (Exception e) {
            return e.toString();
        }
        return sb.toString();
    }

    /**
     * 将Map的key和value值以 key1=value1&key2=value2的形式传输
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    private static String getStringFromOutput(Map<String,String> params) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Boolean isfalse = true;

        /**
         * Map.entrySet() 这个方法返回的是一个Set<Map.Entry<K,V>>，Map.Entry
         * 是Map中的一个接口，他的用途是表示一个映射项（里面有Key和Value），
         * 而Set<Map.Entry<K,V>>表示一个映射项的Set,
         * Map.Entry里有相应的getKey和getValue方法
         */
        for (Map.Entry<String,String> entry:params.entrySet()) {
            if(isfalse)
                isfalse = false;
            else
                sb.append("&");
        sb.append(URLEncoder.encode(entry.getKey()));
        sb.append("=");
        sb.append(URLEncoder.encode(entry.getValue()));
        }
        return sb.toString();
    }

}
