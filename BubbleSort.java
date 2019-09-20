public class BubbleSort extends Swap implements SortingAlgorithm{
	Swap sw = new Swap();
	public void sort(int a[]){
		for (int j=0; j<a.length; j++){
			for (int i=0; i<a.length-1-j; i++){
				if (a[i]>a[i+1])
					sw.swap(a, i, i+1);
			}
		}
	}
}