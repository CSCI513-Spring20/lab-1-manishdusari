import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class WorldPopulation {

	SortStrategy sortStrategy;
	long[] population = new long[13484]; 
		
	public WorldPopulation(){
		sortStrategy = new BubbleSort();  // default
		
	}
	
	public void readInputFile(){
		population = readPopulationFile("Lab1\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	public long[] readPopulationFile(String fileName){
	   int counter = 0;
	   try {
		  FileReader inputFile = new FileReader(fileName);
		  BufferedReader reader = new BufferedReader(inputFile);
          String line;
		  // read each line
		  while((line = reader.readLine()) != null) {
		     StringTokenizer tokenizer = new StringTokenizer(line, ",");
		     tokenizer.nextToken(); 
		     tokenizer.nextToken();
		     String pop = tokenizer.nextToken();
		     long popCount = Long.parseLong(pop);
		     population[counter++]=popCount;
		  }
		  reader.close();
	    } catch (Exception e) {
		  e.printStackTrace();   
		}   
		
		return population;
	}
	
	public void sortPopulation(){		
		sortStrategy.getSortTime(population);

	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new InsertionSort()); 
		worldPopulation.sortPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new SelectionSort()); 
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(new BubbleSort());
		worldPopulation.sortPopulation();
		
		
	}

}
