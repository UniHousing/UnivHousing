package test;
import java.util.*;
public class Solution{
    public static int[] twoSum(int[] numbers, int target){//**************static
		//creat Hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int index1, index2;
		for(int i = 0; i < numbers.length; i++){
			map.put(numbers[i], i+1);
			//put(key,value), here we make numbers to be the key and index to be the value
		}
		for(int i = 0; i < numbers.length; i++){
			index1 = i+1;
			int value = target - numbers[i];
			if(map.containsKey(value) && map.get(value) != index1){
				index2 = map.get(value);
			if(index1 < index2)
				return new int[] {index1,index2};
			else
				return new int[] {index2,index1};
			}
		}
		return new int[0];  //**************
	}


	public static void main(String args[]){//**************String args[]
		int[] array = {2,7,11,15};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(twoSum(array, 9)));
	}
}
