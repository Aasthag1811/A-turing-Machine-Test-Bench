package logic;

import java.util.Scanner;

public class Logic 
{
	static Scanner sc=new Scanner(System.in);
	public static void ww()
	{
		String mac1[][]=new String[15][15];
		int i=1,start=1,finala=14,len;
		String inp=new String();
		char array[]=new char[50];
		int w,j=1;
		char ch;
		while(i<15)
		{
			j=1;
			while(j<15)
			{
				mac1[i][j]="-";
				j++;
			}
			i++;
		}
		mac1[1][2]="b,b,r/a,a,r";
		mac1[1][3] = "#,#,l";
	    mac1[2][1] = "b,b,r/a,a,r";
		mac1[3][4] = "a,A,l/b,B,l";
		mac1[4][4] = "b,b,l/a,a,l";
		mac1[4][5] = "A,A,r/#,#,r/B,B,r";
		mac1[5][6] = "a,A,r/b,B,r";
		
		mac1[6][6] = "y,y,r/x,x,r";
		mac1[6][7] = "a,a,r/b,b,r";
		mac1[6][8] = "A,x,l";
		mac1[6][9] = "B,y,l";
		mac1[6][14] = "#,#,l";
		mac1[7][3]= "A,A,l/B,B,l";
		mac1[7][7] = "a,a,r/b,b,r";
		mac1[8][8] = "y,y,l/x,x,l/B,B,l/A,A,l";
		mac1[8][10] = "Y,Y,r/X,X,r/#,#,r";
		mac1[9][9]= "A,A,l/B,B,l/y,y,l/x,x,l";
		mac1[9][11] = "Y,Y,r/X,X,r/#,#,r";
		mac1[10][12] = "A,X,r";
		mac1[11][13] = "B,Y,r";
		mac1[12][6]= "x,x,r/y,y,r";
		mac1[12][12] = "A,A,r/B,B,r";
		mac1[13][6]= "x,x,r/y,y,r";
		mac1[13][13] = "A,A,r/B,B,r";
		i=1;
		while(i<15)
		{
			System.out.print("         q" + i);
			i++;
		}
		System.out.println();
		i=1;
		j=1;
		while(i<15)
		{
			System.out.print("q"+i);
			while(j<15)
			{
				System.out.print("      " +mac1[i][j]);
				j++;
			}
			System.out.println();
			i++;
			j=1;
			System.out.println();
		}
	    int k=0;
	    while(k<50)
	    {
	    	array[k]='#';
	    	k++;
	    }
	    int a=1;
	    while(a==1)
	    {
	    	System.out.print("Enter the input    ");
	    	inp=sc.next();
	    	i=0;
	    	w=10;
	    	len=inp.length();
	    	while(i!=len)
	    	{
	    		array[w]=inp.charAt(i);
	    		i++;
	    		w++;
	    	}
	    	int index=-1,x=0;
	    	w=10;
	    	i=1;
	    	j=1;
	    	while(i<14)
	    	{
	    		while(j<15)
	    		{
	    			int l=mac1[i][j].length();
	    			int var=0;
	    			while(x<l)
	    			{
	    				ch=mac1[i][j].charAt(x);
	    				if(array[w]==ch)
	    				{
	    					index=x;
	    				if(index!=1)
	    				{
	    					if(index==0)
	    					{
	    						while(var<w)
	    						{
	    							System.out.print(array[var]);
	    							var++;
	    						}
	    						System.out.print(" q"+i+" ");
	    						while(var<50)
	    						{
	    							System.out.print(array[var]);
	    							var++;
	    						}
	    						System.out.println();
	    						array[w]=mac1[i][j].charAt(index+2);
	    						if(mac1[i][j].charAt(index+4)=='l')
	    							w--;
	    						else
	    							w++;
	    						i=j;
	    						j=0;
	    						break;
	    					}
	    					    else if(mac1[i][j].charAt(index-1)=='/')
	    					    {
	    						   while(var<w)
	    						   {
	    							   System.out.print(array[var]);
	    						       var++;
	    						   }
	    						   System.out.print(" q"+i+" ");
	    						   while(var<50)
	    						   {
	    							   System.out.print(array[var]);
	    							   var++;
	    					   	   }
	    						   System.out.println();
	    						   array[w]=mac1[i][j].charAt(index+2);
	    						   if(mac1[i][j].charAt(index+4)=='l')
	    							   w--;
	    						   else
	    							   w++;
	    						   i=j;
	    						   j=0;
	    						   break;
	    					    }
	    				    }
	    			   }
	    			   x++;
	    		   }
	               x=0;
	               j++;
	    	}
	    	if(index==-1)
	    	{
	    		x=0;
	    		break;
	    	}
	    	j=1;
	    	x=0;
	    	index=-1;
	    }	    	
	    if(i==14)
	    	System.out.println("Input is accepted");
	    else
	    	System.out.println("Input is rejected");
	    System.out.println("Do you want to enter another input for the same machine?Press 1 for yes else press 0");
	    a=sc.nextInt();
	    int ind=0;
	    while(ind<50)
	    {
	    	array[ind]='#';
	    	ind++;
	    }
	}
	}
	public static void comp()
	{
		String mac1[][]=new String[5][5];
		int i=1,start=1,finala=4,var=0,len=0;
		String inp=new String();
		char ch;
		char array[]=new char[50];
		int w,j=1;
		while(i<5)
		{
			while(j<5)
			{
				mac1[i][j]="-";
				j++;
			}
			j=1;
			i++;
		}
		mac1[1][1] = "1,1,r/0,0,r";
		mac1[1][2] = "#,#,l";
		mac1[2][2] = "0,0,l";
		mac1[2][3] = "1,1,l";
		mac1[3][3] = "1,0,l/0,1,l";
		mac1[3][4] = "#,#,r";
		i = 1;
		while(i<5)
		{
			System.out.print("         q"+i);
			i++;
		}
		System.out.println();
		i=1;
		j=1;
		while(i<5)
		{
			System.out.print("q"+i);
			while(j<5)
			{
				System.out.print("      " +mac1[i][j]);
				j++;
			}
			System.out.println();
			i++;
			j=1;
			System.out.println();
		}
		int k=0;
		while(k<50)
		{
			array[k]='#';
			k++;
		}
		int a=1;
		while(a==1)
		{
			System.out.print("Enter the input:\t");
			inp=sc.next();
			i=0;
			w=10;
			len=inp.length();
			while(i!=len)
			{
				array[w]=inp.charAt(i);
				i++;
				w++;
			}
			int index=-1;
			int x=0;
			w=10;
			i=1;
			j=1;
			while(i<4)
			{
				while(j<5)
				{
					var=0;
					int l=mac1[i][j].length();
					while(x<l)
					{
						ch=mac1[i][j].charAt(x);
						if(array[w]==ch)
						{
							index=x;
							if(index!=-1)
							{
								if(index==0)
								{
								while(var<w)
								{
									System.out.print(array[var]);
									var++;
								}
								System.out.print(" q"+i+" ");
								while(var<50)
								{
									System.out.print(array[var]);
									var++;
								}
								System.out.println();
								array[w]=mac1[i][j].charAt(index+2);
								if(mac1[i][j].charAt(index+4)=='l')
									w--;
								else
									w++;
								i=j;
								j=0;
								break;
							}
							else if(mac1[i][j].charAt(index-1)=='/')
							{
								while(var<w)
								{
									System.out.print(array[var]);
									var++;
								}
								System.out.print(" q"+i+" ");
								while(var<50)
								{
									System.out.print(array[var]);
									var++;
								}
								System.out.println();
								array[w]=mac1[i][j].charAt(index+2);
								if(mac1[i][j].charAt(index+4)=='l')
									w--;
								else
									w++;
								i=j;
								j=0;
								break;
							}
						}
					}
					x++;
				}
				x=0;
				j++;
			}
			if(index==-1)
			{
				x=0;
				break;
			}
			j=1;
			x=0;
			index=-1;
		}
		int z=len+10;
		w=10;
		while(w<z)
		{
			System.out.print(array[w]);
			w++;
		}
		System.out.println();
		System.out.println("Do you want to enter another input for the same machine?Press 1 for yes else press 0");
		a=sc.nextInt();
		int ind=0;
		while(ind<50)
		{
			array[ind]='#';
			ind++;
		}
	}
	}
	public static void acceptors()
	{
		int num,a=1,b=1;
		while(a==1)
		{
			System.out.println("Enter number of states:\t");
			num=sc.nextInt();
			String mac1[][]=new String[num+1][num+1];
			int mac2[][]=new int[num+1][num+1];
			int e=0,count=0,i=1,start,n;
			System.out.println("Enter start state:\t");
			start=sc.nextInt();
			System.out.println("Enter number of final states:\t");
			n=sc.nextInt();
			int finala[]=new int[n];
			System.out.println("Enter the final states:\t");
			i=0;
			while(i<n)
			{
				finala[i]=sc.nextInt();
				i++;
			}
			i=1;
			int var=0,u=1,len=0,w,j=1;
			String inp,input;
			char ch;
			char array[]=new char[50];
			while(i<=num)
			{
				while(j<=num)
				{
					mac1[i][j]="-";
					mac2[i][j]=1;
					j++;
				}
				j=1;
				i++;
			}
			j=1;
			i=1;
			int trans;
			System.out.println("Enter number of transitions:\t");
			trans=sc.nextInt();
			int ex=0;
a:         while(count==1||ex==0)
		   {
	        ex=1;
			int m=1;
			while(m<=trans)
			{
				System.out.println("TRANSITION NUMBER "+m);
				System.out.print("Start state: ");
				i=sc.nextInt();
				System.out.println();
				System.out.print("End state: ");
				j=sc.nextInt();
				System.out.println();
				System.out.println("Transition: ");
				mac1[i][j]=sc.next();
				mac2[i][j]=mac1[i][j].length();
				m++;
			}
			i=1;
			j=1;
			while(i<num)
			{
				count=0;
				input="";
				while(j<=num)
				{
					if(mac2[i][j]!=1)
					{
						input=input+mac1[i][j];
						input=input+"/";
					}
					j++;
				}
				j=1;
				int p=input.length();
				char ar[]=new char[p];
				while(e<p)
				{
					ar[e]='-';
					e++;
				}
				e=0;
				if(input!="")
				{
				ar[0]=input.charAt(0);
				u=1;
				int d=1;
				while(d<input.length())
				{
					if(input.charAt(d-1)=='/')
					{
						ar[u]=input.charAt(d);
						u++;
					}
					d++;
				}
				int h=0;
				while(h<u)
				{
					int r=h+1;
					while(r<u)
					{
						if(ar[h]==ar[r])
							count=1;
						r++;
					}
					h++;
				}
				}
				if(count==1)
				{
					System.out.println("Wrong transition entered please enter all transition again");
					count=0;
					ex=0;
					m=1;
					int x=1;
					int y=1;
					while(x<=num)
					{
						while(y<=num)
						{
							mac1[x][y]="-";
							mac2[x][y]=1;
							y++;
						}
						y=1;
						x++;
					}
				     continue a;
				}
				i++;
			}
			i=1;
			while(i<=num)
			{
				System.out.print("         q" + i);
				i++;
			}
			System.out.println();
			i=1;
			j=1;
			while(i<=num)
			{
				System.out.print("q" + i);
				while(j<=num)
				{
					System.out.print("    " + mac1[i][j]);
					j++;
				}
				System.out.println();
				i++;
				j=1;
				System.out.println();
			}
            int k=0;
            while(k!=50)
            {
            	array[k]='#';
            	k++;
            }
            b=1;
            while(b==1)
            {
            	System.out.print("Enter the input");
            	inp=sc.next();
            	i=0;
            	w=10;
            	len=inp.length();
            	while(i<len)
            	{
            		array[w]=inp.charAt(i);
            		i++;
            		w++;
            	}
            	int index=-1,x=0;
            	w=10;
            	i=1;
            	j=1;
            	while(i<num)
            	{
            		while(j<=num)
            		{
            			var=0;
            			int l=mac1[i][j].length();
            			while(x<l)
            			{
            				ch=mac1[i][j].charAt(x);
            				if(array[w]==ch)
            				{
            					index=x;
            					if(index!=-1)
            					{
            						if(index==0)
            						{
            							while(var<w)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.print(" q"+i+" ");
            							while(var<50)            								
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.println();
            							array[w]=mac1[i][j].charAt(index+2);
            							if(mac1[i][j].charAt(index+4)=='l')
            								w--;
            							else if(mac1[i][j].charAt(index+4)=='r')
            								w++;
            							else if(mac1[i][j].charAt(index+4)=='s')
            								w=w;
            							else
            							{
            								System.out.print("You have tried to move the read-write head to a wrong position,please enter all the transitions again");
            								m=1;
            								count=0;
            								ex=0;
            								x=1;
            								int y=1;
            								while(x<=num)
            								{
            									while(y<=num)
            									{
            										mac1[x][y]="-";
            										mac2[x][y]=1;
            										y++;
            									}
            									y=1;
            									x++;
            								}
            								continue a;
            							}
            							i=j;
            							j=0;
            							break;
            						}
            						else if(mac1[i][j].charAt(index-1)=='/')
            						{
            							while(var<w)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.print(" q"+i+" ");
            							while(var<50)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.println();
            							array[w]=mac1[i][j].charAt(index+2);
            							if(mac1[i][j].charAt(index+4)=='l')
            								w--;
            							else if(mac1[i][j].charAt(index+4)=='r')
            								w++;
            							else if(mac1[i][j].charAt(index+4)=='s')
            								w=w;
            							else
            							{
            								System.out.println("You have tried to move the read-write head to a wrong position,please enter all the transitions again");
            								m=1;
            								count=0;
            								ex=0;
            								x=1;
            								int y=1;
            								while(x<=num)
            								{
            									while(y<=num)
            									{
            										mac1[x][y]="-";
            										mac2[x][y]=1;
            										y++;
            									}
            									y=1;
            									x++;
            								}
            								continue a;
            							}
            							i=j;
            							j=0;
            							break;
            						}
            					}
            				}
            				x++;
            			}
            			x=0;
            			j++;
            		}
            		if(index==-1)
            		{
            			x=0;
            			break;
            		}
            		j=1;
            		x=0;
            		index=-1;
            	}
            	int z=len+10;
            	System.out.println();
            	j=1;
            	k=0;
            	int f=0;
            	while(k<n)
            	{
            		if(i==finala[k])
            		{
            			System.out.println("Input accepted");
            			f=1;
            			break;
            		}
            		k++;
            	}
            	if(f==0)
            		System.out.println("Input rejected");
            	System.out.println("Do you want to enter another input for the same machine??Press 1 for yes else press 0");
                b=sc.nextInt();
                int ind=0;
                while(ind<50)
                {
                	array[ind]='#';
                	ind++;
                }
            }
            System.out.println("Do you want to enter another acceptor machine?Press 1 for yes else press 0");
            a=sc.nextInt();
		   }
	    }
	}
	public static void transducers()
	{
		int num,a=1,b=1;
		while(a==1)
		{
			System.out.println("Enter number of states:\t");
			num=sc.nextInt();
			String mac1[][]=new String[num+1][num+1];
			int mac2[][]=new int[num+1][num+1];
			int e=0,count=0,i=1,start,n;
			System.out.println("Enter start state:\t");
			start=sc.nextInt();
			System.out.println("Enter number of final states:\t");
			n=sc.nextInt();
			int finala[]=new int[n];
			System.out.println("Enter the final states:\t");
			i=0;
			while(i<n)
			{
				finala[i]=sc.nextInt();
				i++;
			}
			i=1;
			int var=0,u=1,len=0,w,j=1;
			String inp,input;
			char ch;
			char array[]=new char[50];
			while(i<=num)
			{
				while(j<=num)
				{
					mac1[i][j]="-";
					mac2[i][j]=1;
					j++;
				}
				j=1;
				i++;
			}
			j=1;
			i=1;
			int trans;
			System.out.println("Enter number of transitions:\t");
			trans=sc.nextInt();
			int ex=0;
a:			while(count==1||ex==0)
            {
	        ex=1;
			int m=1;
			while(m<=trans)
			{
				System.out.println("TRANSITION NUMBER "+m);
				System.out.print("Start state: ");
				i=sc.nextInt();
				System.out.println();
				System.out.print("End state: ");
				j=sc.nextInt();
				System.out.println();
				System.out.println("Transition: ");
				mac1[i][j]=sc.next();
				mac2[i][j]=mac1[i][j].length();
				m++;
			}
			i=1;
			j=1;
			while(i<num)
			{
				count=0;
				input="";
				while(j<=num)
				{
					if(mac2[i][j]!=1)
					{
						input=input+mac1[i][j];
						input=input+"/";
					}
					j++;
				}
				j=1;
				int p=input.length();
				char ar[]=new char[p];
				while(e<p)
				{
					ar[e]='-';
					e++;
				}
				e=0;
				if(input!="")
				{
				ar[0]=input.charAt(0);
				u=1;
				int d=1;
				while(d<input.length())
				{
					if(input.charAt(d-1)=='/')
					{
						ar[u]=input.charAt(d);
						u++;
					}
					d++;
				}
				int h=0;
				while(h<u)
				{
					int r=h+1;
					while(r<u)
					{
						if(ar[h]==ar[r])
							count=1;
						r++;
					}
					h++;
				}
				}
				if(count==1)
				{
					System.out.println("Wrong transition entered please enter all transition again");
					count=0;
					ex=0;
					int x=1;
					int y=1;
					while(x<=num)
					{
						while(y<=num)
						{
							mac1[x][y]="-";
							mac2[x][y]=1;
							y++;
						}
						y=1;
						x++;
					}
					continue a;
				}
				i++;
			}
			i=1;
			while(i<=num)
			{
				System.out.print("         q" + i);
				i++;
			}
			System.out.println();
			i=1;
			j=1;
			while(i<=num)
			{
				System.out.print("q" + i);
				while(j<=num)
				{
					System.out.print("      " + mac1[i][j]);
					j++;
				}
				System.out.println();
				i++;
				j=1;
				System.out.println();
			}
            int k=0;
            while(k!=50)
            {
            	array[k]='#';
            	k++;
            }
            b=1;
            while(b==1)
            {
            	System.out.print("Enter the input");
            	inp=sc.next();
            	i=0;
            	w=10;
            	len=inp.length();
            	while(i<len)
            	{
            		array[w]=inp.charAt(i);
            		i++;
            		w++;
            	}
            	int index=-1,x=0;
            	w=10;
            	i=1;
            	j=1;
            	while(i<num)
            	{
            		while(j<=num)
            		{
            			var=0;
            			int l=mac1[i][j].length();
            			while(x<l)
            			{
            				ch=mac1[i][j].charAt(x);
            				if(array[w]==ch)
            				{
            					index=x;
            					if(index!=-1)
            					{
            						if(index==0)
            						{
            							while(var<w)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.print(" q"+i+" ");
            							while(var<50)            								
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.println();
            							array[w]=mac1[i][j].charAt(index+2);
            							if(mac1[i][j].charAt(index+4)=='l')
            								w--;
            							else if(mac1[i][j].charAt(index+4)=='r')
            								w++;
            							else if(mac1[i][j].charAt(index+4)=='s')
            								w=w;
            							else
            							{
            								System.out.print("You have tried to move the read-write head to a wrong position,please enter all the transitions again");
            								ex=0;
            								count=0;
            								x=1;
            								int y=1;
            								while(x<=num)
            								{
            									while(y<=num)
            									{
            										mac1[x][y]="-";
            										mac2[x][y]=1;
            										y++;
            									}
            									y=1;
            									x++;
            								}
            								continue a;
            							}
            							i=j;
            							j=0;
            							break;
            						}
            						else if(mac1[i][j].charAt(index-1)=='/')
            						{
            							while(var<w)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.print(" q"+i+" ");
            							while(var<50)
            							{
            								System.out.print(array[var]);
            								var++;
            							}
            							System.out.println();
            							array[w]=mac1[i][j].charAt(index+2);
            							if(mac1[i][j].charAt(index+4)=='l')
            								w--;
            							else if(mac1[i][j].charAt(index+4)=='r')
            								w++;
            							else if(mac1[i][j].charAt(index+4)=='s')
            								w=w;
            							else
            							{
            								System.out.println("You have tried to move the read-write head to a wrong position,please enter all the transitions again");
            								ex=0;
            								count=0;
            								x=1;
            								int y=1;
            								while(x<=num)
            								{
            									while(y<=num)
            									{
            										mac1[x][y]="-";
            										mac2[x][y]=1;
            										y++;
            									}
            									y=1;
            									x++;
            								}
            								continue a;
            							}
            							i=j;
            							j=0;
            							break;
            						}
            					}
            				}
            				x++;
            			}
            			x=0;
            			j++;
            		}
            		if(index==-1)
            		{
            			x=0;
            			break;
            		}
            		j=1;
            		x=0;
            		index=-1;
            	}
            	w=0;
            	System.out.println();
            	while(w<50)
            	{
            		System.out.print(array[w]);
            		w++;
            	}
            	System.out.println("\nDo you want to enter another input for the same machine?Press 1 for yes else press 0");
            	b=sc.nextInt();
            	int ind=0;
            	while(ind<50)
                {
                	array[ind]='#';
                	ind++;
                }
            }
            System.out.println("Do you want to enter another transducer machine?Press 1 for yes else press 0");
            a=sc.nextInt();
            }while(count==1);
		}
	}
	public static void unary_add()
	{
		String mac1[][]=new String[6][6];
		int i=1,start=1,finala=5,var=0,len=0,w,j=1;
		String inp;
		char ch;
		char array[]=new char[50];
		while(i!=6)
		{
			while(j!=6)
			{
				mac1[i][j]="-";
				j++;
			}
			j=1;
			i++;
		}
		mac1[1][1] = "1,1,r";
		mac1[1][2] = "0,1,r";
		mac1[2][2] = "1,1,r";
		mac1[2][3] = "#,#,l";
		mac1[3][4] = "1,0,l";
		mac1[4][4] = "1,1,l";
		mac1[4][5] = "#,#,r";
		i = 1;
		while(i!=6)
		{
			System.out.print("         q" +i);
			i++;
		}
		System.out.println();
		i=1;
		j=1;
		while(i!=6)
		{
			System.out.print("q"+i);
			while(j!=6)
			{
				System.out.print("      " +mac1[i][j]);
				j++;
			}
			System.out.println();
			i++;
			j=1;
			System.out.println();
		}
		int k=0;
		while(k<50)
		{
			array[k]='#';
			k++;
		}
		int b=1;
		while(b==1)
		{
			System.out.print("Enter the input:\t");
			inp=sc.next();
			i=0;
			w=10;
			len=inp.length();
			while(i<len)
			{
				array[w]=inp.charAt(i);
				i++;
				w++;
			}
			int index=-1,x=0;
			w=10;
			i=1;
			j=1;
			while(i<5)
			{
				while(j<6)
				{
					var=0;
					int l=mac1[i][j].length();
					while(x<l)
					{
						ch=mac1[i][j].charAt(x);
						if(array[w]==ch)
						{
							index=x;
							if(index!=-1)
							{
								if(index==0)
								{
									while(var<w)
									{
										System.out.print(array[var]);
										var++;
									}
									System.out.print(" q"+i+" ");
									while(var<50)
									{
										System.out.print(array[var]);
										var++;
									}
									System.out.println();
									array[w]=mac1[i][j].charAt(index+2);
									if(mac1[i][j].charAt(index+2)=='l')
										w--;
									else 
										w++;
									i=j;
									j=0;
									break;
								}
								else if(mac1[i][j].charAt(index-1)=='/')
								{
									while(var<w)
									{
										System.out.print(array[var]);
										var++;
									}
									System.out.print(" q"+i+" ");
									while(var<50)
									{
										System.out.print(array[var]);
										var++;
									}
									System.out.println();
									array[w]=mac1[i][j].charAt(index+2);
									if(mac1[i][j].charAt(index+4)=='l')
										w--;
									else
										w++;
									i=j;
									j=0;
									break;
								}
							}
						}
						x++;
					}
					x=0;
					j++;
				}
				if(index==-1)
				{
					x=0;
					break;
				}
				j=1;
				x=0;
				index=-1;
			}
			int z=len+10;
			w=10;
			while(w<z-1)
			{
				System.out.print(array[w]);
				w++;
			}
			System.out.println("\nDo you want to enter another input for the same machine?Press 1 for yes else press 0");
			b=sc.nextInt();
			int ind=0;
			while(ind<50)
			{
				array[ind]='#';
				ind++;
			}
		}
	}
	public static void main(String args[])
	{
		int a1=1,a2=1,b=1,count=0;
		int m=1;
m:	   while(m==1)
{
	m=0;
		while(b==1)
		{
			System.out.println("MAIN MENU");
			System.out.println("1. Run in-built machines");
			System.out.println("2. Configure user-defined machines");
			System.out.println("3. Exit");
			System.out.println("4. Help");
			System.out.println("Enter your choice:\t");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				while(a1==1)
				{
					System.out.println("IN-BUILT MACHINES");
					System.out.println("1. L={ww | w-{a,b}*");
					System.out.println("2. Calculate 2's complement of a given binary number");
					System.out.println("3. Perform addition of two unary numbers");
					System.out.println("4. Return to main menu");
					System.out.println("Enter your choice:\t");
					int choice2=sc.nextInt();
					switch(choice2)
					{
					case 1:
						ww();
						break;
					case 2:
						comp();
						break;
					case 3:
						unary_add();
						break;
					case 4:
						m=1;
						continue m; 
					default:
						System.out.println("Invalid choice");
					}
					System.out.println("Do you want to continue for in-built machines??Press 1 for yes else press 0");
					a1=sc.nextInt();
				}
				break;
			case 2:
				while(a2==1)
				{
					System.out.println("USER-DEFINED MACHINES");
					System.out.println("1. Acceptors");
					System.out.println("2. Transducers");
					System.out.println("3. Return to main menu");
					System.out.println("Enter your choice:\t");
					int choice3=sc.nextInt();
					switch(choice3)
					{
					case 1:
						acceptors();
						break;
					case 2:
						transducers();
						break;
					case 3:
						m=1;
						continue m;
					default:
						System.out.println("Invalid choice");
					}
					System.out.println("Do you want to continue for user-defined machines??Press 1 for yes else press 0");
					a2=sc.nextInt();
				}
				break;
			case 3:
				System.exit(0);
				break;
			case 4:
				System.out.println("Option 1. Choosing this option will activate broadly one of the machines such as calculating 2's complement of a binary number, binary addition and some more.\n You have to just select the desired option and give as many input as you want to test the machine");
				System.out.println("Option 2. By choosing this option you can generate your own machine .Firstly you have to enter total number of states(starting from 1) then you will be asked \n for start state, in that you have to just tell the state number for example if q1 is your start state then  you have to just enter 1 .In the similar fashion you have to enter the  final states . ");
				System.out.println(" After entering final state you will be asked for number of transitions i.e.all te transitions from a particular state to other state is considered as one \n example if there are three transitions from q1 to q2 ,it will be considered as one and format to enter such transitions is explained below");
				System.out.println("The transitions will be given in the following format:");
				System.out.println("input_symbol,output_symbol,position_of_read-write_head(l for left, r for right, s for stay)  ");
				System.out.println("NOTE: if two states are having more than one transition say from q1 to q2 there are 2 transitions then that transitions will be given together separated by a '/' ex-a,a,r/b,b,r");
				System.out.println("Non-determinism is not allowed in our standard turing machine So, any attempt to enter a non-deterministic turing machine will not be allowed");
	            break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue for main menu??Press 1 for yes else press 0");
			b=sc.nextInt();
		}
		}while(count==1);
	}
}