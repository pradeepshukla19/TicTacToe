import java.io.*;
class TicTacToe
{
public static void main(String[] args)throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a[][]=new char[3][3];
int i, j, d=0, an1=0, am2=0,q10=0,p10=0,q11=0,p11=0,p12=0,q12=0,q22=0,p22=0,q3=0,p3=0,q4=0,p4=0,q21=0,p21=0,q20=0,p20=0 ,k=0,q=0,pq=0,np=0,qs=0;
char m='X', n='O';
String v="";//null
System.out.println("\t\t\t--------------------------------");
System.out.println("\t\t\t"+"********TIC TAC TOE*********");
System.out.println("\t\t\t--------------------------------");
System.out.println();
System.out.println("SAMPLE BOARD");
System.out.println("------------");


for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print("|"+" "+"("+i+","+j+")"+" "+"|");
System.out.println();
System.out.println("----------------------------");
}
System.out.println();
System.out.println("LET THE GAME START!!!");
System.out.println();
System.out.println("X"+" vs "+"O");
System.out.println();
System.out.println("THE FIRST PLAYER GETS "+"X"+" AND THE SECOND PLAYER GETS "+"O.");
System.out.println();
System.out.println("ENTER CHOICE IN "+"("+"x"+","+"y"+")"+" AS IN SAMPLE BOARD.");
System.out.println();
int s=2;

while(d<=9||true)
{
d++;

System.out.println("ENTER CHOICE");
v=br.readLine();
an1=Integer.parseInt((v.substring(0,1)));
am2=Integer.parseInt((v.substring((v.length()-1),(v.length()))));

if (an1>2|| am2>2)
{
System.out.println("WRONG INPUT");
System.out.println("Play Again");
k=1;
break;
}

if(d%2!=0)
a[an1][am2]=m;
else
a[an1][am2]=n;

q3=0;p3=0;q4=0;p4=0;
s=2;
if (d>=3 && q!=1)
{

for(i=0;i<3;i++)
{
q10=0;p10=0;q11=0;p11=0;p12=0;q12=0;q22=0;p22=0;q21=0;p21=0;q20=0;p20=0;
for(j=0;j<3;j++)
{
if(a[0][j]=='X')//ROW
q10++;
if(a[0][j]=='O')
p10++;

if(a[1][j]=='X')//ROW
q11++;
if(a[1][j]=='O')
p11++;

if(a[2][j]=='X')//ROW
q12++;
if(a[2][j]=='O')
p12++;




if(a[j][0]=='X')//COLUMN
q20++;
if(a[j][0]=='O')
p20++;

if(a[j][1]=='X')//COLUMN
q21++;
if(a[j][1]=='O')
p21++;

if(a[j][2]=='X')//COLUMN
q22++;
if(a[j][2]=='O')
p22++;


if(i==j)//LEFT DIAGONAL
{
if(a[i][j]=='X')
q3++;
if(a[i][j]=='O')
p3++;
}

if(j==(s))//RIGHT DIAGONAl
{
if(a[i][j]=='X')
q4++;
if(a[i][j]=='O')
p4++;
}

if((q10==3 || q11==3 || q12==3 || q20==3 ||q21==3||q22==3||q3==3||q4==3))
{q=1;break; }
else if(p10==3 || p11==3 || p12==3 || p20==3 ||p21==3||p22==3||p3==3||p4==3)
{q=1;break; }

}//end of inner for loop

s--;

if (q==1)
{
qs=1;
break;
}


}//end of outer for loop
}// end of if





for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print("|"+"   "+a[i][j]+"   "+"|");
System.out.println();
System.out.println("---------------------------");

}

System.out.println();




if(qs==1)
{
pq=1;
break;
}
  
if(d==9)
break;
}//end of while loop



if(pq==1)
{
if(q10==3 || q11==3 || q12==3 || q20==3 ||q21==3||q22==3||q3==3||q4==3)
{
System.out.println("---------------------------");
System.out.println("X WINS CONGRATULATIONS!!!!!");
System.out.println("---------------------------");
}
else if(p10==3 || p11==3 || p12==3 || p20==3 ||p21==3||p22==3||p3==3||p4==3)
{
System.out.println("---------------------------");
System.out.println("O WINS CONGRATULATIONS!!!!!");
System.out.println("---------------------------");
}
}

else
{
    if(k!=1)
    {
System.out.println("---------------------------");
System.out.println("          =>DRAW<=    ");
System.out.println("---------------------------");
}
}

}
}