
public class MiGong{
	public static void main(String[] args){
		int map[][] = new int[9][9];
		//1. 先创建迷宫，用二维数组表示 int[][] map = new int[9][9];
		//2. 先规定 map 数组的元素值: 0 表示可以走 1 表示障碍物 
		for(int i = 0;i < 9;i++){
			map[0][i] = 1;
			map[8][i] = 1;
		}
		for(int i = 0;i < 9;i++){
			map[i][0] = 1;
			map[i][8] = 1;
		}
		map[2][2] = 1;
		map[3][1] = 1;
		map[3][2] = 1;
		System.out.println("====迷宫地图====");
		for(int i =0;i < map.length;i++){
			for(int j = 0;j <map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("====寻找路线====");
		M way = new M();
		way.findway(map,1,1);
		for(int i =0;i < map.length;i++){
			for(int j = 0;j <map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class M{
	//1. findWay方法就是专门来找出迷宫的路径
	//2. 如果找到，就返回 true ,否则返回false
	//3. map 就是二维数组，即表示迷宫
	//4. i,j 就是老鼠的位置，初始化的位置为(1,1)
	//5. 因为我们是递归的找路，所以我先规定 map数组的各个值的含义
	//   0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
	//6. 当map[6][5] =2 就说明找到通路,就可以结束，否则就继续找.
	//7. 先确定老鼠找路策略 下->右->上->左
	public boolean findway(int map[][],int i,int j){
		if(map[7][7] == 2){ 			 		//递归终止条件
			return true;
		} else {								//
			if(map[i][j] == 0){					//如果为零
				map[i][j] = 2;					//则假设，该路可以走，看else
				if(findway(map,i+1,j)){			//递归，向下
					return true;
				} else if(findway(map,i,j+1)){  //递归，向左
					return true;
				} else if(findway(map,i-1,j)){  //递归，向上
					return true;
				} else if(findway(map,i,j-1)){  //递归，向右
					return true;
				} else{
					map[i][j] = 3;				//上下左右皆不为0，回溯
					return false;				//表明该路走不通，回溯
				}
			} else{								//接if，表述走不通为3，
				return false;
			}
		}
	}
}
