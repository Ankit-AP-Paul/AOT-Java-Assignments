class Q2_Overloading2 {
	int add(int n1, int n2) {
		return n1+n2;
	}
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	float add(float f1 ,float f2) {
		return f1+f2;
	}
	public static void main(String[] args) {
		Q2_Overloading2 ob=new Q2_Overloading2();
		System.out.println("2+3="+ob.add(2,3));
		System.out.println("2+3+7="+ob.add(2,3,7));
		System.out.println("2.3+5.2="+ob.add(2.3f,5.2f));
	}
}
