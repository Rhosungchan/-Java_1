
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatrate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double devidend2 = income * 0.3;
		double decvidend3 = income * 0.2;
		
	
		System.out.println("Value of supply(공급가) : " + valueOfSupply);
		System.out.println("VAT(부가가치세) : " + vat);
		System.out.println("Total(총액) : " + total);
		System.out.println("Expense(비용) : " + expense);
		System.out.println("Income(소득) : " + income);
		System.out.println("Dividend(배분) 1 : " + dividend1); 
		System.out.println("Dividend(배분) 2 : " + devidend2);
		System.out.println("Dividend(배분) 3 : " + decvidend3);
        
        //<변수>
		//find,replace 기능 참고! - 값을 찾아 전체값을 수정한다. 
        
        // 변수만드는 기능 참고! 
        // 1) Refactor 기능을 활용하여 -(Extract Local variable) - Alt + shift + L
        // 2) 변수값을 기입한후 빨간선 위에 마우스 올려서 생성
		
		
	}

}
