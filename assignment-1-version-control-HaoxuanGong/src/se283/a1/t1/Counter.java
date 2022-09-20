package se283.a1.t1;

//This is an example (faulty) class to be used for A1 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	//method increments _ctr	
	public void increment() { 
		_ctr++; //faulty increment		
	}
	
	//method decrements _ctr
	public void decrement() { 
		_ctr--; //faulty decrement
	}
	
	//method resets _ctr
	public void reset() { 
		_ctr = 0; //faulty reset, _ctr should rather be 0 
	}
	
	//method multiplies _ctr by n
	public void multiplyBy(int multiplier) { 
		_multiplier = multiplier; //no fault here
		_ctr = _ctr * _multiplier; //no fault here
	}	
}
