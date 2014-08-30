//5631375421 Kawinpong Rangkasikorn
//5631380521 Punn Tantakool
//5631236921 Napat Prasertwaree

import java.util.Scanner;

public class StringOperation {

	public static void main (String[]args){

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your word : ");

		String a = kb.nextLine();

		a = a.toLowerCase();

		int temp,temp1,temp2,temp3;
		//check a
		while(a.indexOf('a')!=-1){

			temp = a.indexOf('a');

		    temp1 = a.indexOf('a')+1;

			a = a.substring(0,temp)+a.substring(temp1);

		}

		//check ,

		while(a.indexOf(',')!=-1){

			temp2 = a.indexOf(',');

			temp3 = a.indexOf(',')+1;

			a = a.substring(0,temp2)+a.substring(temp3);

		}

		//Capitalize

		for(int i=0; i<a.length(); i++){

			if(a.charAt(i)==' '){

				a = a.substring(0,i+1)+(a.substring(i+1,i+2)).toUpperCase()+a.substring(i+2);
			}

		}

		a = a.substring(0,1).toUpperCase() + a.substring(1);

		System.out.println(a);

	}

}
