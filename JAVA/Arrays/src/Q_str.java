

public class Q_str {
	
	int [] arr = new int [10];
	int a = 0;
	int b = 0;
	public void insert_Q(int e){
		if (b > arr.length-1){
			System.out.println("Element can not be inserted as the queue is full");
		}
		else if ( a == b || b <= arr.length -1 ){
			arr[b] = e;
			b++;
			System.out.println(e+" inserted at index "+b);
			}
		
	}
	
	public void remove_Q(){
		if(a==b){
			System.out.println("Queue is empty");
			//return 0;
		}
		else{
			int temp = arr[a];
			for(int w = 0; w<b; w++){
				
				arr[w] = arr[w+1];
				System.out.println(temp+" removed");
			}
			
			b--;
			System.out.println(temp);
			
			
			
		}
	
	}
	
	public void Q_head(){
	}
}
