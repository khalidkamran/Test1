package local;

public class SolidView implements ViewResolver{

	@Override
	public void getView() {
		System.out.println("This is the solid View");
		
	}

	@Override
	public void getViewData() {
		System.out.println("This is the solid View Data");
		
	}

	
}
