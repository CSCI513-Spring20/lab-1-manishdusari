import java.util.Date;

public class SelectionSort implements SortStrategy {

	long msecsTime = 0; 
	@Override
	public long[] sort(long numbers[]) {
	  for (int i = 0; i < numbers.length-1; i++)
	  {
		 int min = i;
		 for (int j = i+1; j < numbers.length; j++)
			 if (numbers[j] < numbers[min]) 
				min = j;
		 long temp = numbers[i];
		 numbers[i] = numbers[min];
		 numbers[min] = temp;  	 
	   }
	  return numbers;
	}

	@Override
	public long getSortTime() {
		long currentTime = (new Date()).getTime();
		long totMSecs = (currentTime - msecsTime);
		return totMSecs;
	}

	@Override
	public void resetTimer() {
		  msecsTime = (new Date()).getTime();
	}

	@Override
	public String strategyName() {
		return "Selection Sort";
	}

}
