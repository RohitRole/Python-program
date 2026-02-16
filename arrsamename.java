public class arrsamename
{
public static void main(String[] arg)
{
String[] stud = {"Rohini","Rani","Bani","Tani","Sani","Rani","sam","Rani","jam"};

int c=0;
System.out.println("student with same name");

for(int i=0; i<stud.length; i++)
{
for(int j=i + 1; j<stud.length ;j++)
{
if(stud[i].equals(stud[j]))
{
System.out.println(stud[i]);

c++;
}
}
}
System.out.println("total"+c);
}
}