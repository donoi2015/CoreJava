package algorithms.AlgorithmSimple;

import java.util.*;


class PowerSet {
	
	public static <T> List<Set<T>> powerSet(List<T> X) {
		List<Set<T>> P = new ArrayList<>();
		Set<T> S = new HashSet<>();
		P.add(S);
		if(X.isEmpty()) {
			return P;
		}
		else {
			while(!X.isEmpty()) {
				T f = X.remove(0);
				List<Set<T>> temp = new ArrayList<>();
				for(Set<T> x : P) {			
					temp.add(x);
				}
				for(Set<T> x : temp) {
					S = new HashSet<>();
					S.add(f);
					S.addAll(x);
					P.add(S);					
				}					
			}			
		}
		return P;	
	}
}
