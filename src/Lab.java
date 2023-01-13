
public class Lab {

	public static void main(String[] args) {
		
		int age = 18;
		
		System.out.println(age >= 16);
		boolean hasLicense = true;
		
		if(age >= 16 && hasLicense) {
			System.out.println("You can drive");
		}else {
			System.out.println("You cannot drive");
		}
		
		double costOfMilk = 3.00;
		int thirstLevel = 2;
		
		if(costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		}else {
			System.out.println("No thanks");
		}
		
		int numberOfCookies = 23;
		int numberOfChildren = 6;
		
		int remainingCookies = numberOfCookies % numberOfChildren;
		
		if(remainingCookies ==0) {
			System.out.println("Sad Face");
		}else if(remainingCookies <2) {
			System.out.println("Yes!");
		}else if(remainingCookies < 5) {
			System.out.println("Whoohoooo!");
		}else if(remainingCookies >=5) {
			System.out.println("Jackpot!");
		}
		
		String loyaltyMemberStatus = "Gold";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "Silver":
				loyaltyMemberDiscount = 0.10;
			break;
			case "Gold":
				loyaltyMemberDiscount = 0.15;
			break;
			case "Platinum":
				loyaltyMemberDiscount = 0.25;
			break;
			default:
				loyaltyMemberDiscount = 0.0;
		}
		double billTotal = 343.74;
		double adjustedTotal = billTotal - (billTotal *loyaltyMemberDiscount);
		if(adjustedTotal > 500) {
			if(loyaltyMemberStatus == "Silver") {
				loyaltyMemberStatus = "Gold";
			}else if(loyaltyMemberStatus == "Gold") {
				loyaltyMemberStatus = "Platinum";
			}
		}
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		
		if(username == "Tommy123" && password == "12345") {
			System.out.println("Login Successful");
		}else {
			System.out.println("Access Denied");
		}
		for(int i = 0; i<=9; i++) {
			System.out.println(i);
		}
		for(int i =10; i >=0; i--) {
			System.out.println(i);
		}
		for(int i = 0; i <=100; i+=2) {
			System.out.println(i);
		}
		for(int i = 0; i <=100; i++) {
			if(i %2 ==0) {
				System.out.println(i + "EVEN");
			}else {
				System.out.println(i + "ODD");
			}
		}
		int i = 100;
		while(i >=0) {
			System.out.println(i % 3);
			i--;
		}

	}

}
