
public class C01 {

	public static void main(String[] args) {
//		MServiceImpl mServiceImpl = new MServiceImpl();
//		mServiceImpl.selectAll();
//		mServiceImpl.selectOne();
//		mServiceImpl.update();
//		mServiceImpl.delete();

		MService mService = new MServiceImpl();
		mService.selectAll();
		mService.selectOne();
		mService.update();
		mService.delete();
	}

}
