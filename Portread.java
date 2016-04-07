//Program to read the device

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.Socket;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Portread {
 public static JSONObject obj = new JSONObject();



public static void socket_cloud(int[] decimal1,int[] decimal2,int[] decimal3,int[] decimal4)
{

	DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48*/
	String hostName = "192.168.0.102";
	//75.126.81.66
	int portNumber = 6969;
	obj.put("Device_id", "xxxx");
	obj.put("Patient_name", "Robert");
	obj.put("Date", dateFormat.format(date));
	JSONArray data1 = new JSONArray();
	JSONArray data11 = new JSONArray();
	if(decimal2.length==0&&decimal3.length==0&&decimal4.length==0)
	{
		for(int i=0;i<13;i++)
		{
			data1.put(decimal1[i]);
				
		}
		data11.put(data1);
		data11.put(decimal2);
		data11.put(decimal3);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal3.length==0&&decimal4.length==0)
	{
		/*String dec = decimal2.toString();
		String date=dec.substring(0,6);*/
		//System.out.println(""+date);
		for(int j=0;j<13;j++)
		{
			data1.put(decimal2[j]);
		}
			
		data11.put(decimal1);
		data11.put(data1);
		data11.put(decimal3);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal2.length==0&&decimal4.length==0)
	{
		for(int k=0;k<13;k++)
		{
			data1.put(decimal3[k]);
	
		}
			
		data11.put(decimal1);
		data11.put(decimal2);
		data11.put(data1);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal2.length==0&&decimal3.length==0)
	{
		for(int l=0;l<13;l++)
		{
			data1.put(decimal4[l]);
	
		}
			
		data11.put(decimal1);
		data11.put(decimal2);
		data11.put(decimal3);
		data11.put(data1);
	}
	else
	{
		System.out.println("");
	}
	String da="Data_List";
	obj.put(da, data11);
		
	try
	{
		FileWriter file = new FileWriter("file1.json");
		file.write(obj.toString());
		file.flush();
		file.close();
		//System.out.println("Successfully Copied JSON Object to File...");
		// System.out.println("\nJSON Object: " + obj);
	}
	catch(Exception e)
	{
	}
	System.out.println("Socket is reday to recieve the data");
	try 
	{
		DataOutputStream os = null;
        	DataInputStream is = null;
		Socket s = new Socket(hostName, portNumber);
		os = new DataOutputStream(s.getOutputStream());
		is = new DataInputStream(s.getInputStream());
		os.writeBytes(obj.toString());
		os.flush();
		os.close();
		is.close();				    
		s.close();
				   
	}
	catch(Exception e) 
	{
				    
        }

}

 public static void socket(int[] decimal1,int[] decimal2,int[] decimal3,int[] decimal4)
 {
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48*/
	
	
	String hostName = "192.168.0.109";
	//75.126.81.66
	int portNumber = 6013;
	obj.put("Device_id", "xxxx");
	obj.put("Patient_name", "Robert");
	obj.put("Date", dateFormat.format(date));
	JSONArray data1 = new JSONArray();
	JSONArray data11 = new JSONArray();
	if(decimal2.length==0&&decimal3.length==0&&decimal4.length==0)
	{
		for(int i=0;i<13;i++)
		{
			data1.put(decimal1[i]);
				
		}
		data11.put(data1);
		data11.put(decimal2);
		data11.put(decimal3);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal3.length==0&&decimal4.length==0)
	{
		/*String dec = decimal2.toString();
		String date=dec.substring(0,6);*/
		//System.out.println(""+date);
		for(int j=0;j<13;j++)
		{
			data1.put(decimal2[j]);
		}
			
		data11.put(decimal1);
		data11.put(data1);
		data11.put(decimal3);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal2.length==0&&decimal4.length==0)
	{
		for(int k=0;k<13;k++)
		{
			data1.put(decimal3[k]);
	
		}
			
		data11.put(decimal1);
		data11.put(decimal2);
		data11.put(data1);
		data11.put(decimal4);
	}
	else if(decimal1.length==0&&decimal2.length==0&&decimal3.length==0)
	{
		for(int l=0;l<13;l++)
		{
			data1.put(decimal4[l]);
	
		}
			
		data11.put(decimal1);
		data11.put(decimal2);
		data11.put(decimal3);
		data11.put(data1);
	}
	else
	{
		System.out.println("");
	}
	String da="Data_List";
	obj.put(da, data11);
		
	try
	{
		FileWriter file = new FileWriter("file1.json");
		file.write(obj.toString());
		file.flush();
		file.close();
		//System.out.println("Successfully Copied JSON Object to File...");
		 System.out.println("\nJSON Object: " + obj);
	}
	catch(Exception e)
	{
	}
	System.out.println("Socket is reday to recieve the data");
	try 
	{
		DataOutputStream os = null;
        	DataInputStream is = null;
		Socket s = new Socket(hostName, portNumber);
		os = new DataOutputStream(s.getOutputStream());
		is = new DataInputStream(s.getInputStream());
		os.writeBytes(obj.toString());
		os.flush();
		os.close();
		is.close();				    
		s.close();
				   
	}
	catch(Exception e) 
	{
				    
        }
  }
  public static void main(String[] args) throws InterruptedException {
	
   	/*Timer timer = new Timer();
	timer.schedule( new Task(), 10);   
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48*/
		String ID = null;
	while(true)
	{
        	SerialPort serialPort = new SerialPort("/dev/ttyUSB0");
        	try {
		    serialPort.openPort();//Open serial port
		  //  System.out.println("Opened successfully");
	       	 //  ID = Settings.get("DeviceID");
	
		    if(serialPort.equals(null))
		    {
			System.out.println("Device is not connected");
		    }
		    else
		    { 
			  //  System.out.println(" Your Device is connected");
			    serialPort.setParams(SerialPort.BAUDRATE_9600, 
				SerialPort.DATABITS_8,
				SerialPort.STOPBITS_1,
				SerialPort.PARITY_NONE);
			        byte[] buffer = serialPort.readBytes(16);//Read 16 bytes from serial port
				try{
            			Thread.sleep(30);
				}catch(Exception e)
				{}
				try
				{
				    final StringBuilder builder = new StringBuilder();
				    for(byte in : buffer) {
					builder.append(String.format("%02x", in));
			
				    }
				    String print=builder.toString();
				    //System.out.print(print+"---");
			
				    String str = print.substring(0,6);
				    
				    //System.out.println("hai"+str);
				    String[] ecg;
				    String[] bp;
				    String[] temp;
				    String[] spec;
				    String last;
					int a[]=new int[0];
					int b[]=new int[0];
					int c[]=new int[0];

				    int arr[]=new int[26];
				    if(str.equals("fb0301"))
				    {
					ecg = new String[26];
					System.out.println("It is ecg");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						ecg[i]=last.substring(i,i+2);
						//System.out.println("ECG="+ecg[i]);
						int decimal = Integer.parseInt(ecg[i], 16);
						//System.out.println("ecg"+decimal);
						arr[j]=decimal;
				
					}
					/*for(int j:arr)
					{ 
			
					System.out.println(j);
					}*/
					Portread.socket(arr,a,b,c);
					Portread.socket_cloud(arr,a,b,c);
				    }
				    else if(str.equals("fb0302"))
				    {
					bp = new String[26];
					System.out.println("It is blood Pressure data");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						bp[i]=last.substring(i,i+2);
						//System.out.println("BP="+bp[i]);
						int decimal = Integer.parseInt(bp[i], 16);
						//System.out.println("ppg"+decimal);
				
						arr[j]=decimal;
					}
					Portread.socket(a,arr,b,c);
					Portread.socket_cloud(a,arr,b,c);	
				    }
				    else if(str.equals("fb0303"))
				    {
					temp = new String[26];
					System.out.println("It is temperature data");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						temp[i]=last.substring(i,i+2);
						//System.out.println("Temperature="+temp[i]);
						int decimal = Integer.parseInt(temp[i], 16);
						//System.out.println("temp"+decimal);
						arr[j]=decimal;
				
					}
					Portread.socket(a,b,arr,c);
					Portread.socket_cloud(a,b,arr,c);
				    }
				    else if(str.equals("fb0304"))
				    {
					spec = new String[26];
					System.out.println("special Packet");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						spec[i]=last.substring(i,i+2);
						//System.out.println("Special="+spec[i]);
						int decimal = Integer.parseInt(spec[i], 16);
						//System.out.println("spec"+decimal);
						arr[j]=decimal;
				
					}
					Portread.socket(a,b,c,arr);
					Portread.socket_cloud(a,b,c,arr);
				    }
			 	    else
				    {
					System.out.println("Invalid");
					/*int decimal = Integer.parseInt(print, 16);
					System.out.println(decimal);*/
				    }
				   // Thread.sleep(200);
				}
		
				catch(Exception e)
				{
				}
			}

            		serialPort.closePort();//Close serial port
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
      }
	
	
}
}

















