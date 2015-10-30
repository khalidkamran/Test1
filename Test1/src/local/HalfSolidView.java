package local;

public class HalfSolidView implements ViewResolver{

	@Override
	public void getView() {
		for(int i = 0; i < 5; i++){
			System.out.println("This is half solid view " + i);
			System.out.println("This is Extra half solid view " + i);
			
		}
	}

	@Override
	public void getViewData() {
		System.out.println("This is half solid view data");
		
	}

}
