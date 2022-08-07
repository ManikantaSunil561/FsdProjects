package com.wipro.eb.service;
import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
public class ConnectionService {
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException,InvalidConnectionException
	{
		boolean result=false;
		boolean prevresult=false; 
		boolean typeresult=false;
		if(currentReading<previousReading||currentReading<0||previousReading<0)
		{
			throw new InvalidReadingException();
		}
		else {
			prevresult=true;
		}
		if(!(type.equals("Domestic")||type.equals("Commercial")))
		{
			throw new InvalidConnectionException();
		}
		else
		{
			typeresult=true;
		}
		if(prevresult&&typeresult){
			result=true;
		}
		return result;
	}
	public float calculateBillAmt(int currentReading,int previousReading,String Type)
	{
		boolean result=false;
		 float endbill=0.0f;
	   	 try {
	   		 result=validate(currentReading, previousReading, Type);
	   	 } catch (InvalidReadingException e) {
	   		 // TODO Auto-generated catch block
	   		 return -1;
	   	 }
	   	 catch(InvalidConnectionException ce) {
	   		 return -2;
	   	 }
	   	 if(result==true) {
	   		 if(Type.equals("Domestic")) {
	   			 Domestic domestic=new Domestic(previousReading, currentReading, new float[] {2.3f,4.2f,5.5f});
	   			 endbill=domestic.computeBill();
	   		 }
	   		 else if(Type.equals("Commercial")) {
	   			 Commercial commercial=new Commercial(previousReading, currentReading, new float[] {5.2f,6.8f,8.3f});
	   			 endbill=commercial.computeBill();
	   		 }	 
	   	 }
	   	 return endbill;
	    }
	    public String generateBill(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException {
	   	 float finalBill=0.0f;
	   	 finalBill=calculateBillAmt(currentReading, previousReading, type);
	   	 if(finalBill==-1) {
	   		 throw new InvalidReadingException();
	   	 }
	   	 else if(finalBill==-2) {
	   		 throw new InvalidConnectionException();
	   	 }
	   	 else {
	   		 return "Amount to be paid:"+finalBill;
	   	 }
	    }
	}