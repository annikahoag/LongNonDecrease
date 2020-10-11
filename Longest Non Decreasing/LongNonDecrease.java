import java.util.Scanner;

public class LongNonDecrease {


		
		//instance variables 
		Scanner myObj = new Scanner(System.in);
		public int i;
		public int arrayLength;
		public int num;
		int numbers[] = new int [25];
		int startIndex;
		int endIndex;
		
		
		//constructor 
		public LongNonDecrease() {
			i=0;
			arrayLength=0;
			num=0;
		}


		
		
		//set numbers in the array
		public void setArrayNum(int input) {
		
			if ((arrayLength + input) > 25) {
				System.out.println("You've exceded the limit of numbers in the sequence");
				return;
			}
			
			startIndex = arrayLength;
			endIndex = (arrayLength + input) -1;
			
			
			for (i = startIndex; i <= endIndex; i++) {
				System.out.println("Please input 1 number from the sequence:");
				num = myObj.nextInt();
				numbers[i] = num;
			}//end of for loop
			
			
			arrayLength = arrayLength + input;
		}
		
		
		//print entire sequence
		public void printEntire() {

			for (i = 0; i <= arrayLength-1; i++) {
				System.out.println(numbers[i]);
			}
			
		}
		
		
		//prints longest non decreasing sequence using multi-dimensional arrays
		//EXTRA CREDIT
		public void printNonDecreaseMulti() {
		int [][] nonDecreaseArray = new int [25][26];
			int longLength=0;
			int k=0;
			int j;
			int done=0;
			
			
			for (i = 0; i <= arrayLength-1; i++) {
				nonDecreaseArray[i][0]=1;
				nonDecreaseArray[i][1] = numbers[k];
				k++;
				
				if (k == arrayLength) {
					break;
				}
				
				
				
				for (j = 2; j <= arrayLength; j++) {
					if (numbers[k] >= numbers[k-1]) {
						nonDecreaseArray[i][j] = numbers[k];
						nonDecreaseArray[i][0]++;
						k++;
						
						if (k == arrayLength) {
							done=1;
							break;
						}
						
						
					}else {
//						if (nonDecreaseArray[i][0] > longLength) {
//							longLength = nonDecreaseArray[i][0];
							break;
//						}
						
					}//end of else 
					
					
				}//end of inner for loop
				
				if (nonDecreaseArray[i][0] > longLength) {
					longLength = nonDecreaseArray[i][0];
					
				}
			
				if (done==1) {
					break;
				}
				
			}//end of outer for loop
			
			
			
			for (i = 0; i < 25; i++) {
				if (nonDecreaseArray[i][0] == longLength) {
					System.out.print("\n");
					for (j = 1; j <= longLength; j++) {
						System.out.print(nonDecreaseArray[i][j] + ", ");
						
					}//end of inner
				}
			}//end of outer
			
		}
		
		
		
		
		public void printNonDecrease() {
			
			//use array[0] as the length
			//chance of having 25 sequences if longest sequence is 1 number and they
			//are continually decreasing
			int array1[] = new int [26];
			int array2[] = new int [26];
			int array3[] = new int [26];
			int array4[] = new int [26];
			int array5[] = new int [26];
			int array6[] = new int [26];
			int array7[] = new int [26];
			int array8[] = new int [26];
			int array9[] = new int [26];
			int array10[] = new int [26];
			int array11[] = new int [26];
			int array12[] = new int [26];
			int array13[] = new int [26];
			int array14[] = new int [26];
			int array15[] = new int [26];
			int array16[] = new int [26];
			int array17[] = new int [26];
			int array18[] = new int [26];
			int array19[] = new int [26];
			int array20[] = new int [26];
			int array21[] = new int [26];
			int array22[] = new int [26];
			int array23[] = new int [26];
			int array24[] = new int [26];
			int array25[] = new int [26];
			
			int j; //index for numbers[]
			int k=2; //index for array that we're building 
			int length=0; //current length of longest sequence
			
			//case1
			array1[0]=1;
			array1[1]=numbers[0];
			
			for (j = 1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array1[k] = numbers[j];
					array1[0]++;
					k++;
				}else{
					break;
				}
				
				
			}//end of for loop
			
			if (length <= array1[0]) {
				length = array1[0];
			}
			
			
			
			
			//case 2
			k=2;
			if (j>arrayLength-1) {
				array2[0]=0;
			}else {
				array2[0]=1;
				array2[1]=numbers[j];
			}
			
		
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array2[k] = numbers[j];
					array2[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array2[0]) {
				length = array2[0];
			}
			
			
			
