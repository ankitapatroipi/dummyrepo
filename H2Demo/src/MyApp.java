/**
 * 
 */

/**
 * @author bok0
 *
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyApp myapp = new MyApp();
		myapp.execute();

	}
system.out.println("ok");
	private void execute() {
		// TODO Auto-generated method stub
		ManageRegistration manageRegistration = new ManageRegistration();
		manageRegistration.select();
		manageRegistration.update();
		manageRegistration.select();
		manageRegistration.delete();
		manageRegistration.select();
	}

}
