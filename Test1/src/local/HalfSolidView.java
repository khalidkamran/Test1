package local;

public class HalfSolidView implements ViewResolver{

	@Override
	public void getView() {
		System.out.println("This is half solid view");
		
	}

	@Override
	public void getViewData() {
		System.out.println("This is half solid view data");
		
	}

}
