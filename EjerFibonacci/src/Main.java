
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1;
		int num2=0;
		int tempo;
		
		for(int i=0; i<=20; i++) {
			
			tempo=num1;
			num1=num1+num2;	
			num2=tempo;
			
			if(num1 <= 20){
				System.out.println(num1);
			}	
		}	
	}

}
