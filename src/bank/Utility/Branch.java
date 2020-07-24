package bank.Utility;

import java.util.Scanner;

import bank.UserExecptions.DataSimilarity;

public class Branch {
	static Scanner sc =new Scanner(System.in);
private String branchCode;
private int branchMICR=1000;
private String branchIFSC;
private String branchName;
private String branchAddress;
private long branchPhone;
private String branchPass;
Branch b[]=new Branch[10];
int x=0;
static int count=0;
public Branch(String branchCode, int branchMICR, String branchIFSC, String branchName, String branchAddress,
		long branchPhone, String branchPass) {
	this.branchCode = branchCode;
	this.branchMICR = branchMICR;
	this.branchIFSC = branchIFSC;
	this.branchName = branchName;
	this.branchAddress = branchAddress;
	this.branchPhone = branchPhone;
	this.branchPass = branchPass;
}
public Branch() 
{
	//default Constructor
}
public String getBranchCode() {
	return branchCode;
}
public int getBranchMICR() {
	return branchMICR;
}
public String getBranchIFSC() {
	return branchIFSC;
}
public String getBranchName() {
	return branchName;
}
public String getBranchAddress() {
	return branchAddress;
}
public long getBranchPhone() {
	return branchPhone;
}
public String getBranchPass() {
	return branchPass;
}
public void BranchCreate(Branch b1)
{
	b[x]=b1;
	x++;
}
//branchDetails Accept
public Branch BranchAccept() 
{
	Branch b1=new Branch();
	boolean datasimilarity;
	System.out.println("\n\n\t\t ==================================    New branch Detail     ====================================");
	//try {
	System.out.print("\n\t\t\t\t\t * Branch Code :- ");
	String Code=sc.next();
	/*datasimilarity= Codedatasimilarity(Code, b);
	/if(datasimilarity==true)
	{
		throw new DataSimilarity();
	}*/
	System.out.print("\n\t\t\t\t\t * Branch IFSC :- ");
	String IFSC=sc.next();
	System.out.print("\n\t\t\t\t\t * Branch Name :- ");
	String Name=sc.next();
	System.out.print("\n\t\t\t\t\t * Branch Address :- ");
	String Addr=sc.next();
	System.out.print("\n\t\t\t\t\t * Branch Phone :- ");
	int Phone=sc.nextInt();
	System.out.print("\n\t\t\t\t\t * Branch PassWord :- ");
	String Password=sc.next();
	b1=new Branch(Code, getBranchMICR()+1, IFSC, Name, Addr, Phone, Password);
	BranchCreate(b1);
	/*}
	catch (DataSimilarity e) {
		System.out.println(e);
	}*/
	System.out.println("\n\t\t=============================*********************************=====================================");

	return b1;
	
}
//display All
public void displayAllBRanch(Branch b[])
{
	for(Branch b2 : b)
	{
		if(b2==null)
		{
			System.out.println("\n\t\t\t\t   +++++ This Only Branch Found !!!++++ ");
			break;
		}
	System.out.println("\n\n\t\t\t=========================== Branch Detail====================================================");
	System.out.println("\t\t\t\t\t \" Branch Code\" :- "+b2.getBranchCode());
	System.out.println("\t\t\t\t\t \" Branch MICR\" :- "+b2.getBranchMICR());
	System.out.println("\t\t\t\t\t \" Branch IFSC\" :- "+b2.getBranchIFSC());
	System.out.println("\t\t\t\t\t \" Branch Name\" :- "+b2.getBranchName());
	System.out.print("\t\t\t\t\t \" Branch Address\" :- "+b2.getBranchAddress());
	System.out.println("\n\n\t\t\t=============================*******************************============================================");
	}
}
//display Single
public void displaySingleBranch(Branch b)
{
	System.out.println("\n\n\t\t\t=========================== Branch Detail====================================================");
	System.out.println("\t\t\t\t\t \" Branch Code\" :- "+b.getBranchCode());
	System.out.println("\t\t\t\t\t \" Branch MICR\" :- "+b.getBranchMICR());
	System.out.println("\t\t\t\t\t \" Branch IFSC\" :- "+b.getBranchIFSC());
	System.out.println("\t\t\t\t\t \" Branch Name\" :- "+b.getBranchName());
	System.out.print("\t\t\t\t\t \" Branch Address\" :- "+b.getBranchAddress());
	System.out.println("\n\n\t\t\t=============================*******************************============================================");
	
}
//branch Authorization Here Return Branch Cause If Any CHanges Are Added Then Changes Would 
//Be Added to That Branch Instead Of Other BRanch
public  Branch  Authorization(Branch b[])
{
	Branch returnBranch = null;
	boolean branch_check=false;
	boolean user_valdity=true;
	System.out.println("\n\n\t\t\t\t=======================================================================");
	System.out.println("\n\t\t\t\t\tPlease Enter Creditials !!");
	System.out.print("\n\t\t\t\t\t *  Branch Code :- ");
	String temp_branchcode=sc.next();
	for(Branch B1:b)
		{
		if(B1==null)
		{
			break;
		}
		String Code=B1.getBranchCode();
		String pass=B1.getBranchPass();
		if(Code.equals(temp_branchcode))
		{
			int cunt=0;
			do {
			System.out.print("\n\t\t\t\t\t *  Enter Branch Password :-");
			String temppass=sc.next();
			if(temppass.equals(pass))
			{
				String Head="Anirudha";
				System.out.print("\n\t\t\t\t\t *  Enter Developer Name :-");
				String tempHead=sc.next();
				if(tempHead.equals(Head))
				{
				System.out.println("\n\t\t\t\t\t Branch Login Successful !!!!");
				branch_check=true;
				returnBranch=B1;
				break;
				}
				else 
				{
					System.out.println("\n\n\t\t\t\t---------------------------------------------------------");
					System.out.println("\n\t\t\t\t\t Request Cancelled , Branch Login Failed ");
					cunt++;
				}
				if(branch_check==true)
				{
					break;
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
		//do while password ends	
		}while(true);
			
	//user if ends
	}
		else
		{
			user_valdity=false;
		}
	//for ends	
	}
	
	if(user_valdity==false)
	{
		System.out.println("\n\n\t\t\t\t---------------------------------------------------------");
		System.out.println("\n\t\t\t\t\t\t\t User Not Found ");
	}
	return returnBranch;
}
/*
public boolean Codedatasimilarity(String Data, Branch b[])
{
	
	boolean validity=false;
	for(Branch btest : b)
	{

		if(btest==null)
		{
			break;
		}
		String Code=btest.getBranchCode();
		if(Code.equals(Data))
		{
			System.out.println("\t\t\t\t\t Similar Branch Id Found ");
			validity=true;
		}
	}
	return validity;
	//code similarity function ends 
}*/
//branch class ends
}
