
/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;*/
import java.util.*;
class NMorse
{
public static void main(String[] args)
{
String s1 = "．．/．━．．/━ ━ ━/．．．━/．/━．━ ━/━ ━ ━/．．━";
String s2 = "ILOVEYOU";
method_1(s1);
method_2(s2);
}
public static void method_1(String s)//执行摩斯码转换字母
{
String[] st = s.split("/");
HashMap<String,String> hm = new HashMap<String,String>();
hm.put("．━","A");
hm.put("━．．．","B");
hm.put("━ ．━．","C");
hm.put("━ ．．","D");
hm.put("．","E");
hm.put("．．━．","F");
hm.put("━ ━．","G");
hm.put("．．．．","H");
hm.put("．．","I");
hm.put("．━ ━ ━","J");
hm.put("━ ．━","K");
hm.put("．━．．","L");
hm.put("━ ━","M");
hm.put("━．","N");
hm.put("━ ━ ━","O");
hm.put("．━ ━．","P");
hm.put("━ ━．━","Q");
hm.put("．━ ．","R");
hm.put("．．．","S");
hm.put("━","T");
hm.put("．．━","U");
hm.put("．．．━","V");
hm.put("．━ ━","W");
hm.put("━ ．．━","X");
hm.put("━．━ ━","Y");
hm.put("━ ━ ．．","Z");
for(int x=0;x<st.length;x++)
{
System.out.print(hm.get(st[x]));
}
}
public static void method_2(String s)//执行字母转换摩斯码
{
String st = s.toUpperCase();
char[] buf = st.toCharArray();
String val ="";
HashMap<String,String> hm = new HashMap<String,String>();
hm.put("A","．━");
hm.put("B","━．．．");
hm.put("C","━ ．━．");
hm.put("D","━ ．．");
hm.put("E","．");
hm.put("F","．．━．");
hm.put("G","━ ━．");
hm.put("H","．．．．");
hm.put("I","．．");
hm.put("J","．━ ━ ━");
hm.put("K","━ ．━");
hm.put("L","．━．．");
hm.put("M","━ ━");
hm.put("N","━．");
hm.put("O","━ ━ ━");
hm.put("P","．━ ━．");
hm.put("Q","━ ━．━");
hm.put("R","．━ ．");
hm.put("S","．．．");
hm.put("T","━");
hm.put("U","．．━");
hm.put("V","．．．━");
hm.put("W","．━ ━");
hm.put("X","━ ．．━");
hm.put("Y","━．━ ━");
hm.put("Z","━ ━ ．．");
	for(int x=0;x<buf.length;x++){
		val=(String)hm.get(buf[x]+"");
		val+="/";
		System.out.print(val);
	}
	System.out.println();
	for(int x=0;x<buf.length;x++){
		System.out.print(hm.get(buf[x]+""));
		System.out.print("/");
	}
}
}