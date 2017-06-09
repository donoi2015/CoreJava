package sort;

public class QuickSort2 {

	private int[] array;
	private int len;
	
	public static void main(String[] args) {

	}
	
	public void sort(int[] s){
		
		if(s==null || s.length<=1)
			return;
		this.array = s;
		len = s.length;
		sort2(0,len-1);
	}
	
	private void sort2(int lowIndex, int highIndex){
		int i = lowIndex;
		int j = highIndex;
		
		int pivot = array[lowIndex+(highIndex-lowIndex)/2];
		
		while (i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]<pivot){
				j--;
			}
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
		
		if(i<highIndex){
			sort2(i,highIndex);
		}
		if(lowIndex<j){
			sort2(lowIndex,j);
		}
		
	}
	
	private void swap(int i, int j){
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
