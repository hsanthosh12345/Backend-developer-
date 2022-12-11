package testcases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoVal 
{
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);	
System.out.println("enter the phone number: ");
String phone=sc.next();
Pattern pattern=Pattern.compile("[+]?[ ]?[(]?[0-9]{1,3}[.]?[)]?[ ]?[-]?[0-9]{3,7}[ ]?[.]?[-]?[0-9]{4}?");
Matcher matcher = pattern.matcher(phone);
if(matcher.matches())
{
	System.out.println("given number is valid");
}
else{
	System.out.println("given number is not valid");
}
}
}
