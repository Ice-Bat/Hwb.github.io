
public class MiGong{
	public static void main(String[] args){
		int map[][] = new int[9][9];
		//1. �ȴ����Թ����ö�ά�����ʾ int[][] map = new int[9][9];
		//2. �ȹ涨 map �����Ԫ��ֵ: 0 ��ʾ������ 1 ��ʾ�ϰ��� 
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
		System.out.println("====�Թ���ͼ====");
		for(int i =0;i < map.length;i++){
			for(int j = 0;j <map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("====Ѱ��·��====");
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
	//1. findWay��������ר�����ҳ��Թ���·��
	//2. ����ҵ����ͷ��� true ,���򷵻�false
	//3. map ���Ƕ�ά���飬����ʾ�Թ�
	//4. i,j ���������λ�ã���ʼ����λ��Ϊ(1,1)
	//5. ��Ϊ�����ǵݹ����·���������ȹ涨 map����ĸ���ֵ�ĺ���
	//   0 ��ʾ������ 1 ��ʾ�ϰ��� 2 ��ʾ������ 3 ��ʾ�߹��������߲�ͨ����·
	//6. ��map[6][5] =2 ��˵���ҵ�ͨ·,�Ϳ��Խ���������ͼ�����.
	//7. ��ȷ��������·���� ��->��->��->��
	public boolean findway(int map[][],int i,int j){
		if(map[7][7] == 2){ 			 		//�ݹ���ֹ����
			return true;
		} else {								//
			if(map[i][j] == 0){					//���Ϊ��
				map[i][j] = 2;					//����裬��·�����ߣ���else
				if(findway(map,i+1,j)){			//�ݹ飬����
					return true;
				} else if(findway(map,i,j+1)){  //�ݹ飬����
					return true;
				} else if(findway(map,i-1,j)){  //�ݹ飬����
					return true;
				} else if(findway(map,i,j-1)){  //�ݹ飬����
					return true;
				} else{
					map[i][j] = 3;				//�������ҽԲ�Ϊ0������
					return false;				//������·�߲�ͨ������
				}
			} else{								//��if�������߲�ͨΪ3��
				return false;
			}
		}
	}
}
