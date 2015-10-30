package local;

public class HalfSolidView implements ViewResolver{

	@Override
	public void getView() {
		System.out.println("This is half solid view");
		System.out.println("This is Extra half solid view");
		
	}

}
