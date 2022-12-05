package com.mc.b_encapsulation;

public class Coffee {
	
	//캡슐화 : 클래스 내부의 필드변수에 클래스 외부에서 직접적으로 접근하는 것을 막는것
//	 		   직접 접근을 막는 대신 getter/setter를 사용해 필드변수에 대한 접근 권한을 관ㄹ히ㅏㄴ다
	
	//getter만 만들면 ?        : 읽기만 가능
	//getter/setter를 만들면 ? : 읽고 쓰기가 모두 가능
	//안만들면 ?               : 읽고 쓰기 모두 불가능
	
	// 만약에 캡슐화가 없다면?
	// 외부에서 cost에  -100000000을 넣었을 때 방어할 방법이 있을까?
	// setter메서드를 사용하면. 값에대한 검증이 가능함
	
	
	
	
	private String name; 
	private int price;  
	private int cost;   
	private int stock;
	private int safetyStock;
	private int salesCnt;
	
	
	// getter/setter 메서드 사용법
		// getter : 필드변수의 값을 읽을때 사용 get + 필드변수명을 넣어야함   =>  getName()
		// setter : 필드변수의 값을 넣거나 수정할때 사용    set + 필드변수명 => setName(String name)
		// 우클릭 -> 소스->게터세터 ->셀렉트올 ->제너레이트 ㄱ
	
	
	
	public Coffee() {
		
	}
	
	public Coffee(String name, int price, int cost, int stock, int safetyStock, int salesCnt) {
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.stock = stock;
		this.safetyStock = safetyStock;
		this.salesCnt = salesCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) throws Exception {
		if(price < 0) {
			System.out.println("0이하의 값은 들어올 수 없습니다.");
			return;
		}
		this.price = price;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}

	public int getSalesCnt() {
		return salesCnt;
	}

	public void setSalesCnt(int salesCnt) {
		this.salesCnt = salesCnt;
	}

	
	
	
	
	
}
