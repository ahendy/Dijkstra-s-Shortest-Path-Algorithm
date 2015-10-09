
public class test{

public static void main(String[] args){


	int[] distance = new int[10];
	

	distance[0] = 10;
	Vert testV = new Vert(1, distance);
	System.out.println("this is testV: "+ testV.distance[0]);

	testV.distance[0] = 69;
	System.out.println("this is distance[0]  after distance updated: " +distance[0] );
	System.out.println("value should be 69 ");
	distance[0] = 420;
	System.out.println("this is testV after testV.distance updated: "+ testV.distance[0]);

	System.out.println("value should be 420 ");




	}







public static class Vert{
		public boolean inTree;
		public int val;
		public int[] distance;
		//public int rank= 0;
		public Vert(int val,int[] distance){
			this.val = val;
			this.inTree = false;
			this.distance = distance;
			
		}
		

	}



}