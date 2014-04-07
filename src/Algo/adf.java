package Algo;


import java.util.Scanner;  
import java.util.ArrayList;  
import java.util.Queue;  
import java.util.LinkedList;  
  
public class adf {  
    // 交换元素  
    public static String swap(String s,int k,int j){  
        char[] c = s.toCharArray();  
        char t = c[k];  
        c[k] = c[j];  
        c[j] = t;  
        return new String(c);  
    }  
    public static int f(String s){  
        ArrayList<String> lis = new ArrayList<String>();    // 记录全部交换结果(检查重复用)  
        Queue<String> queue = new LinkedList<String>();     // 队列(用来测试所有可能)  
        int[] d = {-1,-3,1,3};  // 定义方向(左,上,右,下)  
        queue.offer(s); // 入队  
        lis.add(s);     // 加入记录  
        while(queue.size()>0){  
            String firstStr = queue.poll(); // 出队  
            if(firstStr.equals("ABCDE*")) return 1;// 找到结果,退出  
            int k = firstStr.indexOf("*");  // 找到 "*"号的位置  
            for(int i=0;i<4;i++){    // 左,上,右,下 四个方向都探测  
                int j = k+d[i];  
                if(j>=0&&j<=5){   // 当前方向不越界  
                    String t = swap(firstStr,k,j);  // 交换元素  
                    if(!lis.contains(t)){   // lis 不包含 t  
                        queue.offer(t); // 入队  
                        lis.add(t);     // 添加记录  
                    }  
                }  
            }  
        }  
        return 0;  
    }  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        System.out.println("输入整数n");  
        int n = scan.nextInt();  
        scan.nextLine();  
        String[] s = new String[n];  
        for(int i=0;i<n;i++){  
            s[i] = scan.nextLine(); // 初始数据  
        }  
        for(int i=0;i<n;i++){  
            System.out.println(f(s[i]));    // 得到结果  
        }  
    }  
}  