package jkl;

import java.io.File;

/**
 * @author wnn
 * @date 2021/3/24-13:34
 * @descriptuion
 */
public class test
{
    public static void main(String[] args) {
        File f = new File("F:\\C实习准备");
        new test().test(f);

    }

    /**
     * 递归遍历文件
     * @param file
     */
    public void test(File file){
        if (file.isFile()){
            System.out.println(file.getAbsolutePath()+" 是文件");
        }else{
            System.out.println(file.getAbsolutePath()+" 是文件夹");
            File[] fs = file.listFiles();//获取当前文件夹下的子文件夹或者文件的file对象
            if (fs != null && fs.length>0){
                for (File f:fs) {
                    test(f);
                }
            }
        }

    }
}
