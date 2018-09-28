package com.collectios.basics;

public class Hello {

	 private int i;
	 String s ;
	
	 public Hello(){}
	 public Hello(int i, String s) {
		this.i = i;
		this.s = s;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}*/
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Hello other = (Hello) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	 
*/	 
	 
	
}