			//case 3
			k=2;
			if (j>arrayLength-1) {
				array3[0]=0;
			}else {
				array3[0]=1;
				array3[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array3[k] = numbers[j];
					array3[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array3[0]) {
				length = array3[0];
			}
			
			
			//case 4	
			k=2;
			if (j>arrayLength-1) {
				array4[0]=0;
			}else {
				array4[0]=1;
				array4[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array4[k] = numbers[j];
					array4[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array4[0]) {
				length = array4[0];
			}
			
			
			
			//case 5 
			k=2;
			if (j>arrayLength-1) {
				array5[0]=0;
			}else {
				array5[0]=1;
				array5[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array5[k] = numbers[j];
					array5[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array5[0]) {
				length = array5[0];
			}
			
			
			
			//case 6
			k=2;
			if (j>arrayLength-1) {
				array6[0]=0;
			}else {
				array6[0]=1;
				array6[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array6[k] = numbers[j];
					array6[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array6[0]) {
				length = array6[0];
			}
			
			
			
			//case 7
			k=2;
			if (j>arrayLength-1) {
				array7[0]=0;
			}else {
				array7[0]=1;
				array7[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array7[k] = numbers[j];
					array7[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array7[0]) {
				length = array7[0];
			}
			
			
			
			//case 8
			k=2;
			if (j>arrayLength-1) {
				array8[0]=0;
			}else {
				array8[0]=1;
				array8[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array8[k] = numbers[j];
					array8[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array8[0]) {
				length = array8[0];
			}
			
			
			
			//case 9
			k=2;
			if (j>arrayLength-1) {
				array9[0]=0;
			}else {
				array9[0]=1;
				array9[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array9[k] = numbers[j];
					array9[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array9[0]) {
				length = array9[0];
			}
			
			
			
			
			//case 10
			k=2;
			if (j>arrayLength-1) {
				array10[0]=0;
			}else {
				array10[0]=1;
				array10[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array10[k] = numbers[j];
					array10[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array10[0]) {
				length = array10[0];
			}
			
			
			
			
			//case 11
			k=2;
			if (j>arrayLength-1) {
				array11[0]=0;
			}else {
				array11[0]=1;
				array11[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array11[k] = numbers[j];
					array11[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array11[0]) {
				length = array11[0];
			}
			
			
			
			
			//case 12
			k=2;
			if (j>arrayLength-1) {
				array12[0]=0;
			}else {
				array12[0]=1;
				array12[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array12[k] = numbers[j];
					array12[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array12[0]) {
				length = array12[0];
			}
			
			
			
			
			//case 13
			k=2;
			if (j>arrayLength-1) {
				array13[0]=0;
			}else {
				array13[0]=1;
				array13[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array13[k] = numbers[j];
					array13[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array13[0]) {
				length = array13[0];
			}
			
			
			
			
			//case 14
			k=2;
			if (j>arrayLength-1) {
				array14[0]=0;
			}else {
				array14[0]=1;
				array14[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array14[k] = numbers[j];
					array14[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array14[0]) {
				length = array14[0];
			}
			
			
			
			//case 15
			k=2;
			if (j>arrayLength-1) {
				array15[0]=0;
			}else {
				array15[0]=1;
				array15[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array15[k] = numbers[j];
					array15[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array15[0]) {
				length = array15[0];
			}
			
			
			
			
			//case 16
			k=2;
			if (j>arrayLength-1) {
				array16[0]=0;
			}else {
				array16[0]=1;
				array16[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array16[k] = numbers[j];
					array16[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array16[0]) {
				length = array16[0];
			}
			
			
			
			
			//case 17
			k=2;
			if (j>arrayLength-1) {
				array17[0]=0;
			}else {
				array17[0]=1;
				array17[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array17[k] = numbers[j];
					array17[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array17[0]) {
				length = array17[0];
			}
			
			
			
			//case 18
			k=2;
			if (j>arrayLength-1) {
				array18[0]=0;
			}else {
				array18[0]=1;
				array18[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array18[k] = numbers[j];
					array18[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array18[0]) {
				length = array18[0];
			}
			
			
			
			
			//case 19
			k=2;
			if (j>arrayLength-1) {
				array19[0]=0;
			}else {
				array19[0]=1;
				array19[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array19[k] = numbers[j];
					array19[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array19[0]) {
				length = array19[0];
			}
			
			
			
			//case 20
			k=2;
			if (j>arrayLength-1) {
				array20[0]=0;
			}else {
				array20[0]=1;
				array20[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array20[k] = numbers[j];
					array20[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array20[0]) {
				length = array20[0];
			}
			
			
			
			//case 21
			k=2;
			if (j>arrayLength-1) {
				array21[0]=0;
			}else {
				array21[0]=1;
				array21[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array21[k] = numbers[j];
					array21[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array21[0]) {
				length = array21[0];
			}
			
			
			
			
			//case 22
			k=2;
			if (j>arrayLength-1) {
				array22[0]=0;
			}else {
				array22[0]=1;
				array22[1]=numbers[j];
			}
			
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array22[k] = numbers[j];
					array22[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array22[0]) {
				length = array22[0];
			}
			
			
			
			//case 23
			k=2;
			if (j>arrayLength-1) {
				array23[0]=0;
			}else {
				array23[0]=1;
				array23[1]=numbers[j];
			}
			
	
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array23[k] = numbers[j];
					array23[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array23[0]) {
				length = array23[0];
			}
			
			
			
			
			
			//case 24
			k=2;
			if (j>arrayLength-1) {
				array24[0]=0;
			}else {
				array24[0]=1;
				array24[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array24[k] = numbers[j];
					array24[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array24[0]) {
				length = array24[0];
			}
			
			
			
			//case 25
			k=2;
			if (j>arrayLength-1) {
				array25[0]=0;
			}else {
				array25[0]=1;
				array25[1]=numbers[j];
			}
			
		
			for (j=j+1; j<=arrayLength-1; j++) {
				if (numbers[j] >= numbers[j-1]) {
					array25[k] = numbers[j];
					array25[0]++;
					k++;
				}else{
					break;
				}
				
			}//end of for loop
			
			if (length <= array25[0]) {
				length = array25[0];
			}
			

			
			if (arrayLength==0){
				System.out.println("You haven't entered any numbers yet.");
			}else {
			
				if (array1[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array1[0]; i++) {
						System.out.print(array1[i] + ", ");
					}
					
				}if (array2[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array2[0]; i++) {
						System.out.print(array2[i] + ", ");
					}
					
				}if (array3[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array3[0]; i++) {
						System.out.print(array3[i] + ", ");
					}
					
				}if (array4[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array4[0]; i++) {
						System.out.print(array4[i] + ", ");
					}
					
				}if (array5[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array5[0]; i++) {
						System.out.print(array5[i] + ", ");
					}
					
				}if (array6[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array6[0]; i++) {
						System.out.print(array6[i] + ", ");
					}
					
				}if (array7[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array7[0]; i++) {
						System.out.print(array7[i] + ", ");
					}
					
				}if (array8[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array8[0]; i++) {
						System.out.print(array8[i] + ", ");
					}
					
				}if (array9[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array9[0]; i++) {
						System.out.print(array9[i] + ", ");
					}
					
				}if (array10[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array10[0]; i++) {
						System.out.print(array10[i] + ", ");
					}
					
				}if (array11[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array11[0]; i++) {
						System.out.print(array11[i] + ", ");
					}
					
				}if (array12[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array12[0]; i++) {
						System.out.print(array12[i] + ", ");
					}
				}
				
				if (array13[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array13[0]; i++) {
						System.out.print(array13[i] + ", ");
					}
					
				}if (array14[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array14[0]; i++) {
						System.out.print(array14[i] + ", ");
					}
					
				}if (array15[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array15[0]; i++) {
						System.out.print(array15[i] + ", ");
					}
					
				}if (array16[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array16[0]; i++) {
						System.out.print(array16[i] + ", ");
					}
					
				}if (array17[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array17[0]; i++) {
						System.out.print(array17[i] + ", ");
					}
					
				}if (array18[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array18[0]; i++) {
						System.out.println(array18[i] + ", ");
					}
					
				}if (array19[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array19[0]; i++) {
						System.out.print(array19[i] + ", ");
					}
					
				}if (array20[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array20[0]; i++) {
						System.out.print(array20[i] + ", ");
					}
					
				}if (array21[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array21[0]; i++) {
						System.out.print(array21[i] + ", ");
					}
					
				}if (array22[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array22[0]; i++) {
						System.out.print(array22[i] + ", ");
					}
					
				}if (array23[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array23[0]; i++) {
						System.out.print(array23[i] + ", ");
					}
					
				}if (array24[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array24[0]; i++) {
						System.out.print(array24[i] + ", ");
					}
					
				}if (array25[0]==length) {
					System.out.println("\n");
					for (i = 1; i<=array25[0]; i++) {
						System.out.print(array25[i] + ", ");
					}
				}
				
			}//end of else
			
			
		}//end of printNonDecrease method
		
		
	
		

		
		
		
		//deletes all numbers in the array
		public void resetArray() {
			
			numbers = new int [25];
			arrayLength = 0;
			
		}
		
		
		
	}


