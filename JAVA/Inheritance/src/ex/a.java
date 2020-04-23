package ex;

class a {

	
	public int num = 2;
	
	public static void main(String[] args) {
		c ref1 = new c();
		b ref2 = ref1;
		a ref3 = ref2;
		
		System.out.println("c ref" + ref1.num);
		System.out.println("b ref" + ref2.num);
		System.out.println("a ref" + ref3.num);

	}

}

class b extends a{
	int num = 3;
}

class c extends b{
	int num = 4;
}
