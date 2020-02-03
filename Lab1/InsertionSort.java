import java.util.Date;

public class InsertionSort implements SortStrategy {

	long msecsTime = 0; 
	@Override
	public long[] sort(long numbers[]) {
	
		for (int i=1; i < numbers.length; i++)
		   {
		      long index = numbers[i]; int j = i;
		      while (j > 0 && numbers[j-1] > index)
		      {
		           numbers[j] =numbers[j-1];
		           j--;
		      }
		      numbers[j] = index;
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
		return "Insertion Sort";
	}

}
