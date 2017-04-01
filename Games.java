package Game;

import java.util.ArrayList;

public class Games {
	private int ID;
	private String Referee;
	private ArrayList<String> players = new ArrayList<String>();
	final public static int MinAth = 4;
	final public static int MaxAth = 8;
	
	public int getID() {
	   return ID;
	   }
	
	public String getReferee() {
	      return Referee;
	   }
	

	public Games (int ID, String Referee, ArrayList<String> players){
		this.ID=ID;
		this.Referee=Referee;
		this.players=players;
	}
	public static int[] produceNum(int minNum, int maxNum, int numCount) {
		if (numCount > (maxNum - minNum + 1) || maxNum < minNum) {
            return null;
        }
         
        // 存放结果的数组
        int[] resultArr = new int[numCount];
         
        // count 记录已产生的随机数的个数
        int count = 0;
         
        while(count < numCount) {
             
            // 产生随机数
            int num = (int) (Math.random() * (maxNum - minNum)) + minNum;
             
            // flag 定义本次产生的随机数是否已在数组中
            boolean flag = true;
             
            // 遍历数组中已产生的随机数
            for (int i=0; i<count; i++) {
                 
                // 同本次产生的随机数最比较
                if (num == resultArr[i]) {
                     
                    // 如果已存在相同的值，则跳出for循环，继续外层的while循环，产生下一个随机数
                    flag = false;
                    break;
                }
            }
             
            // 如果本次产生的随机数在数组中不存在，则将该随机数存放在数组中
            if (flag) {
                resultArr[count] = num;
                 
                // 数组中已产生的随机数个数加1
                count++;
            }
        }
         
        return resultArr;
    }
	public static void check (int x, int y){
		if (x + y > MinAth){
			Driver.start = true;
		}
		else{
			System.out.println("Sorry, not enough players");
			Driver.start = false;
		}
	}
	
	
	
	public static void list (int IDnum) {
		String ID;
		if ( IDnum < 10) {
			ID = "S" + "0" + IDnum;
		}
		else {
		ID = "S" + IDnum;
		}
		System.out.println("GameID is " + ID);
	}
	
}
