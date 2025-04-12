package org.util.prop;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    private static Properties properties;
    /**
     * Mohammad Shahnawaz
     * @param key
     * @return
     */
    public static String get(String key) throws Exception {
        loadFile(); // loading the properties file
        if(properties.containsKey(key)){
            return  properties.getProperty(key);
        }else {
            throw new Exception(key + "=> Key not found");
        }
    }
    private static void loadFile(){
    properties=new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(FilesPath.CONFIG_FILE));
            properties.load(fileInputStream);
        }catch (FileNotFoundException fne){fne.printStackTrace();}
        catch (IOException io){io.printStackTrace();}
        finally {
//            if(properties!=null) {
//                properties.clear();
//            }
        }
    }
}
