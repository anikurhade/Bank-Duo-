package bank.Users;

import java.util.Scanner;

public class Admin {
	Scanner sc=new Scanner(System.in);//Scanner Incialised 
	// private Value declaration 
			private String userId; 
			private String userPass;
			private Admin a[]=new Admin[10];
			int x=0;
	//default Constructor
			public Admin()
			{
				
			}
	//Parametric constructor
			public Admin(String userId, String userPass) {
				this.userId = userId;
				this.userPass = userPass;
				
			}
	//setter Getter
			public String getUserId() {
				return userId;
			}
			public String getUserPass() {
				return userPass;
			}
			public void setUserId(String userId) {
				this.userId = userId;
			}
			public void setUserPass(String userPass) {
				this.userPass = userPass;
			}
	//create Function To Add New Admin 
			public void AdminCreate(Admin cad)
			{
				a[x]=cad;
				System.out.println("\n\t\t\t\t\t------------Admin Created Successfully----------------");
				x++;
			}
	//accept new Admin Details
			public Admin AdminAccept()
			{
				Admin a1=new Admin();
				System.out.println("\n\n\t\t\t   ===========================New branch Detail====================================================");
				System.out.print("\n\t\t\t\t\t * New Admin ID :- ");
				String Code=sc.next();
				System.out.print("\n\t\t\t\t\t * New Admin Password :- ");
				String Pass=sc.next();
				System.out.println("\n\t\t\t=============================*********************************=====================================");
				a1=new Admin(Code, Pass);
				AdminCreate(a1);
				
				return a1;
			}
	// admin single display
			public void displayAdmin(Admin a)
			{
				System.out.print("\n\t\t\t\t\t * Admin ID :- "+a.getUserId());
				System.out.print("\n\t\t\t\t\t * Admin Password :- "+a.getUserPass());
				
			}
	//display All Admin
			public void displayAllAdmin(Admin a[])
			{
				System.out.println("\t\t\t\t\t --------------------All Admin----------------------");
				
				for(Admin a2:a)
				{
					if(a2==null)
					{
						System.out.println("\n\t\t\t\t\t-----------------------------------------------------");
						break;
					}
					System.out.print("\n\t\t\t\t\t * Admin ID :- "+a2.getUserId());
				}
			}
	//admin Authorization
			public Admin Authorization(Admin a[])
			{
				Admin returnadmin=null;
				boolean admin_check=false;
				boolean user_valdity=true;
				//accepting Admin Id 
				System.out.println("\n\n\t\t\t\t=======================================================================");
				System.out.println("\n\t\t\t\t\tPlease Enter Creditials !!");
				System.out.print("\n\t\t\t\t\t *  Admin ID :- ");
				String temp_adminId=sc.next();
				for(Admin tempadmin : a)
				{
					//in a array if obj is null then to break
					if(tempadmin==null)
					{
						break;
					}
					String Code=tempadmin.getUserId();
					String pass=tempadmin.getUserPass();
					//validating admin id 
					if(Code.equals(temp_adminId))
					{
						int cunt=0;
						do{
							//accepting password 
							System.out.print("\n\t\t\t\t\t *  Enter Admin Password :-");
							String temppass=sc.next();
							//validating password
							if(temppass.equals(pass))
							{
							String Head="Anirudha";
								//validating Special String 
								System.out.print("\n\t\t\t\t\t *  Enter Head Admin Name :-");
								String tempHead=sc.next();
								if(tempHead.equals(Head))
								{
									System.out.println("\n\t\t\t\t\t Branch Login Successful !!!!");
									admin_check=true;
									returnadmin=tempadmin;
									break;
								}
								else
								{
									System.out.println("\n\n\t\t\t\t---------------------------------------------------------");
									System.out.println("\n\t\t\t\t\t Request Cancelled , Admin Login Failed ");
								cunt++;
								}
							//password if ends  
							}
							else
							{
								System.out.println("\n\n\t\t\t\t---------------------------------------------------------");
								System.out.println("\n\t\t\t\t\t\tIncorrect Password !!");
								cunt++;
							}
							if(cunt>3)
							{
								System.out.println("\t\t\t\t\t Error Limit Ends !! System Blocks You !!!");
								System.exit(0);
								
							}
							//do while end
							}while(true);
						//if ends			
						}
					else
					{
						user_valdity=false;
					}
				//for each loop ends 	
				}
				if(user_valdity==false)
				{
					System.out.println("\n\n\t\t\t\t---------------------------------------------------------");
					System.out.println("\n\t\t\t\t\t\t\t User Not Found ");
				}
				return returnadmin;
			///authorization function Ends
			}
	//admin class ends
}
