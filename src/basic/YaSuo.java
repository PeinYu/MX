package basic;

import java.util.Scanner;

public class YaSuo { 
/**
* Ñ¹Ëõ×Ö·û´®±ÈÈçAABBC Ñ¹ËõÎªA2B2C
*/
public static void main(String[] args) {
while(true){
InString();

}
}
public static void InString(){
System.out.println("ÇëÊäÈëÒ»´®×Ö·û:");
String s=new Scanner(System.in).nextLine();
yaSuo01(s);
}
public static void yaSuo01(String s){

int j=1;
StringBuilder buf=new StringBuilder();
char[] ch1=s.toCharArray();


for(int i=0;i<s.length()-1;i++){
if(ch1[i]==ch1[i+1]) {
j++;
if(i==s.length()-2){

buf.append(ch1[i]);
buf.append(j);

}

}
else{
if(j==1)buf.append(ch1[i]);


else {
buf.append(ch1[i]);
buf.append(j);

}
if(i==s.length()-2)buf.append(ch1[i+1]);
j=1;

}
}

System.out.println("Ñ¹ËõÎª:");
System.out.println(buf);
}
}