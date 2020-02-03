import java.util.Date;

public class BubbleSort implements SortStrategy {

	long msecsTime = 0; 
	@Override
	public long[] sort(long numbers[]) {
	
	  for (int i = (numbers.length - 1); i >= 0; i--)
	  {
		for (int j = 1; j <= i; j++)
		{
		    if (numbers[j-1] > numbers[j])
		    {
		        long temp = numbers[j-1];
		        numbers[j-1] = numbers[j];
		        numbers[j] = temp;
		    } 
		} 
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
		return "Bubble Sort";
	}

}
