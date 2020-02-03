  public interface SortStrategy{
	void getSortTime(long []ar);

	void resetTimer();

	String strategyName();

	long[] sort(long[] population);

	String getSortTime();
}