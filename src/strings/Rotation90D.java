package strings;
import java.util.Arrays;

public class Rotation90D {
	public void rotate(int[][] matrix, int n){
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i < last; i++){
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];//left -> top
				matrix[last-offset][first] = matrix[last][last-offset];//bottom -> left
				matrix[last][last-offset] = matrix[i][last];//right -> bottom
				matrix[i][last] = top;//top -> right				
			}
		}
	}
	public static void main(String[] args){
		int[][] input = {{1,2,3,4},
						 {2,3,4,1},
						 {3,4,1,2},
						 {4,1,2,3}
						};
		for(int i = 0; i < 4; i++){
			System.out.println(Arrays.toString(input[i]));
		}
		Rotation90D solution = new Rotation90D();
		solution.rotate(input,4);
		for(int i = 0; i < 4; i++){
			System.out.println(Arrays.toString(input[i]));
		}
	}
}
