public class SelectionSort extends Swap implements SortingAlgorithm{
	Swap sw = new Swap();
	public void sort(int a[]){
		for (int i=0; i<a.length; i++){
			sw.swap(a, i, findMin(a, i));
		}
	}
	public int findMin(int []a, int start){
		int min = start;
		for (int i=start+1; i<a.length; i++){
			if (a[i]<a[min])
				min=i;
			
		}
		return min;
	}
}