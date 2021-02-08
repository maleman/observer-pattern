package observer.generic;

import java.util.Arrays;
import java.util.HashMap;

public class ObserverDemo {

    public static void main(String...strings ) throws InterruptedException {
	
	SubjectList sjl = new SubjectList();
	
	sjl.attach(new ObserverOne());
	
	sjl.notifyUpdate(Arrays.asList("Mensaje 1","Mensaje 2"));
	
	SubjectHashMap subjectHashMap = new SubjectHashMap();
	subjectHashMap.attach(new ObserverOne());
	
	HashMap<Integer, String> hashMap = new HashMap<>();
	hashMap.put(1, "Actualizacion1");

	Thread.sleep(1000);
	
	subjectHashMap.notifyUpdate(hashMap);
    }
}
