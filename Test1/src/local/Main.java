package local;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the template project");
		
		ViewResolver view = new SolidView();
		
		view.getView();
		
		System.out.println("*******************");
		System.out.println("This is the second data");
		int sum = 0;
		for(int i = 0; i < 10; i++){
			sum += i * i;
		}
		System.out.println("Sum : " + sum);
		System.out.println("*******************");
		System.out.println("This is the view Data");
		view.getViewData();
	}

}
