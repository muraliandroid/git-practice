package com.sample;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class GetIPV4 {

	void getIPV4() {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println("IP:"+inetAddress);
			System.out.println("Host Address:" + inetAddress.getHostAddress());
			System.out.println("Host Name:" + inetAddress.getHostName());
			System.out.println("-------------------------");
			Enumeration e = NetworkInterface.getNetworkInterfaces();
			while(e.hasMoreElements())
			{
			    NetworkInterface n = (NetworkInterface) e.nextElement();
			    Enumeration ee = n.getInetAddresses();
			    while (ee.hasMoreElements())
			    {
			        InetAddress i = (InetAddress) ee.nextElement();
			        //System.out.println("HostName:" + i.getHostName());
			        System.out.println("HostIP "+i.getHostAddress());
			    }
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		GetIPV4 getIPV4 = new GetIPV4();
		getIPV4.getIPV4();
	}
}