/*full code
class Task extends TimerTask {


   
    // run is a abstract method that defines task performed at scheduled time.
    public void run() {
       
	String ID = null;
	while(true)
	{
        	SerialPort serialPort = new SerialPort("/dev/ttyUSB1");
        	try {
		    serialPort.openPort();//Open serial port
		  //  System.out.println("Opened successfully");
	       	 //  ID = Settings.get("DeviceID");
	
		    if(serialPort.equals(null))
		    {
			System.out.println("Device is not connected");
		    }
		    else
		    { 
			  //  System.out.println(" Your Device is connected");
			    serialPort.setParams(SerialPort.BAUDRATE_9600, 
				SerialPort.DATABITS_8,
				SerialPort.STOPBITS_1,
				SerialPort.PARITY_NONE);
			        byte[] buffer = serialPort.readBytes(16);//Read 16 bytes from serial port
				try{
            			Thread.sleep(500);
				}catch(Exception e)
				{}
				try
				{
				    final StringBuilder builder = new StringBuilder();
				    for(byte in : buffer) {
					builder.append(String.format("%02x", in));
			
				    }
				    String print=builder.toString();
				    //System.out.print(print+"---");
			
				    String str = print.substring(0,6);
				    
				    //System.out.println("hai"+str);
				    String[] ecg;
				    String[] bp;
				    String[] temp;
				    String[] spec;
				    String last;
					int a[]=new int[0];
					int b[]=new int[0];
					int c[]=new int[0];

				    int arr[]=new int[26];
				    if(str.equals("fb0301"))
				    {
					ecg = new String[26];
					System.out.println("It is ecg");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						ecg[i]=last.substring(i,i+2);
						//System.out.println("ECG="+ecg[i]);
						int decimal = Integer.parseInt(ecg[i], 16);
						//System.out.println("ecg"+decimal);
						arr[j]=decimal;
				
					}
					/*for(int j:arr)
					{ 
			
					System.out.println(j);
					}*/
					/*--Portread.socket(arr,a,b,c);
				    }
				    else if(str.equals("fb0302"))
				    {
					bp = new String[26];
					System.out.println("It is blood Pressure data");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						bp[i]=last.substring(i,i+2);
						//System.out.println("BP="+bp[i]);
						int decimal = Integer.parseInt(bp[i], 16);
						//System.out.println("ppg"+decimal);
				
						arr[j]=decimal;
					}
					Portread.socket(a,arr,b,c);
				    }
				    else if(str.equals("fb0303"))
				    {
					temp = new String[26];
					System.out.println("It is temperature data");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					//System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						temp[i]=last.substring(i,i+2);
						//System.out.println("Temperature="+temp[i]);
						int decimal = Integer.parseInt(temp[i], 16);
						//System.out.println("temp"+decimal);
						arr[j]=decimal;
				
					}
					Portread.socket(a,b,arr,c);
				    }
				    else if(str.equals("fb0304"))
				    {
					spec = new String[26];
					System.out.println("special Packet");
					last = print.substring(6);
				    	//System.out.println("haiiiii"+last);
					int length=last.length();
					System.out.println("Length="+length);
					for(int i=0,j=0;i<length;i=i+2,j++)
					{  
						spec[i]=last.substring(i,i+2);
						//System.out.println("Special="+spec[i]);
						int decimal = Integer.parseInt(spec[i], 16);
						//System.out.println("spec"+decimal);
						arr[j]=decimal;
				
					}
					Portread.socket(a,b,c,arr);
				    }
			 	    else
				    {
					System.out.println("Invalid");
					/*int decimal = Integer.parseInt(print, 16);
					System.out.println(decimal);*/
				  /*--  }
				   // Thread.sleep(200);
				}
		
				catch(Exception e)
				{
				}
			}

            		serialPort.closePort();//Close serial port
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
      }
    }

       
    }

*/








