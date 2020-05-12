import java.util.ArrayList;

public class MainHelper{

	void showData(ArrayList<Data> dataList){
		if( dataList.isEmpty() ){
			System.out.println("		|No data exists!|				");
		} else {
			for (int i = 0; i < dataList.size() ; i++ ) {
				String output = String.format("|%2d|%16s|%15s|%14s|", i+1, dataList.get(i).getName(), dataList.get(i).getPass(), dataList.get(i).getPhone() );
				System.out.println(output);
			}
			System.out.println("======================================================");
		}
	}

	void deleteData(ArrayList<Data> dataList, int a ){
		dataList.remove(a);
	}

	void printHeader(){
		System.out.println("======================================================");
		System.out.println("|No|		Name|		Pass|	 Phone		");
		System.out.println("|=====================================================");
	}

	void showMenu(){
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Exit");
	}

}