package 第2阶段._1_常用API._4_Arrays.字符串中数据排序案例;

import java.util.Arrays;

/*
需求: 有一个字符串, "91, 27, 46. 38. 50", 请写程序实现最终输出结果:"27. 38. 46. 50. 91"
思路:
    1 定义一个字符串
    2 把字符串中的数据存储到一个int类型的数组中
        得到字符串中的数字数据?
            public String[] split(String regex)
        定义一个int数组, 把String[]数组中的每一个元素存储到int数组中
    3 对 int 数组进行排序
    4 把排序后的int数组中的元素进行拼接得到字符串, 这里拼接采用StringBuilder实现
    5 输出接口
*/
public class Stringsort {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        System.out.println(strSort(s));
    }

    public static String strSort(String s) {
        //提取字符串类型的数字
        String[] strArray = s.split(" ");

        //获得int类型的数字数组
        int arr[] = new int[strArray.length];
        for (int i = 0; i<strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        //排序
        Arrays.sort(arr);


        //把排序后的int数组中的元素进行拼接得到字符串, 这里拼接采用StringBuilder实现
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(Integer.valueOf(arr[i])).append(" ");
            }  else {
                sb.append(Integer.valueOf(arr[i]));
            }
        }


        //将StringBuilder转换为String
        String result = sb.toString();

        return result;
    }
}
