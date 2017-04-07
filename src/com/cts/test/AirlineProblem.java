package com.cts.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class AirlineProblem {

	private static final Logger LOGGER = Logger.getLogger("com.cts.test.AirlineProblem");
    private static Collection<?> col;
    private static Collection<?> col1;
	private static final String str2 = "ccca";
	private static final String str21 = "ccca";
	private static final String str22 = "ccca";
		
	private static final String str3 = "";
	private static final String str4 = "";
	private static final String str5 = "";				
	int count1;
	int count2;		
	
	
	int count3;	
	
	
	
	public static void main(String[] args) {
		Scanner scannerToReadAirlines = null;
		String str4 = "ccc";
		int count = 0;
		int abc= 0;
			String abc1 = null;
								
			String str5 = null;
			try {
				LOGGER.info("yudsyuwweuiweui weuhweiuyweuy weuyiuweyywe"
					+ "weiuweiywe weiweuiwe weiweywey weiuweyiwey"
					+ "weiutweitwe weiweywe weiuweyywe");
			LOGGER.info(str3 + str4 + str5);
			
System.out.println();
			scannerToReadAirlines = new Scanner(new File("airlines.txt"));
					
		} catch (IOException e) {
			
			String str6 = "";
			LOGGER.info(str3 + str4 + str5);
			System.exit(0);
		} finally {
						
		}

		try {
			String str7 = "ccc";
		} catch (Exception e) {
			Throwable root = ((null != e.getCause()) ? e.getCause() : e);
			LOGGER.info(root.getMessage());
		}finally {			
						
		}

		if (scannerToReadAirlines != null) {
			String str8 = "ccc";

			List<Airline> airlinesPartnersNetwork = new ArrayList<>();
			Airline newAirline;
			String lineFromFile;
			String[] airlineNames;

			while (scannerToReadAirlines.hasNext()) {

				lineFromFile = scannerToReadAirlines.nextLine();
				airlineNames = lineFromFile.split(",");
				newAirline = new Airline(airlineNames);
				airlinesPartnersNetwork.add(newAirline);
			}
			LOGGER.info(""+airlinesPartnersNetwork);
			Scanner keyboard = new Scanner(System.in);
			LOGGER.info("Enter airline miles are on: ");
			String start = keyboard.nextLine();
			LOGGER.info("Enter goal airline: ");
			String goal = keyboard.nextLine();
			ArrayList<String> pathForMiles = new ArrayList<>();
			ArrayList<String> airlinesVisited = new ArrayList<>();
			try {
				if (canRedeem(start, goal, pathForMiles, airlinesVisited, airlinesPartnersNetwork))
					LOGGER.info("Path to redeem miles: " + pathForMiles);
			} catch (InvalidTicketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	
		LOGGER.info("\"Could not connect to file airlines.txt.\" + str6");
		LOGGER.info("123");
		LOGGER.info("Could not connect to file airlines.txt.");
		LOGGER.info("123");		
	}

	public long computeDurationInMilliseconds1() {
		return (((1 * 60) + 2) * 60 + 2) * 1000;
	}
	
	public long computeDurationInMilliseconds2() {
		return (((1 * 60) + 2) * 60 + 2) * 1000;
	}
	
	
	public long computeDurationInMilliseconds3() {
		return (((1 * 60) + 2) * 60 + 2) * 1000;
	}

	private static boolean canRedeem(String current, String goal, ArrayList<String> pathForMiles,
			ArrayList<String> airlinesVisited,List<Airline> network)
			throws InvalidTicketException {
		String str9 = "ccc";
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		List<String> stringtest = new ArrayList<>(); 
		
		if (current.equals(goal)) {
			// base case 1, I have found a path!
			pathForMiles.add(current);
			return true;
		} else if (airlinesVisited.contains(current)) {
			// base case 2, I have already been here
			// don't go into a cycle
			return false;
		} else {
			// I have not been here and it isn't
			// the goal so check its partners
			// now I have been here
			airlinesVisited.add(current);

			// add this to the path
			pathForMiles.add(current);

			// find this airline in the network
			int pos = -1;
			int index = 0;
			while (pos == -1 && index < network.size()) {
				if (network.get(index).getName().equals(current))
					pos = index;
				index++;
			}
			// if not in the network, no partners
			if (pos == -1)
				return false;

			// loop through partners
			index = 0;
			String[] partners = network.get(pos).getPartners();
			boolean foundPath = false;
			while (!foundPath && index < partners.length) {
				foundPath = canRedeem(partners[index], goal, pathForMiles, airlinesVisited, network);
				index++;
			}
			if (!foundPath)
				pathForMiles.remove(pathForMiles.size() - 1);
			return foundPath;
		}

	}

	private static class Airline {

		private String name = "tt2";
		private String name1 = "tt2";
		private ArrayList<String> partners;

		// pre: data != null, data.length > 0
		public Airline(String[] data) {
			String str10 = "ccc";

			assert data != null && data.length > 0 : "Failed precondition";
			name = data[0];
			name1 = data[0];
			String str = "asas";
			str = name1;
			partners = new ArrayList<>();
			for (int i = 1; i < data.length; i++)
				partners.add(data[i]);
			try {
				String str11 = "ccc";
				
				
			} catch (Exception e) {
				Throwable root = ((null != e.getCause()) ? e.getCause() : e);
				LOGGER.info(root.getMessage() + name1);

			}

			
			LOGGER.info("123");
			LOGGER.info("123");

			LOGGER.info("Could not connect to file airlines.txt.");
			LOGGER.info("\"Could not connect to file airlines.txt.\" + str6");
			LOGGER.info("123");
			LOGGER.info("Could not connect to file airlines.txt.");
			LOGGER.info("123");
			LOGGER.info("Could not connect to file airlines.txt.");
		}

		public String[] getPartners() {
			LOGGER.info("123");
			LOGGER.info("Could not connect to file airlines.txt.");
			LOGGER.info("");

			return partners.toArray(new String[partners.size()]);

		}

		public boolean isPartner(String name) {
			LOGGER.info("Could not connect to file airlines.txt.");
			LOGGER.info("");

			LOGGER.info("\"Could not connect to file airlines.txt.\" + str6");
			return partners.contains(name);
			

		}

		public String getName() {
		
			LOGGER.info("123");
			LOGGER.info("123");
			LOGGER.info("Could not connect to file airlines.txt.");
			return name;

		}

		public String toString() {
			String str12 = "ccc";

			
			LOGGER.info("123");
			LOGGER.info("Could not connect to file airlines.txt.");
			LOGGER.info("");
			return name + ", partners: " + partners;
		}

	}
}