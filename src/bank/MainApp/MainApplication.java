package bank.MainApp;

import java.util.Scanner;

import bank.Display.StartScreen;
import bank.Utility.Branch;

public class MainApplication {
	static Scanner sc =new Scanner(System.in);
	static int x=0;
	public static void main(String[] args)
	{
		Start();
	}
private static Branch curr_Branch =new Branch(); 
private static Branch b[]=new Branch[10];

public static Branch[] getB() {
	return b;
}

public static void setB(Branch[] b) {
	MainApplication.b = b;
}

public static Branch getCurr_Branch() {
	return curr_Branch;
}

public static void setCurr_Branch(Branch curr_Branch) {
	MainApplication.curr_Branch = curr_Branch;
}

//start function	

public static void Start()
{
	StartScreen s1=new StartScreen();
	s1.bankmainDisplay();
	
	
	 
	 boolean temp;
	// default branch
	System.out.println("\n\t\t\t\t\t\t\t  🙏🏻🙇‍♂️  Namskar 🙇‍♂️🙏🏻   ");
	do {
	System.out.println("\n\t\t\t\t\t      **********++++++++++++++++++**********");
	System.out.println("\n\t\t\t\t\t * 1.New  Branch ");
	System.out.println("\n\t\t\t\t\t * 2.Branch Login ");
	System.out.println("\n\t\t\t\t\t * 3 Display All");
	System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
	System.out.print("\n\t\t\t\t\t Have A Choice :- ");
	int opChoice=sc.nextInt();
	if(opChoice==3)
	{
		curr_Branch.displayAllBRanch(b);
	}
	if(opChoice==1)
	{	
		Branch bnew=new Branch();
		bnew=bnew.BranchAccept();
		b[x]=bnew;
		x++;
		System.out.println("\t\t\t\t\t Redirecting To Login Page Again ");
	} 
	if(opChoice==2)
	{
		Branch bnew=new Branch("BOM100",1000 , "BOM01","ShivajiNagar Branch","Deccan Hardikar Road ,ShivajiNagar ",937307693,"BOMSHIV");
		   b[x]=bnew;
		   x++;
		   //branch Authorization
		   curr_Branch=bnew.Authorization(b);
		   if(curr_Branch==null)
		   {
			 temp=false;  
		   }
		   else
		   {
			   temp=true;
		   }
		   break;
	}
	}while(true);
	
  if(temp==false)
  {
	 
	  //end display
	  s1.EndDisplay();
  }
   else 
   {  //entering branch 
	   s1.baranchmainDisplay();//Welcome Display 
	   //display Bank Information
	   System.out.println("\t\t\t\t\t\t\t Branch Code :- "+curr_Branch.getBranchCode());
	   System.out.println("\t\t\t\t Branch MICR :- "+curr_Branch.getBranchMICR()+"\t\t\tBranch IFSC :- "+curr_Branch.getBranchCode());
	   System.out.println("\t\t\t\t Branch Name :- "+curr_Branch.getBranchName());
	   System.out.println("\t\t\t\t Branch Address :- "+curr_Branch.getBranchAddress());
	   System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\t\t Welcome !!! Have Your Login ");
		System.out.println("\n\t\t\t\t * 1. Admin ");
		System.out.println("\t\t\t\t * 2. Manager ");
		System.out.println("\t\t\t\t * 3. Customer ");
		System.out.println("\t\t\t\t * 4. Employee ");
	    System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
		System.out.print("\t\t\t\t\t Login Choice :-");
		int choiceLogin=sc.nextInt();
		//Login 
		System.out.println("\t\t\t\t\t Redirecting To Login Page !!");
		switch(choiceLogin)
		{
		//admin login
		case 1 :
		{
			AdminMain a1=new AdminMain();
			a1.AdminStart();
			
		}
		break;
		//manager login
		case 2 :
		{
			
		}
		break;
		//Customer login
		case 3:
		{
			
		}
		break;
		//Employee Login
		case 4 :
		{
			
		}
		break;
		//switch end
		}
	//else end
   }
 //start Function end 
}
	
//MainApplication End
}
