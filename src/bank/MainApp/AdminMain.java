package bank.MainApp;

import java.util.Scanner;

import bank.Users.Admin;
import bank.Utility.Branch;

public class AdminMain {
	static Scanner sc =new Scanner(System.in);
	static int x=0,v=0;
	boolean temp;
public void AdminStart(){
	Admin arradm[]=new Admin[5];
	Admin vistedadm[]=new Admin[100];
	Admin Curr_Admin=new Admin();
	Branch curr_branch=MainApplication.getCurr_Branch();
	System.out.println("\n\t\t\t\t\t\t\t Welcome Sir !!!");
	do {
		
	
	System.out.println("\n\t\t\t\t\t      **********++++++++++++++++++**********");
	System.out.println("\t\t\t\t\t * 1. New Admin  ");
	System.out.println("\t\t\t\t\t * 2. Admin Login ");
	System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
	System.out.print("\n\t\t\t\t\t Have A Choice :- ");
	int adminchoice=sc.nextInt();
	if(adminchoice==1)
	{
		Admin anew=new Admin();
		anew=anew.AdminAccept();
		arradm[x]=anew;
		x++;
	 System.out.println("\t\t\t\t\t Redirecting To Login Page Again ");
		
	}
	if(adminchoice==2)
	{
	Admin a=new Admin("BOM100", "Admin20");
	arradm[x]=a;
	x++;
	//admin Authortization
	Curr_Admin=a.Authorization(arradm);
	if(Curr_Admin==null)
	{
		temp=false;
	}
	else
	{
		temp=true;
	}
	break;
	}
	//while ends
	}while(true);
	if(temp==false)
	{
	System.out.println("\t\t\t\t\t-----Admin Authorization Failed :-0 ------- ");
	
	}
	else
	{
		vistedadm[v]=Curr_Admin;
		v++;
		System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\t\t\tHello Mr ."+Curr_Admin.getUserId()+" !!");
		System.out.println("\n\t\t\t\t\t--------Choose From Below --------");
		System.out.println("\t\t\t\t\t * 1. Employee ");
		System.out.println("\t\t\t\t\t * 2. Manager ");
		System.out.println("\t\t\t\t\t * 3. Branch ");
		System.out.println("\t\t\t\t\t * 4. Self Updation ");
		System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
		System.out.print("\t\t\t\t\t  Choice :-");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 :
			{
				
			}
		break;
		case 2 :
			{
				
			}
		break;
		case 3 :
			{
				String exit;
				System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
				do {
				System.out.println("\n\t\t\t\t -----Choose From Below !-----");
				System.out.println("\t\t\t\t\t * 1. Update Branch Information ");
				System.out.println("\t\t\t\t\t * 2. See All Branch");
				System.out.println("\t\t\t\t\t * 3. Switch To Another Branch ");
				System.out.println("\t\t\t\t\t * 4. Logout ");
				System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
				System.out.print("\n\t\t\t\t\t Have A Choice :- ");
				int updateOption=sc.nextInt();
				switch(updateOption)
				{
				case 1 :
					{
						System.out.println("\t\t\t\t\t----------------==========================----------------");
						System.out.println("\n\t\t\t\t\t First Enter Your Password For Quick Seurity Check !");
						System.out.print("\n\t\t\t\t\t * Password :- ");
						String temppass=sc.next();
						String orginalPass=curr_branch.getBranchPass();
						if(temppass.equals(orginalPass))
						{
							
						}
						
					}
				break;
					//switch ends
				}
				System.out.println("\t\t\t\t------------------------------------------------------");
				System.out.println("\t\t\t\t\t Do You Want To Continue Say \"Yes\" ");
				System.out.print("\t\t\t\t\t Say :-  ");
				exit=sc.next();
				}while(exit.equals("yes") || exit.equals("Yes") );
				
			}
		break;
		case 4 :
			{
				String exit;
				System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
				do {
				System.out.println("\n\t\t\t\t -----Choose From Below !-----");
				System.out.println("\t\t\t\t\t * 1. Update Information ");
				System.out.println("\t\t\t\t\t * 2. See All Admin");
				System.out.println("\t\t\t\t\t * 3. Other Details ");
				System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
				System.out.print("\n\t\t\t\t\t Have A Choice :- ");
				int updateOption=sc.nextInt();
				switch(updateOption)
				{
				case 1:
				{
					System.out.println("\t\t\t\t\t----------------==========================----------------");
					System.out.println("\n\t\t\t\t\t First Enter Your Password For Quick Seurity Check !");
					System.out.print("\n\t\t\t\t\t * Password :- ");
					String temppass=sc.next();
					if(temppass.equals(Curr_Admin.getUserPass()))
					{
						System.out.println("\n\n\t\t\t-----------------------------------------------------------------------------------------");
						System.out.println("\n\t\t\t\t\t Have Your Changes Sir, ");
						System.out.println("\t\t\t\t\t * 1 . Id ");
						System.out.println("\t\t\t\t\t * 2 . Password");
						System.out.println("\t\t\t\t---------------------------------------------------");
						System.out.print("\t\t\t\t\t Enter The Choice :- ");
						int ch=sc.nextInt();
						if(ch==1)
						{
						System.out.println("\t\t\t\t --------------Enter The Changes ---------------");	
						System.out.println("\t\t\t\t\t Admin Id :-");
						String id=sc.next();
						Curr_Admin.setUserId(id);
						}
						if(ch==2)
						{
						System.out.println("\t\t\t\t\t Admin Password :-");
						String pass=sc.next();
						Curr_Admin.setUserPass(pass);
						}
						else
						{
							System.out.println("\t\t\t\t\t ***** Wrong Choice Entered *****");
						}
					}
					else
					{
					System.out.println("\t\t\t\t\t Password Incorrect !! You Can't Update Information !!! Sorry ");	
					}
				//case 1 ends
				}
				break;
				case 2 :
				{
					Curr_Admin.displayAllAdmin(arradm);
				}
				break;
				case 3:
				{
					System.out.println("\n\t\t\t\t---------------------------------------------------------");
					System.out.println("\n\t\t\t\t\t * 1. All Admin Visted");
					System.out.println("\t\t\t\t\t * 2. My Info ");
					System.out.println("\t\t\t\t\t * 3. Log Out ");
					System.out.println("\n\t\t\t\t---------------------------------------------------------");
					System.out.print("\n\t\t\t\t\t * Choice :- ");
					int otherChoice=sc.nextInt();
					//display All loginned Admin 
					if(otherChoice==1)
					{
						Curr_Admin.displayAllAdmin(vistedadm);
					}
					//display My info
					if(otherChoice==2)
					{
						Curr_Admin.displayAdmin(Curr_Admin);
					}
					if(otherChoice==3)
					{
						System.out.println("\t\t\t\t------------------------------------------------------");
						System.out.println("\t\t\t\t\t Logged Out Successfully !!! ");
						System.out.println("\n\t\t\t\t\t   <<< Thankyou Sir >>> ");
						System.out.println("\n\n\t\t\t-------------------------------------------==========================-------------------------------------------------");
						AdminStart();
					}
				}
				//update switch ends
				}
				System.out.println("\t\t\t\t------------------------------------------------------");
				System.out.println("\t\t\t\t\t Do You Want To Continue Say \"Yes\" ");
				System.out.print("\t\t\t\t\t Say :-  ");
				exit=sc.next();
				}while(exit.equals("yes") || exit.equals("Yes") );
				System.out.println();
			}
		break;
	
		//switch ends
		}
	//else ends	
	}
	//Admin Function Ends 	
}
//class Admin Main Ends
}
