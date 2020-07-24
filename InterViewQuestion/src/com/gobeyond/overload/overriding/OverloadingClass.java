package com.gobeyond.overload.overriding;

public class OverloadingClass {

	public void watchOverloadingVideo(String userId) {

		System.out.println(" Video Watch By : "+userId);

	}


	public void watchOverloadingVideo(Integer count) {

		System.out.println(" Video Watch Views : "+count);

	}
	
	
	public static void main(String a[]) {
		
		new OverloadingClass().watchOverloadingVideo(null);//The method watchOverloadingVideo(String) is ambiguous for the type OverloadingClass
		
		new OverloadingClass().watchOverloadingVideo(new OverloadingClass());//The method watchOverloadingVideo(String) in the type OverloadingClass is not applicable for the arguments (OverloadingClass)
		
	}
}
