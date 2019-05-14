package concurrent_assignment4.A;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Remember to move the 'ass4_images' folder to the root directory
 * of your project,
 * or write the absolute path to the folder in lines 23,35,27
 * in CarWorld.java. 
 * 
 * Use Semaphores to create a safe bridge (only 1 car on the bridge at 
 * the same time)
 * 
 * Pablo.Bermejo@uclm.es
 *
 */

public class TrafficController {

    final ReentrantLock traffic = new ReentrantLock(true);
    final Condition blues = traffic.newCondition();
    final Condition reds = traffic.newCondition();
    
    public void redEnters() {
        
    }

    public  void blueEnters() {
	
    }

     public  void blueExits() {
    	
    	 
    }

    public  void redExits() {

	

    }

}